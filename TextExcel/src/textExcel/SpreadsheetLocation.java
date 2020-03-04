package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
    private int row;
    private int col;
	@Override
    public int getRow() {
        // TODO Auto-generated method stub
        return row;
    }

    @Override
    public int getCol() {
        // TODO Auto-generated method stub
        return col;
    }
    
    public SpreadsheetLocation(String cellName) {
        // TODO: Fill this out with your own code
    	cellName.toUpperCase();
    	char letter = cellName.charAt(0);
    	int lettertoint = letter - 'A';
    	String tobecol = cellName.substring(1);
    	int number = Integer.parseInt(tobecol);
    	this.row = lettertoint;
    	this.col = number - 1;
    }
}
