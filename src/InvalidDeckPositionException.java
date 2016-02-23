
public class InvalidDeckPositionException
{
	private int invalidDeckPosition;
	
	public InvalidDeckPositionException(int invalidDeckPosition)
	{
		this.invalidDeckPosition = invalidDeckPosition;
	}
	
	@SuppressWarnings("unused")
	private InvalidDeckPositionException() {}
	
	public String toString()
	{
		return "Attempted to create card with invalid value argument " + this.invalidDeckPosition;
	}
	
	public int getPositionValue()
	{
		return this.invalidDeckPosition;
	}
}
