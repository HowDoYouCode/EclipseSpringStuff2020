package fracCalc;

public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;
	private String sign;
	
	public Fraction(int whole, int numerator, int denominator){
		setwhole(whole);
		setnumerator(numerator);
		setdenominator(denominator);
	}
	public void setwhole(int whole) {
		this.whole=whole;
	}
	public int getwhole() {
		return whole;
	}
	public void setnumerator(int numerator) {
		this.numerator=numerator;
	}
	public int getnumerator() {
		return numerator;
	}
	public void setdenominator(int denominator) {
		this.denominator=denominator;
	}
	public int getdenominator() {
		return denominator;
	}
	public void setsign(String sign) {
		this.sign=sign;
	}
	public String getsign() {
		return sign;
	} 
	public int toImproperFraction(int numerator, int denominator, int whole) {
		if (whole < 0) {
			numerator = denominator * whole - numerator;
		} else {
			numerator = denominator * whole + numerator;
		}
		this.whole = 0;
		return numerator;
	}
	public String toMixedNum(int numerator, int commondenominator) {
		int whole = numerator/commondenominator;
		int tempnumer = numerator % commondenominator;
		if (absValue(tempnumer)==0 && absValue(commondenominator)==1) {
			return whole+"";
		} else if (whole==0) {
			return tempnumer + "/" + absValue(commondenominator);
		}
		return whole + "_" + absValue(tempnumer) + "/" + absValue(commondenominator);
	}
	public int gcf(int num, int num2) {
		while (num2 != 0) {
			int temp = num;
			num = num2;
			num2 = temp % num2;
		}
		double a = (double)num;
		absValue(a);
		num=(int)a;
		return num;
	}
	public int absValue(int num) {
		if (num < 0) {
			return -num;
		} else { 
			return num;
		}
	}
	public double absValue(double num) {
		if (num < 0) {
			return -num;
		} else {
			return num;
		}
	}
	public String reduceAnswer(int numerator, int commondenominator) {
		int tempnum = numerator;
		int tempdenom = commondenominator;
		int temp = gcf(tempnum, commondenominator);
		tempnum = tempnum/temp;
		tempdenom = tempdenom/temp;
		return toMixedNum(tempnum, tempdenom);
	}
	public String add(int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2) {
		int commondenominator = denominator * denominator2;
		if (numerator==0 && numerator2==0) {
			return (whole + whole2 + "");
		} if (denominator2==1) {
			return reduceAnswer(numerator += numerator2 * denominator, commondenominator);
		} else if (denominator==1) {
			return reduceAnswer(numerator2 += (numerator * denominator2),commondenominator );
		}
		return reduceAnswer((numerator * denominator2) + (numerator2 * denominator), commondenominator);
	}
	public String subtract (int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2) {
		int commondenominator = denominator * denominator2;
		if (denominator == 1) {
			return reduceAnswer(numerator - (numerator * denominator), commondenominator);
		} else if (denominator2 == 1) {
			return reduceAnswer((numerator2 * denominator) - numerator, commondenominator);
		}
		return reduceAnswer((numerator * denominator2) - (numerator2 * denominator), commondenominator);
	}
	public String divide (int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2) {
		
	}
	public String multiply (int whole, int numerator, int denominator, int whole2, int numerator2, int denominator2) {
		
	}
}
