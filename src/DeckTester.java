/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] ranks1 = {"Jack", "10", "3"};
		String[] suits1 = {"Spades", "Hearts", "Diamonds"};
		int[] values1 = {11, 10, 3};

		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println(deck1);
		
		deck1.deal();
		
		System.out.println(deck1);
	}
}
