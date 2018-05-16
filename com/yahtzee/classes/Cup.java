package com.yahtzee.classes;

import static com.yahtzee.Yahtzee.*;

public class Cup {
	private static Dice[] diceArray = new Dice[NUM_OF_DICE];

	public Cup() {
		for(int i=0;i<diceArray.length;i++) {
		diceArray[i]=new Dice();
		}
	}
	public static void rollDices() {
		for(Dice d:diceArray) {
			d.rollDice();
		}
	}

}
