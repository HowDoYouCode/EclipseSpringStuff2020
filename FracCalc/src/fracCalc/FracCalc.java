package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner Userin = new Scanner(System.in);
    	String input = Userin.nextLine();
    	while (!input.contentEquals("quit")) {
    		System.out.print(produceAnswer(input));
    		input = Userin.nextLine();
    	}
    	Userin.close();
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
        // TODO: Implement this function to produce the solution to the input
        String[] split = input.split(" ");  // split into 3 part
        Fraction fraction1 = new Fraction(split[0]);  // first part fraction
        String sign = (split[1]);   // second part sign
        Fraction fraction2 = new Fraction(split[2]);  //second part fraction

        fraction1.domath(fraction2, sign); // pass it all in to do the math
        return fraction1.toString();  // make it actually readable not just @something
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
