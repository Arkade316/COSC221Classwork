/*
 * Author: Kade Lawson
 * 
 * Purpose: Create an Rock,paper,scissors game thats between a user and the computer.
 * The computer choice must be generated at random
 * Rock beats Scissors , Scissors beats Paper, Paper beats Rock and if They both choose the same thing then its a draw
 */

import java.util.NoSuchElementException;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class ChapterFive17 {
	
	
	
	/** This method randomly return a number from 1 to 3 */
	static int getRandomNumber() 
	{
		int computerNumber;
		Random rand = new Random();
		 computerNumber = rand.nextInt(3) +1;
		 return computerNumber;
	}
	
	/** This method take in an integer argument and return an String value based on the value of the argument*/
	static String computerDecision(int num) 
	{
		String computerChoice =null;
		
		if(num ==1) {
			computerChoice = "rock";
		}
		else if(num ==2) {
			computerChoice = "paper";
		}
		else if (num==3)
		{
			computerChoice = "scissors";
		}
	
		return computerChoice;
	}
	
	/** This method asks the user to enter an String value then return that value */
	static String getUserChoice() throws IOException
	{
		String userChoice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice. rock ,paper or scissors ");
		userChoice = scanner.next();
		scanner.close();
		
		return userChoice;
	}
	
	/** This method print the user's choice */
	static void printUserChoice(String choice) 
	{
		System.out.println("The user entered " + choice);
		
	}
	/** This merhod print the computer's choice*/
	static void printComputerChoice(String choice) {
		System.out.println("The computer choice is "+ choice);
	}
	
	/** This method decides who wins the game or if it's a draw and prints the result */
	static void whoWins(String userC,String computerC) throws Exception
	{
		
		
		if(userC.equals(computerC) ) 
		{
			System.out.println("Draw, play again");
		}
		else if(userC.equals("rock") && computerC.equals("scissors"))
		{
			System.out.println("User Wins");
		}
		else if(userC.equals("paper") && computerC.equals("rock"))
		{
			System.out.println("user Wins");

		}
		
		else if(userC.equals("scissors") && computerC.equals("rock"))
		{
			System.out.println("Computer wins");

		}
		else if(userC.equals("scissors") && computerC.equals("papper")) {
			System.out.println("Computer wins");
		}
		
		else if (userC.equals("rock") && computerC.equals("paper"))
		{
			System.out.println("Computer wins");

		}
		else if (userC.equals("paper") && computerC.equals("scissors"))
		{
			System.out.println("User Wins");
		}
		else 
		{
			System.out.println("You've enter a invalid value, program will be terminated");
			System.exit(1); // terminates program
		}
	
	}
	
	public static void main(String [] args) throws IOException , NoSuchElementException
	{
		
			
			//calls method getRandNumber and set its value to variable computer Number
			int computerNumber = getRandomNumber();
			
			
			//calls getUserChoice and save it's return value in as string called userChoice
			String userChoice =getUserChoice();
			
			
			//calls method computerDecision and save its return value in an String called computerChoice
			String computerChoice =computerDecision(computerNumber);
			
			
			//calls method printComputerChoice which prints the computer's choice , which is the string variable in it's argument
			printComputerChoice(computerChoice);
			
			
			//calls method printUserChoice which prints the user's choice based on the string in it's argument
			printUserChoice(userChoice);
			

			//try catch to handle exception
			try
			{
				//calls method whoWins and base on its argument prints who wins or if its a draw
				whoWins(userChoice,computerChoice);
			} catch (Exception e) {
				
			}
			
			
		
			
		
	}
	
	
}
