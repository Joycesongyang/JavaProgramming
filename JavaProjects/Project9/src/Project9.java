import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Project9
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//read in the file name from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file name:");
		String fileName = input.nextLine();
		
		//call methods to get the result
		String[] array = readFile(fileName);
		lowercase(array);
		System.out.println("Most popular movie: " +findMostFrequent(array));
		
		input.close();

	}

	public static String[] readFile(String filename) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(filename));
		
		//count movies in the file
		int count;
		for(count = 0; file.hasNextLine(); ++count)
		{
			file.nextLine();
		}
		
		file.close();
		
		//construct the string array
		file = new Scanner(new File(filename));
		String[] movieArray = new String[count];
		
		//read in all the movies into the perfect array
		for(int i = 0; file.hasNextLine() && i < movieArray.length; ++i)
		{
			movieArray[i] = file.nextLine();
		}
		file.close();
		return movieArray;
	}

	public static void lowercase(String[] array)
	{
		for(int i = 0; i < array.length; ++i)
		{
			array[i] = array[i].toLowerCase();
		}
	}

	public static String findMostFrequent(String[] array)
	{
		Arrays.sort(array);
		String result = array[0];
		int count = 1;
		int max = 1;
		
		for(int i = 1; i < array.length; ++i)
		{
			//this if condition is to count the same movie
			if(array[i].equals(array[i - 1]))
			{
				++count;
			}
			else
			{
				count = 1;
			}
			
			//this if condition is to get the most popular movie
			if(count > max)
			{
				max = count;
				result = array[i];
			}
		}	
		return result;
	}
}