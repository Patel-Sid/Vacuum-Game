/**
 * 
 */
package sprites;

import game.Constants;

/**
 * @author siddh
 *
 */
public class Dust extends Dirt {

	public Dust(int row, int column, int value){
		super(Constants.DUST, row, column, Constants.DUST_SCORE);
	}
}
