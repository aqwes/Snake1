package EX;

/**
 * This class start the program.
 * @author Dennis
 *
 */
public class Run {
	
	public static void main(String[] args){		

		Exempel ex = new Exempel();
		String path = "src/resources/Map.txt";
		ex.parseTextFile(path);
		Game game = new Game(ex);
	}

}
