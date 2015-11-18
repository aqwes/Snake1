package EX;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * This class handles the snake´s way trough the map. The move method revives
 * coordinates and the the following code makes the best possible way for the
 * snake
 * 
 * @author Dennis
 *
 */
public class Game {

	private Exempel ex;
	private Brick[][] brickArray;
	private List<Point> points = new ArrayList<Point>();
	private int end = 0;

	public Game(Exempel ex) {
		brickArray = ex.getBrickArray();

		brickArray[0][0].setVisited(true);
		points.add(new Point(0, 0));
		end++;
		move(0, 0);
		print();

	}

	/**
	 * Recursive method that moves the snake around the map.
	 * 
	 * @param x1
	 * @param y1
	 */
	public void move(int x1, int y1) {

		try {
			if (x1 + 1 < brickArray[1].length && brickArray[x1 + 1][y1].getIsObstacle() == false
					&& brickArray[x1 + 1][y1].getVisited() == false) {
				brickArray[x1 + 1][y1].setVisited(true);
				points.add(new Point(x1 + 1, y1));
				end++;
				move(x1 + 1, y1);
			}

			else if (y1 + 1 < brickArray.length && brickArray[x1][y1 + 1].getIsObstacle() == false
					&& brickArray[x1][y1 + 1].getVisited() == false) {

				brickArray[x1][y1 + 1].setVisited(true);
				points.add(new Point(x1, y1 + 1));
				end++;

				move(x1, y1 + 1);


		} else if (x1 > 0 && brickArray[x1 - 1][y1].getIsObstacle() == false
				&& brickArray[x1 - 1][y1].getVisited() == false) {
			
			brickArray[x1 - 1][y1].setVisited(true);
			points.add(new Point(x1 - 1, y1));
			
			end++;
			
			move(x1 - 1, y1);
		} else if (y1 > 0 && brickArray[x1][y1 - 1].getIsObstacle() == false
					&& brickArray[x1][y1 - 1].getVisited() == false) {

				brickArray[x1][y1 - 1].setVisited(true);
				points.add(new Point(x1, y1 - 1));
				end++;

				move(x1, y1 - 1);



			}
		} catch (ArrayIndexOutOfBoundsException exception) {

		}
	}

	/**
	 * Prints out the result
	 */
	public void print() {
		System.out.println("There were " + points.size() + " moves made this round." + "\n");
		System.out.println("-----------------------");

		for (int i = 0; i < points.size(); i++) {
			System.out.println("#" + points.get(i) + "#");
		}
		if (end == points.size()) {
			System.out.println("-----------------------");
			System.out.println("\n" + "The game is over!");
		}

	}

}
