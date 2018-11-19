/**
 * Author: Kade Lawson
 * 
 * Purpose: create a program that find and print the lowest and highest number in an Array
 * */

public class classworkHighestLowestArrayNum {

	
	private static int [] myArray = {2,7,4,3,2,9,6};
	private static int highestNum;
	private static int lowestNum;
	
	
	/** This method find the highest value in an Array and return that value*/
	 static int getHighestValue(){
		
		for(int index = 0;index<myArray.length;++index) {
			if(myArray[myArray.length-1]<myArray[index]) {
				highestNum = myArray[index];
			}
			
		}
		return highestNum;
	}
	/** This method find the lowest value in an Array and return that value */
	 static int getLowestValue() {
		for(int index =0; index<myArray.length;++index) {
			if(myArray[myArray.length-1]>myArray[index]) {
				lowestNum = myArray[index];
			}
		}
		return lowestNum;
	}
	
	/** This method print the highest value in the array*/
	 static void printHighestValue() {
		
		int highvalue = getHighestValue();
		System.out.println("Highest value: " +highvalue);
	}
	 /** This method print the lowest value in the array*/
	 static void printLowestValue() 
	{
		int lowestValue = getLowestValue();
		System.out.println("Lowest value: " +lowestValue);
	}
		
		
	
	
	public static void main(String [] args) {
		
		printHighestValue();
		printLowestValue();
		
	}
	
	
}
