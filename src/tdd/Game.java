package tdd;

public class Game {
	
	private int score = 0;
	
	public void roll(int nbQuilleTomber) {
		score+=nbQuilleTomber;
	}
	
	public void mutipleRolls(int nbRolls, int nbQuilleTomber) {
		
		for(int i=0; i<nbRolls; i++) {
			roll(nbQuilleTomber);
		}
	}
	
	public int scoreGame() {
		return score;
	}
	
	
}
