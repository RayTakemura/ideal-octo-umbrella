package war;
import java.util.ArrayList;
import java.lang.Math;

/**
 * Deck class that store cards in ArrayList and 
 * can do things that deck of cards can do (shuffling, splitting, etc.)
 * @author Ray Takemura
 *
 */
public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		for (int i = 1; i < 14; i++) {
			deck.add(new Card ("Clubs", i));
			deck.add(new Card ("Spades", i));
			deck.add(new Card ("Hearts", i));
			deck.add(new Card ("Diamonds", i));
		}
	}
	
	/**
	 * Get the entire deck available
	 * @return deck
	 */
	public ArrayList<Card> getDeck(){
		return deck;
	}
	
	/**
	 * Splits the whole deck into two even stacks.
	 * @return half of the deck
	 */
	public ArrayList<Card> split(){
		ArrayList<Card> half = new ArrayList <Card>();
		for(int i = 0; i < 26; i++) {
			half.add(deck.remove(i));
		}
		return half;
	}
	
	/**
	 * Shuffles the whole deck
	 */
	public void shuffle() {
		Card stored = new Card();
		for (int i = 0; i < 300 ; i++) {
			int random = (int) (Math.random() * 52);
			stored = deck.remove(random);
			deck.add(stored);
		}
	}
	
	public void add(Card card) {
		deck.add(card);
		//deck.add(deck.deal);
	}
	

	
	
}
