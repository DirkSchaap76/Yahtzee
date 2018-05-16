package program;

public class Player {
	private String name;
	private Cup playerCup;
	public static final byte MAX_THROWS = 3;
	private static Die[] tempArray;
	static byte counter=0;
	private byte  total=0;
	public Player() {

		name = "Player";
		playerCup = new Cup();

	}
	
	public void lockDie() {
		//collect input from play in tempArray
	}
	
	public byte sum(Die[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			total+=arr[i].getValue();
		}
		return total;
	}
	public void doRoll(Die[] diceArray) {
		if(counter<3) {
			sum(diceArray);
		}
			
		counter++; 
	}

}

// die 1 = 3
// die 2 = 3
// die 3 = 1


