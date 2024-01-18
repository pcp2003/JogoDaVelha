import java.util.ArrayList;
import java.util.List;

import gameElements.GameElement;

public class Board {
	
	// Tamanho do grid
	public static final int GRID_HEIGHT = 3;
	public static final int GRID_WIDTH = 3;
	
	public List<GameElement> gameElements = new ArrayList<GameElement>();

		
	public Board () {
		
	}
	
	public static Board createBoard(){
		
		for(int y = 0; y != GRID_HEIGHT; y++){
			for(int x = 0; x != GRID_WIDTH; x++){
				
			}
		}
	}

}
