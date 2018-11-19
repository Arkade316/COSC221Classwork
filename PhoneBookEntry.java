
/**
 * Create a program name PhoneBookEntry that takes a person name and number. 
 * Program should have a constructor and mutator methods 
 * @author kadelawson
 *
 */
public class PhoneBookEntry{
	
	public  String name;
	public  String number;
	
	/**class constructor */
	PhoneBookEntry(String na, String nu)
	{
		 this.name = na;
		 this.number = nu;
		
	}
	
	/** set user's name*/
	public void setName(String name) 
		{
		 	this.name = name;
		}
	 
	/** set user's number */
	 public void setNumber(String number) 
	 	{
		 this.number = number;
			
			
	 	}
		
	/** get user's  name*/
	public  String getName()
		{
		
		return name;
		}
	
	
	/**get user's  number */
	public  String getNumber() 
		{
		
		return number;
		}
	
	public void print() 
		{
		
			System.out.println(this.getName() + ": " + this.getNumber());
		}
	
	
	  
	
	
}