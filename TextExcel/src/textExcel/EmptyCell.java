package textExcel;

public class EmptyCell implements Cell {
	public String abbreviatedCellText() {
		return null;
	} // text for spreadsheet cell display, must be exactly length 10
	public String fullCellText() {
		return null;
	} // text for individual cell inspection, not truncated or padded
}
//*******************************************************
//DO NOT MODIFY THIS FILE!!!
//*******************************************************