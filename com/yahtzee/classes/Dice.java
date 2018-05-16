package com.yahtzee.classes;

import java.util.Random;

import com.yahtzee.Yahtzee;

public class Dice {

	private byte value;
	private Random rollingValue=new Random();
	
	public Dice() {
		value=(byte)((rollingValue.nextInt(6))+1);
	}
	private Dice(byte value) {
		this.value=value;
	}
	public static Dice getDice(byte value) {
		return new Dice(value);
	}
	public byte getValue() {
		return value;
	}
	public void rollDice() {
		value=(byte)((rollingValue.nextInt(6))+1);
	}
	
	public static void main(String[] args) {
		Dice d=new Dice();
		d.rollDice();
		System.out.println(d.getValue());
		
	}
}
