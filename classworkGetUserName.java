/*
 * Author: Kade Lawson
 * 
 * Purpose: create an array that ask user for first, middle and last name then print user name.
 * 
 * 
 */
import java.util.Scanner;
import java.util.Arrays;

public class classworkGetUserName {
	
	/** This Method ask user to enter fist , middle and last name */
	public static String[]  getname() {
	Scanner sc = new Scanner(System.in);
	String[] myArray = new String[3];
	System.out.println("enter first name");
	myArray[0] = sc.next();
	System.out.println("enter middle name");
	myArray[1] = sc.next();
	System.out.println("enter last name");
	myArray[2] = sc.next();
	sc.close();
	
	return myArray;
	}
	/** This method display the value in an String array */
	static void displayName(String [] myArray) 
	{
	
	for(int index =0;index<myArray.length;++index) 
	{
		System.out.print(myArray[index] +" ");
	}

	}
	
	public static void main(String [] args) {
		String [] arrayName;
		arrayName = getname();
		displayName(arrayName);
		
	}
}
