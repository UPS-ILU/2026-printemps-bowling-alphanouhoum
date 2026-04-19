package tdd;

import java.util.Iterator;

public class Game {
	
	private int score = 0;
	private int lancer = 1;
	private int[] tabScore = new int[20];
	private boolean spare = false;
	
	
	public void roll(int nbQuilleTomber) {
		if (spare) {
			score += nbQuilleTomber*2;
			spare = false;
		}else {
			score+=nbQuilleTomber;
		}
		
		if (lancer != 0 && lancer%2 == 0 ) {
			//System.out.println("Nb quille tomber = "+ nbQuilleTomber + " scoreprecedent = "+  tabScore[lancer-2] );
			if (nbQuilleTomber + tabScore[lancer-2] == 10) {
				spare = true;
			}else {
				spare = false;
			}
		}
		
		
		//System.out.println("Srore au lancer "+ lancer + " = "+ score);
		//System.out.println("Nb lancer ="+lancer+" "+spare);
		
		tabScore[lancer-1] = nbQuilleTomber;
		
		lancer++;
	}
	
	
	
	
	
	public int scoreGame() {
		for (int i = 0; i < tabScore.length; i++) {
			System.out.print(tabScore[i] + ", ");
		}
		System.out.println();
		return score;
	}
	
	
}
