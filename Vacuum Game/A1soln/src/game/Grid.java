/**
 * 
 */
package game;

/**
 * Generic abstract class that defines a two dimensional grid of objects of type T,
 * where <T> is the type parameter.
 * @author siddh
 *
 */
public abstract class Grid<T> {
	
	public abstract T getCell(int row, int column);
	
	public abstract void setCell(int row, int column, T item);
	
	public abstract int getNumRows();
	
	public abstract int getNumColumns();
	
	public abstract int hashCode();
}