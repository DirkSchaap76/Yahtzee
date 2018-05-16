package com.yahtzee;
//abstract class
import com.yahtzee.classes.*;

public abstract class Yahtzee {
	public final static String[] upperArray = { "THREE OF A KIND", "FOUR OF A KIND", "FULL HOUSE", "SMALL sTRAIGHT",
	"CHANCE" };
	public static final String[] lowerArray = { "ONES", "TWOS", "THREES", "FOURS", "FIVES", "SIXES" };
	public static final byte NUM_OF_DICE = 5;
	public static final byte RUND = 13;
	protected static byte numOfRund;
	private static ScoreSheet scoreSheet;
	private Player player;

	protected void setScoreSheet() {
		scoreSheet = new ScoreSheet();
	}

	protected void setPlayer() {
		player = new Player();
	}

	public byte getNumOfRund() {
		return numOfRund;
	}

	public Player getPlayer() {
		return player;
	}

	public ScoreSheet getScoreSheet() {
		return scoreSheet;
	}

}
