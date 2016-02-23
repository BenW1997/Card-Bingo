
public class Card
{
	private final char[] CARD_SUIT_CHARS = {'S', 'H', 'C', 'D'};
	private final String[] CARD_SUIT_NAMES = {"Spades", "Hearts", "Clubs", "Diamonds"};
	private int value; // 1-13, 1=Ace, 11=Jack, 12=Queen, 13=King
	private String suit; // Spades, Hearts, Clubs, Diamonds
	
	public Card(char suit, int value)
	{
		this.value = value;
		this.suit = String.valueOf(suit).toUpperCase();
	}

	@SuppressWarnings("unused")
	private Card()
	{
	}
	
	public String toString()
	{
		return this.getSuitDesignator() + " " + this.value;
	}

	public String getSuitName()
	{
		String inSuit = this.suit;
		String suitName = null;
		
		for(int i = 0; i < CARD_SUIT_CHARS.length; ++i)
		{
			if(this.suit.charAt(0) == CARD_SUIT_CHARS[i])
			{
				suitName = CARD_SUIT_NAMES[i];
				break;
			}
		}
		
		return suitName;
	}

	public char getSuitDesignator()
	{
		return this.suit.charAt(0);
	}

	// TODO Make a loop
	public String getValueName()
	{
		int value = this.value;
		String valueName = null;
		
		switch (value)
		{
		case 1:
			valueName = "Ace";
			break;
		case 2:
			valueName = "Two";
			break;
		case 3:
			valueName = "Three";
			break;
		case 4:
			valueName = "Four";
			break;
		case 5:
			valueName = "Five";
			break;
		case 6:
			valueName = "Six";
			break;
		case 7:
			valueName = "Seven";
			break;
		case 8:
			valueName = "Eight";
			break;
		case 9:
			valueName = "Nine";
			break;
		case 10:
			valueName = "Ten";
			break;
		case 11:
			valueName = "Jack";
			break;
		case 12:
			valueName = "Queen";
			break;
		case 13:
			valueName = "King";
			break;
		default:
			valueName = "Invalid Value";
			break;
		}

		return valueName;
	}

	public int getValue()
	{
		return this.value;
	}

	public boolean compareSuit(Card toCompare)
	{
		return this.getSuitDesignator() == toCompare.getSuitDesignator();
	}

	public boolean compareValue(Card toCompare)
	{
		return this.getValue() == toCompare.getValue();
	}

	public boolean compareTo(Card toCompare)
	{
		return this.compareSuit(toCompare) && this.compareValue(toCompare);
	}
}
