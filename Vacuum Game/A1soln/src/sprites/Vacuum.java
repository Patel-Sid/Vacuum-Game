/**
 * 
 */
package sprites;

import game.Constants;

/**
 * Representation of a Vacuum
 * 
 * @author siddh
 *
 */
public class Vacuum extends Sprite {

	private int score = Constants.INIT_SCORE; // Score of the player
	private int capacity = Constants.CAPACITY; // Capacity of the vacuum
	private int fullness = Constants.EMPTY; // Checks whether the vacuum is full or not
	private Sprite under = new CleanHallway(this.getRow(),this.getColumn()); // Store's what is under the vacuum

	public Vacuum(char symbol, int row, int column, int capacity) {
		super(symbol, row, column);
		this.capacity = capacity;
	}

	/**
	 * Returns True if vacuum can clean more or False if it can't
	 * 
	 * @return whether the vacuum can clean any further, or false if it has
	 *         reached its capacity
	 */
	public boolean clean(int score) {
		if ((fullness == capacity) | getUnder().equals(Constants.CLEAN)){ // Check to see if the vacuum is full
			return false;
		} else {
			fullness += Constants.FULLNESS_INC; // If it's not full then increase its fullness	
			if (score == Constants.DUST_SCORE){		
			this.score += Constants.DUST_SCORE; // Add the value of the Sprite that just got cleaned onto score
			} 
			else{
				this.score += Constants.DUST_BALL_SCORE;
			}
			CleanHallway cleaned = new CleanHallway(this.getRow(),this.getColumn());
			setUnder(cleaned);
			return true;
		}
	}
	
	/**
	 * This will update the coordinates of the Vacuum
	 * @param row the row number of vacuum
	 * @param column the column number of vacuum
	 */
	public void moveTo(int row, int column) {
		this.updateCoordinates(row, column);
	}
	
	/**
	 * Empty the vacuum
	 */
	public void empty() {
		fullness = Constants.EMPTY;
	}

	/**
	 * Return the under
	 * @return the under
	 */
	public Sprite getUnder() {
		return under;
	}

	/**
	 * The under to set
	 * @param under the under to set
	 */
	public void setUnder(Sprite under) {
		this.under = under;
	}

	/**
	 * Return the score
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	

}
