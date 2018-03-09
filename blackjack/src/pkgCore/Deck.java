package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.*;

public class Deck {

	private ArrayList<Card> deck = new ArrayList<Card>();
	
	
	public Deck() throws Exception {
		this(1);
	}
	
	public Deck( int numOfDecks ) throws Exception {
		
		if ( numOfDecks <= 0 ) {
			throw new Exception( "int numOfDecks must be >= 1" );
		}
		
		for ( int i = 0; i < numOfDecks; i++ ) {
			
			for ( eSuit suit : eSuit.values() ) {
				
				for ( eRank rank : eRank.values() ) {
					
					deck.add( new Card( rank, suit ) );
					
				}
				
			}
			
		}
		
		Collections.shuffle( this.deck );
		
	}
	
	public Card Draw() {

		return deck.remove( (int) Math.random() * deck.size() + 1 );
		
	}
	
	public int getSize() {
		return deck.size();
	}
	
}
