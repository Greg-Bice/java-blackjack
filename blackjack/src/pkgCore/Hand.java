package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		boolean hasAce = false;
		for (Card c: cards)
		{
			
			iScore[0] += c.getRank().getMin();
			if (c.getRank() == eRank.ACE ) { 
				hasAce = true;
			}
			
		}
		
		iScore[1] = (hasAce) ? iScore[0] + 10 : iScore[0];
		
		this.SetHandScore( iScore );
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		this.AddCard( d.Draw() );
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
	public boolean isBlackjack() {
		
		int[] iScore = ScoreHand();
		
		return ( ( iScore[1] == 21 ) && ( cards.size() == 2 ) );

	}
	
	public boolean bCanDealerHit() {
		boolean bDraw=false;
		for(int iScore : ScoreHand())
		{
			if (iScore>=17)
				return false;
		}
		return true;
	}
	
	public boolean bCanPlayerDrew() 
	{
		for (int iScore : ScoreHand())
		{
			if(iScore<21)
				return true;
		}
		
		return false;
		
	}
	
	public void SetHandScore( int[] Scores)
	{
		this.iScore = Scores[0];
		
		if( Scores[1]<=21 )
			iScore = Scores[1];
	}
		
}
