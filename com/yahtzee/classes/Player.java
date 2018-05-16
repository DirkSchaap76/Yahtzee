package com.yahtzee.classes;
import static com.yahtzee.Yahtzee.*;
public class Player {
	private Dice diceArray[];
	private static String name="You";
	
	public Player() {
		this(name);
	}
	public Player(String name) {
		Player.name=name;
		diceArray=new Dice[NUM_OF_DICE];
		for(int i=0;i<5;i++)
			diceArray[i]=new Dice();
	}
	public Dice[] doRulling() {
		for(int i=0;i<diceArray.length;i++) {
			diceArray[i]=new Dice();
		}
		return diceArray;
	}
	public Dice[] getDiceArray() {
		return diceArray;
	}
}
