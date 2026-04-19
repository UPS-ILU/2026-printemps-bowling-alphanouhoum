package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	private Game game;
	
	@BeforeEach
	void initialiserGame() {
		game = new Game();
	}
	
	@Test
	void entrerVide() {
		assertEquals(0, game.scoreGame());
	}
	
	@Test
	void twentyRollOfZero() {
		game.mutipleRolls(20, 0); 
		assertEquals(0, game.scoreGame()); //roll 20 fois 0
	}
	
	@Test
	void twentyRollOfOne() {
		game.mutipleRolls(20, 1); //roll 20 fois 1
		assertEquals(20, game.scoreGame()); 
	}
	
	@Test
	void scoreThirty() {
		game.mutipleRolls(10, 1); //roll 10 fois 1
		game.mutipleRolls(10, 2); //roll 10 fois 2
		assertEquals(30, game.scoreGame());
	}
	
	

}
