package textExcel;

import java.io.FileNotFoundException;
import java.util.*;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
	    // Add your command loop here
		Scanner userinput = new Scanner(System.in);
		String input = userinput.nextLine();
		Spreadsheet command = new Spreadsheet();
		while (!input.equalsIgnoreCase("quit")) {
			command.processCommand(input);
			input = userinput.nextLine();
		}
		userinput.close();
	}
}
