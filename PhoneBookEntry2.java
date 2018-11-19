/**
 * Author:Kade Lawson
 * 
 *Purpose: Create 5 PhoneBookEntry objects then print the contents of each object.
 * */

import java.util.ArrayList;
public class PhoneBookEntry2 {

	public static void main(String [] args) {
		
		//create an object of phonebookentry class
		PhoneBookEntry contact1 = new PhoneBookEntry("kade","4443543444");
		
		contact1.setName("kade");
		contact1.setNumber("4443543444");
		
		//create an object of phonebookentry class
		PhoneBookEntry contact2 = new PhoneBookEntry("kim","4447648444");
		
		contact2.setName("kim");
		contact2.setNumber("4447648444");
		
		//create an object of phonebookentry class
		PhoneBookEntry contact3 = new PhoneBookEntry("shay","4447547448");
		
		contact3.setName("shay");
		contact3.setNumber("4447547448");

		//create an object of phonebookentry class
		PhoneBookEntry contact4 = new PhoneBookEntry("shae","4445563444");
		
		contact4.setName("shae");
		contact4.setNumber("4445563444");

		//create an object of phonebookentry class
		PhoneBookEntry contact5 = new PhoneBookEntry("april","4443746444");
		
		contact5.setName("april");
		contact5.setNumber("4443746444");

		//creat an arraylist
		ArrayList <PhoneBookEntry> AL = new ArrayList<PhoneBookEntry>();
		
		//store phonebookentry object in arraylist Al
		AL.add(contact1);
		AL.add(contact2);
		AL.add(contact3);
		AL.add(contact4);
		AL.add(contact5);

		//loop through arraylist and use phonebookentry print method to display information in each object
		for(int index =0;index<AL.size();++index) {
			
			AL.get(index).print();

		}

		
	}
}
