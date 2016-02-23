
public class Player
{
	final int sizeOfDeck = 52;
	
	//private Hand hand = new Hand();
	private boolean[] cardFlipStatus = new boolean[sizeOfDeck];
	
	public Player()
	{
		for(int i = 0; i < cardFlipStatus.length; ++i)
		{
			cardFlipStatus[i] = false;
		}
	}
}
