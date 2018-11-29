import java.util.ArrayList;
import java.util.Scanner;
public class fishingGameSimulation {
	
	private static int dieValue;
	private static int points;
	private static int totalPoints;
	private static ArrayList <Integer> arrayListPoints = new ArrayList <Integer>();


	/** Takes in an integer raging from 1-6 and return the amount of points associated with that integer value;*/
	public static int itemsValue(int num) 
	{
		if(num == 1) 
		{
			points = 2;
		}
		if (num ==2) 
		{
			points =10;
		}
		if(num == 3) 
		{
			points =7;
		}
		if(num ==4) 
		{
			points= 2;
		}
		if(num == 5) 
		{
			points =50;
		}
		if(num == 6) 
		{
			points= 3;
		}
		return points;
			
	}
	
	/** Takes in an integer raging from 1-6 and return the item associated with that integer value*/
	public static String items(int num) 
	{
		String item ="";
		if(num ==1) 
		{
			item = "large fish"; 
		}
		if(num ==2) 
		{
			item= "pole";
		}
		if(num == 3) 
		{
			item = "bait";
		}
		if(num == 4)
		{
			item = "small fish";
		}
		if(num ==5) 
		{
			item = "shark";
		}
		if(num ==6)
		{
			item ="seaweed";
		}
			
		return item;
	}
	
	public static int randomDieNumber() 
	{		
		Die Game = new Die(6);

		Game.roll();
		 dieValue = Game.getValue();
		 return dieValue;
	}
	
	public static void storePoints() 
	{
		arrayListPoints.add(points);
	}
	

	public static void itemName() 
	{
		
	}
	
	public static void main(String [] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	
		// System.out.println("Enter p to start game ");
		 //String userChoice = scanner.next();
		
			
			randomDieNumber();
			itemsValue(dieValue);
			storePoints();
			String itemName = items(dieValue);
			System.out.println("you've caught a " + itemName);
			
	
		for(int index :arrayListPoints) 
		{
			totalPoints += index;
		}
		
		System.out.print("you're total points is " +totalPoints);
		scanner.close();
		arrayListPoints.clear();
		
	}
		
}
