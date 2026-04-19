package tdd;

import java.util.Iterator;

public class Game {
	
	 private int[] tabScore = new int[30]; // max 30 lancers
	 private int lancer = 0;

	 public void roll(int nbQuilleTomber) {
		 tabScore[lancer] = nbQuilleTomber;
		 lancer++;
	 }
	
	
	public int scoreGame() {
		int score = 0;
		int indexLancer = 0;
		for (int tour = 0; tour < 10; tour++) {
			//Strike
			if (tabScore[indexLancer] == 10) {
				score += 10 + tabScore[indexLancer+1] + tabScore[indexLancer+2];
				indexLancer+= 1;
			//spare
			} else if (tabScore[indexLancer] + tabScore[indexLancer+1] == 10) {
				score += 10 + tabScore[indexLancer+2];
				indexLancer += 2;
			} else {
				score += tabScore[indexLancer] + tabScore[indexLancer+1];
				indexLancer+=2;
				
			}
		}
		
		return score;
	}
	
	
}
