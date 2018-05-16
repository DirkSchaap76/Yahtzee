package program;

public class Cup {
	private Die[] cuppedDice;

	public Cup() {
		cuppedDice = new Die[5];

		for (int i = 0; i < cuppedDice.length; i++) {
			cuppedDice[i] = new Die();
		}
	}

	void throwDice() {
		System.out.println("");

	}
	public void rollDice() {
		for(Die d:cuppedDice) {
			d.roll();
		}
	}

	public static void main(String[] args) {
		Cup cup = new Cup();

		for (Die d : cup.cuppedDice) {
			System.out.println(d.getValue());
		}
	}
}
