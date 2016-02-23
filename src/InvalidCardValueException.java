
public class InvalidCardValueException
{
	private int invalidValue;
	
	public InvalidCardValueException(int invalidValue)
	{
		this.invalidValue = invalidValue;
	}
	
	@SuppressWarnings("unused")
	private InvalidCardValueException() {}
	
	public String toString()
	{
		return "Attempted to create card with invalid value argument " + this.invalidValue;
	}
	
	public int getValue()
	{
		return this.invalidValue;
	}
}
