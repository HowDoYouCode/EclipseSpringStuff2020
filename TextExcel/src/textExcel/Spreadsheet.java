package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	private Cell[][] cells= new Cell[20][12];
	private int rows;
	private int cols;
	
	public Spreadsheet() {
		rows = 20;
		cols = 12;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				cells[i][j] = new EmptyCell();
			}
		} 
	}
	@Override
	public String processCommand(String command) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return rows;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return cols;
	}

	@Override
	public Cell getCell(Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText() {
		// TODO Auto-generated method stub
		return null;
	}
}
