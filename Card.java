package war;

/**
 * Card class to create each card
 * @author rayta
 *
 */
public class Card {
	private String suit;
	private int rank;
	
	/**
	 * Constructs empty card
	 */
	public Card() {
		suit = "";
		rank = 0;
	}
	
	/**
	 * Constructs class by passing suit and rank
	 * @param suit
	 * @param rank
	 */
	public Card(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	/**
	 * Gets the suit of the card
	 * @return suit
	 */
	public String getSuit() {
		return suit;
	}
	
	/**
	 * Gets the rank of the card
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}
	
	/**
	 * Converts the card into String format
	 * @return card information in the format of "rank of suit"
	 */
	@Override
	public String toString() {
		if (rank == 1) {
			return "Ace of " + suit;
		}else if(rank == 11) {
			return "Jack of " + suit;
		}else if(rank == 12) {
			return "Queen of " + suit;
		}else if(rank == 13) {
			return "King of " + suit;
		}
		return rank + " of " + suit;
	}
	
	
}
