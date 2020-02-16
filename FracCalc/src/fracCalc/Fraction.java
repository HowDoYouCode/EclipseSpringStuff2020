package fracCalc;

public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;
	private String sign;
	private boolean isnegative = false;
	
	public Fraction(){
		this.whole = 0;
		this.numerator = 0;
		this.denominator = 1;
	}
	public Fraction(String fraction) { //overload, take string of the fraction from the array in fraccal.
		int[] fractionint = split(fraction);
		this.whole = fractionint[0];
		this.numerator = fractionint[1];
		this.denominator = fractionint[2];
	}
	public void setwhole(int whole) {  //setter
		this.whole = whole;
	}
	public void setnumerator(int numerator) {  //setter 
		this.numerator = numerator;
	}
	public void setdenominator(int denominator) {  //setter
		this.denominator = denominator;
	}
	public void setsign(String sign) {
		this.sign = sign;
	}
	public int getwhole() {  //getter
		return whole;
	}
	public int getnumerator() {  //getter
		return numerator;
	}
	public int getdenominator() {  //getter
		return denominator;
	}
	public String getsign() {
		return sign;
	} 
	public void toImproperFraction() {
		if (whole != absValue(whole)) {
			numerator = numerator - (whole * denominator);
			numerator = -numerator;
			whole = 0;
		} else {
			numerator = numerator + (whole * denominator);
			whole = 0;
		}
	}
	public static int[] split(String str) {
    	int[] split = {0,0,1}; // whole, numerator, denominator
    	if (str.indexOf("_") == -1 && str.indexOf("/") == -1) { // check for whole
        	split[0] = Integer.parseInt(str); // whole
      
        } else if (str.indexOf("_") == -1) { // fraction only
        	String[] answer = str.split("/");
        	
        	split[1] = Integer.parseInt(answer[0]); // numerator
        	split[2] =Integer.parseInt( answer[1]); // denominator
       	} else { // both whole and fraction
        	String[] answer = str.split("_");
        	split[0] = Integer.parseInt(answer[0]); //whole
        	String[] ators = answer[1].split("/");
        	split[1] = Integer.parseInt(ators[0]); // numerator
        	split[2] = Integer.parseInt(ators[1]); // denominator
        }
    	return split;
	}
	public void toMixedNum() {
		this.whole = this.numerator/this.denominator;
		this.numerator = this.numerator % this.denominator;
		if (this.denominator != absValue(this.denominator) || this.whole != absValue(this.whole) || this.numerator != absValue(this.numerator)) {  // if ANYTHING is not positive
			this.isnegative = true;
		} else {
		 this.isnegative = false;	
		}
	}
	public int gcf(int numerator, int commondenominator) {
		while (commondenominator != 0) {
			int temp = numerator;
			numerator = commondenominator;
			commondenominator = temp % commondenominator;
		}
		double a = (double)numerator;
		absValue(a);
		numerator=(int)a;
		return numerator;
	}
	public int absValue(int num) {
		if (num < 0) {
			return -num;
		} else { 
			return num;
		}
	}
	public double absValue(double num) { //overloaded absValue
		if (num < 0) {
			return -num;
		} else {
			return num;
		}
	}
	public void reduceAnswer() {
		int num = gcf(this.numerator, this.denominator);
		this.numerator = this.numerator/num;
		this.denominator = this.denominator/num;
		toMixedNum();
	}
	public String toString() {
		if (this.isnegative == true) {
			if (absValue(numerator) == 0 && absValue(denominator) == 1) {
				return "-" + absValue(whole);
			} else if (absValue(whole) == 0) {
				return "-" + absValue(numerator) + "/" + absValue(denominator);
			}
			return "-" + absValue(whole) +"_"+ absValue(numerator) + "/" + absValue(denominator);
		} else {
			if (absValue(numerator) == 0 && absValue(denominator) == 1) {
				return whole+"";
			} else if (absValue(whole) == 0) {
				return absValue(numerator) + "/" + absValue(denominator);
			}
			return absValue(whole) +"_"+ absValue(numerator) + "/" + absValue(denominator);
		}
	}
	public void add(Fraction fraction) {
		fraction.toImproperFraction();
		toImproperFraction();
		this.numerator = (this.numerator * fraction.getdenominator()) + (fraction.getnumerator() * this.denominator);
		this.denominator = (this.denominator * fraction.getdenominator());
		reduceAnswer();
	}
	public void subtract (Fraction fraction) {
		fraction.toImproperFraction();
		toImproperFraction();
		this.numerator = (this.numerator * fraction.getdenominator()) - (fraction.getnumerator() * this.denominator);
		this.denominator = (this.denominator * fraction.getdenominator());
		reduceAnswer();
	}
	public void multiply (Fraction fraction) {
		fraction.toImproperFraction();
		toImproperFraction();
		this.numerator = this.numerator * fraction.getnumerator();
		this.denominator = this.denominator * fraction.getdenominator();
		reduceAnswer();
	}
	public void divide (Fraction fraction) {
		toImproperFraction();
		fraction.toImproperFraction();
		this.numerator = this.numerator * fraction.getdenominator();
		this.denominator = this.denominator * fraction.getnumerator();
		reduceAnswer();
	}
	public void domath(Fraction fraction, String sign) {
		setsign(sign);
		if (this.sign.equals("+")) {
			add(fraction);
		} else if(this.sign.equals("-")) {
			subtract(fraction);
		} else if(this.sign.equals("*")) {
			multiply(fraction);
		} else {
			divide(fraction);
		}
	}
}
