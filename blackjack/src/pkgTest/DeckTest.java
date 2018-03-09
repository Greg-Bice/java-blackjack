package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Deck;

public class DeckTest {

	@Test
	public void TestDeck() throws Exception {
		
		Deck d1 = new Deck( 1 );
		Deck d2 = new Deck( 6 );
		
		assertEquals( d1.getSize(), 52 );
		assertEquals( d2.getSize(), 312 );
		
	}

}
