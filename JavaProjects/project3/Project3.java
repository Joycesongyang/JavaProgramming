//Author: Yanchun Song

import java.util.Scanner;

public class Project4 
{
    
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
			
		// create variables
		String answer;
		int points = 0;
		
		// get input from users
		System.out.println("Answer yes or no to the following questions");
		System.out.println("I try to get away from people as soon as I can.");
		answer = input.nextLine();
		if (answer.equalsIgnoreCase("Yes"))
		{
			points = points + 1;
		}
		
		System.out.println("I am losing my sense of humor.");
		answer = input.nextLine();
		if (answer.equalsIgnoreCase("Yes"))
		{
			points = points + 1;
		}
		
		System.out.println("I feel tired most of the time.");
		answer = input.nextLine();
		if (answer.equalsIgnoreCase("Yes"))
		{
			points = points + 1;
		}
		
		// print out the result for user
		if (points == 0)
		{
			System.out.println("You're more exhausted than stressed out");
		}
		else if (points == 1)
		{
			System.out.println("You're beginning to stress out");
		}
		else if (points == 2)
		{
			System.out.println("You're possibly stressed out");
		}
		else if(points == 3)
		{
			System.out.println("You're probably stressed out");
		}
		else
		{
			System.out.println("Unanticipated case");
		}
		
		input.close();

	}

}
