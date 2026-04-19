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
		for(int i=0; i<20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.scoreGame()); //roll 20 fois 0
	}
	
	@Test
	void twentyRollOfOne() {
		for(int i=0; i<20; i++) {
			game.roll(1);
		}				
		assertEquals(20, game.scoreGame()); 
	}
	
	@Test
	void scoreThirty() {
		for(int i=0; i<10; i++) {
			game.roll(1);
		}
		for(int i=0; i<10; i++) {
			game.roll(2);
		}
		assertEquals(30, game.scoreGame());
	}
	
	@Test
	void spare() {
		game.roll(7); //roll 7
		game.roll(3); //roll 3
		game.roll(4); //roll 4
		for(int i=0; i<17; i++) {
			game.roll(0);
		}
		assertEquals(18, game.scoreGame());
	}
	
	
	
	
	

}
