package GameState;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class GameStateManager {

	private ArrayList<GameState> gameStates;
	private int currentState;
	
	public static final int MENUSTATE = 0;
	public static final int LEVELSTATE = 1;
	
	public GameStateManager() {
		
		gameStates = new ArrayList<GameState>();
		
		currentState = 0;  // start at menu state
		gameStates.add(new MenuState(this));
		gameStates.add(new LevelState(this));
	}
	
	public void setState(int state) {
		currentState = state;
		gameStates.get(currentState).init();
	}
	
	public void update() {
		gameStates.get(currentState).update();
	}

	public void draw(Graphics2D g) {
		gameStates.get(currentState).draw(g);
	}
	
	public void keyPressed(int keyCode) {
		gameStates.get(currentState).keyPressed(keyCode);
	}

	public void keyReleased(int keyCode) {
		gameStates.get(currentState).keyReleased(keyCode);
	}



}
