package program;

import java.util.Random;

public class Die {

	private byte value;

	Random random = new Random();

	public Die() {
		value = (byte) (random.nextInt(6) + 1);

	}

	public Die roll() {
		return new Die();
	}

	public byte getValue() {
		return value;
	}

}
