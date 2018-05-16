package com.yahtzee.classes;

import com.yahtzee.Yahtzee;
import static com.yahtzee.classes.UserInput.*;
import static com.yahtzee.classes.ScoreSheet.*;
public class Rund extends Yahtzee {

	private static final byte TOTAL_Rolling=3;
	private static byte numOfRolling=TOTAL_Rolling;
	private static Dice[] sellectionDices=new Dice[NUM_OF_DICE];
	
	public Rund() {
		if(numOfRund<13) {
		setPlayer();
		setScoreSheet();
		numOfRund++;}
	}
	public void collectDice(Dice[] dices) {
		byte bInput=0;
		while(scan.hasNext()&&inputCounter<=5) {
		bInput=UserInput.getInput();
		
		for(int i=0; i<sellectionDices.length;i++) {
			if(sellectionDices[i]==null)
					sellectionDices[i]=dice;
			}
				}
	}
	public void setLowerScores() {
		for(ScoreSheet.Score s:lScores) {
			
		}
	}
	public static void main(String[] args) {
		Rund r1=new Rund();
		for(Dice d:r1.getPlayer().getDiceArray()) {
			System.out.println(d.getValue());
		}
	}
}
