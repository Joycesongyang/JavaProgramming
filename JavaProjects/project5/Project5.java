//Author : Yanchun Song

import java.util.Scanner;

public class Project6 {

	public static void main(String[] args) 
	{
		//declare a Scanner
		Scanner scnr = new Scanner(System.in);
		
		//create constant and accumulating variables
		final int EXIT = -1;
		int posChange = 0;
		int negChange = 0;
		int noChange = 0;
		int lastValue = 3;
		//using this variable to collect the number of times user enter a single setting
		int [] numChoose = new int[5];
		
		//prompt out the initial information for user
		System.out.println("Response Dial Simulator");
		System.out.println("-----------------------");
		System.out.println("Initial setting: " + lastValue);
		System.out.println("Enter the next setting (1-5) or -1 to stop.");
		int value = scnr.nextInt();
		
		//write the while loop for user to enter input
		while(value != EXIT)
		{
			//this is accumulating the number of chosen values
			numChoose[value - 1] += 1;
				
			//this if condition is to accumulate the number of changes in different directions
			if(value > lastValue)
			{
				System.out.println("Positive change: " + lastValue + " to " + value);
				posChange = posChange + 1;	
			}
			else if(value < lastValue)
			{
				System.out.println("Negative change: " + lastValue + " to " + value);	
				negChange = negChange + 1;
			}
			else
			{
				System.out.println("No change: " + lastValue + " to " + value);
				noChange = noChange + 1;
			}
	
			lastValue = value;
			System.out.println("Current setting: " + value);
			System.out.println("Enter the next setting (1-5) or -1 to stop.");
			value = scnr.nextInt();	
		}
		
		//print out the summary result
		System.out.println();
		System.out.println("Response Summary");
		System.out.println("----------------");

		//this for loop is printing out the chosen times for each digit
		for(int i = 0; i < numChoose.length; ++i)
		{
			System.out.println((i + 1) + " was chosen " + numChoose[i] + " time(s).");
		}
		
		System.out.println();
		System.out.println("Positive changes: " + posChange);
		System.out.println("Negative changes: " + negChange);
		System.out.println("No changes: " + noChange);
		
		scnr.close();

	}

}
