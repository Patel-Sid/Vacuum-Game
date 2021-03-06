/**
 * 
 */
package game;

import java.util.HashMap;
import java.util.Map;

/**
 * @author siddh
 *
 */
public class MapGrid<T> extends Grid<T> {
	
	private Map<Integer, Map<Integer, T>> grid = new HashMap<Integer, Map<Integer,T>>(); // Map representation of a Grid
	private int numRows;
	private int numColumns;
	
	public MapGrid(int numRows, int numColumns){
		this.numRows = numRows;
		this.numColumns = numColumns;
		
		for (int i = 0; i < numColumns; i++){
			Map<Integer,T> newgrid = new HashMap<>();
			grid.put(i, newgrid);
			for (int j = 0; j< numRows; j++){
				grid.get(i).put(j, null);
			}
		}
	}

	@Override
	public T getCell(int row, int column) {
		// TODO Auto-generated method stub
		return grid.get(row).get(column);
	}

	@Override
	public void setCell(int row, int column, T item) {
		// TODO Auto-generated method stub
		grid.get(row).put(column, item);
		
	}

	@Override
	public int getNumRows() {
		// TODO Auto-generated method stub
		return numRows;
	}

	@Override
	public int getNumColumns() {
		// TODO Auto-generated method stub
		return numColumns;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grid == null) ? 0 : grid.hashCode());
		result = prime * result + numColumns;
		result = prime * result + numRows;
		return result;
	}
}
