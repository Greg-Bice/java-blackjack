package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private eRank rank;
	private eSuit suit;
	
	public Card( eRank rank, eSuit suit ) {
		
		this.rank = rank;
		this.suit = suit;
		
	}
	
	public eRank getRank() {
		return rank;
	}


	public void setRank(eRank rank) {
		this.rank = rank;
	}


	public eSuit getSuit() {
		return suit;
	}


	public void setSuit(eSuit suit) {
		this.suit = suit;
	}	
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.getRank().compareTo(this.getRank());

	}
	
}
