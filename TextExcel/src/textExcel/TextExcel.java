package textExcel;

import java.io.FileNotFoundException;
import java.util.*;

// Update this file with your own code.

public class TextExcel {

	public static void main(String[] args) {
	    // Add your command loop here
		System.out.println("Welcome to TextExcel.");
		Scanner userinput = new Scanner(System.in);
		String input = userinput.nextLine();
		Spreadsheet sheet = new Spreadsheet();
		while (!input.equalsIgnoreCase("quit")) {
			System.out.println(sheet.processCommand(input));
			input = userinput.nextLine();
		}
		System.out.println("Shutting Down...");
		userinput.close();
	}
}