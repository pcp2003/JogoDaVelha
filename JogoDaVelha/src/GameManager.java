
public class GameManager {
	
	// Tamanho do grid
	public static final int GRID_HEIGHT = 3;
	public static final int GRID_WIDTH = 3;


	private static GameManager INSTANCE;
	private GameGUI gui;
	
	private GameManager() {
		
	}
	
	public static GameManager getInstance () {
		if (INSTANCE == null){
			INSTANCE = new GameManager();
		}
		return INSTANCE;
	}
}
