package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	private Cell[][] cells;
	private int rows;
	private int cols;
	
	public Spreadsheet() {
		this.rows = 20;
		this.cols = 12;
		int i = 0;
		while (i < this.rows) {
			int j = 0;
			while (j < this.cols) {
				cells[i][j] = new EmptyCell();
				j++;
			}
			i++;
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
