package program;

public class Score {
	private String name;
	private short value;
	private boolean checked;
	private static Score[] table;

	public static public final static String[] rowNames = { "ONES", "TWOS", "THREES", "FOURS", "FIVES", "SIXES", "SUM",
			"BONUS", "THREE OF A KIND", "FOUR OF A KIND", "FULL HOUSE", "SMALL STRAIGHT", "LARGE STRAIGHT", "CHANCE",
			"YAHTZEE", "TOTAL SCORE" };
	static {
		table = new Score[rowNames.length];
	}

	public Score() {

	}

	public Score[] getTable() {
		return table;
	}

	public Score(String name) {

		this.name = name;
		checked = false;
		value = 0;

	}

	public void setValue(short value) {
		// this
	}

	public String getName() {
		return name;
	}

	public short getValue() {
		return value;
	}

	public static void scoreSheet() {
		for (int i = 0; i < rowNames.length; i++) {
			table[i] = new Score(rowNames[i]);
		}

	}

	public static void main(String[] arg) {
		// Score score=new Score("");
		scoreSheet();
		for (Score s : table) {
			System.out.println(s.getValue() + s.getName());
		}
	}
}
