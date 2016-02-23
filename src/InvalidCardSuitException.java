
public class InvalidCardSuitException
{
	private char invalidSuit;
	
	public InvalidCardSuitException(char invalidSuit)
	{
		this.invalidSuit = Character.toString(invalidSuit).toUpperCase().charAt(0);
	}
	
	@SuppressWarnings("unused")
	private InvalidCardSuitException() {}
	
	public String toString()
	{
		return "Attempted to create card with invalid suit argument " + this.invalidSuit;
	}
	
	char getSuitDesginator()
	{
		return this.invalidSuit;
	}
}
