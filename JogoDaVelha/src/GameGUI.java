
public class GameGUI {
	
	private static GameGUI INSTANCE;
	
	
	
	private GameGUI () {
		
	}
	
	public static GameGUI getInstance () {
		if (INSTANCE == null){
			INSTANCE = new GameGUI();
		}
		return INSTANCE;
	}

}
