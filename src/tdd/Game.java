package tdd;

import java.util.Iterator;

public class Game {
	
	private int score = 0;
	private int scoreBonus = 0;
	private int lancer = 1;
	private int[] tabScore = new int[20];
	private boolean spare = false;
	private boolean strike = false;
	private int strikeTour;
	
	
	
	public void roll(int nbQuilleTomber) {
		tabScore[lancer-1] = nbQuilleTomber;
		
		if (strike && strikeTour != 0) {
			scoreBonus += nbQuilleTomber;
			strikeTour--;
			
		}else {
			score += scoreBonus;
			scoreBonus = 0;
			strike = false;
		}
		
		if (spare) {
			score += nbQuilleTomber*2;
			spare = false;
		}else {
			score += nbQuilleTomber;
			
		}
		
		
		
		
		/*Spare pour les deux lance lancer*/
		if (lancer%2 == 0 && nbQuilleTomber + tabScore[lancer-2] == 10) {
				spare = true;
			}
		
		
		/*Strike premier lancer*/
		if (lancer%2 != 0 && nbQuilleTomber == 10) {
				strike = true;
				strikeTour = 2; //Score x2 pour lees deux prochain tour
				lancer++;
			}
		
		
		//System.out.println("Quille Tomber = "+ nbQuilleTomber + " Strike ? "+ strike);
		//System.out.println("Srore au lancer "+ lancer + " = "+ score);
		//System.out.println("Nb lancer ="+lancer+" "+spare);
		
		
		
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
