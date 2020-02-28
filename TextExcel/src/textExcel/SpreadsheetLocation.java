package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
    private int rows;
    private int cols;
	@Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	cellName.toUpperCase();
    	char letter = cellName.charAt(0);
    	cellName.substring(1);
    	letter -= 'A';
    }

}
