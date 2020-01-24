package war;

public class War {

	public static void main(String[] args) {
		System.out.println("Let the war begin!");
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck.getDeck());
		System.out.println(deck.split());
		
		System.out.println(deck.getDeck());
		
	}

}
