//Author: Yanchun Song
import java.lang.Math;

public class Project4 
{

	public static void main(String[] args) 
	{
		
		// create variables 
		int num1 = (int)(Math.random() * 10) + 1;
		int num2 = (int)(Math.random() * 10) + 1;
		int num3 = (int)(Math.random() * 10) + 1;

		final int THREE_MATCH = 50;
		final int TWO_MATCH = 3;
		final int THREE7 = 500;
		final int TWO7 = 15;
		final int NO_MATCH = -1;
		
		//print out spin result
		System.out.println("Your spin was " + num1 + " " + num2 + " " + num3 + ".");
		
		//calculate earned points
		if(num1 == num2 && num2 == num3)  //for three matched numbers
		{
			//this if condition is checking if all three numbers are 7
			if (num1 == 7)
			{
				System.out.println("You earned " + THREE7 + " points.");
			}
			else
			{
				System.out.println("You earned " + THREE_MATCH + " points.");
			}
		}
		
		else if(num1 == num2 || num2 == num3 || num3 == num1) //for two matched numbers
		{
			// this if condition is checking if the two matched numbers are 7
			if(((num1 == 7 || num2 == 7) && num3 == 7) || (num1 == 7 && num2 == 7))
			
			{
				System.out.println("You earned " + TWO7 + " points.");
			}
			else
			{
				System.out.println("You earned " + TWO_MATCH + " points.");
			}
		}
		else //for no matched numbers
		{
			System.out.println("You earned " + NO_MATCH + " points.");
		}

	}

}
