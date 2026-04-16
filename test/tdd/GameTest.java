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
	void twentyZeroRoll() {
		game.roll(20);
		assertEquals(0, game.scoreGame());
	}
	
	

}
