package EX;

/**
 * This class is made for checking which bricks that are obstacle and visited.
 * When a brick is visited I use setVisited so that we won´t visit that brick
 * again.
 * 
 * @author Dennis
 *
 */
public class Brick {
	private boolean visited, isObstacle;
	
	public void setIsObstacle(boolean isObstacle){
		this.isObstacle = isObstacle;
	}
	
	public boolean getIsObstacle(){
		return isObstacle;
	}
	
	public void setVisited(boolean visited){
		this.visited = visited;
	}
	
	public boolean getVisited(){
		return visited;
	}

}