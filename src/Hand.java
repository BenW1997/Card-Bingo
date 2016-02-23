import java.util.List;
import java.util.ArrayList;

public class Hand
{
	private List<Card> hand = new ArrayList<Card>();
	
	public Hand() {}
	
	public void addCard(Card card)
	{
		this.hand.add(card);
	}
	
	public Card getCard(int index)
	{
		return this.hand.get(index);
	}
	
	public void discardHand()
	{
		this.hand = new ArrayList<Card>();
	}
	
	public boolean hasCard(Card card)
	{
		return this.hand.contains(card);
	}
	
	public int sizeOf()
	{
		return this.hand.size();
	}
}
