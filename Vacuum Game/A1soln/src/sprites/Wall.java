/**
 * 
 */
package sprites;

import game.Constants;

/**
 * Representation of a wall
 * @author siddh
 *
 */
public class Wall extends Sprite{
	/**
	 * Create a wall
	 * @param row the index to set the row
	 * @param column the index to set the column
	 */
	public Wall(int row, int column) {
		super(Constants.WALL, row, column);
		
	}

}
