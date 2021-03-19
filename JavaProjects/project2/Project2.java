// Author name : Yanchun Song

public class Project2 
{

	public static void main(String[] args)
	
	{
		// book titles
		String book1Title = "Three Sisters";
		String book2Title = "Song of Solomon";
		String book3Title = "Owls Don't Have to Mean Death";
		
		//book authors
		String book1Author = "Bi Feiyu";
		String book2Author = "Toni Morrison";
		String book3Author = "Chip Livingston";
		
		//book price
		double book1Price = 18.99;
		double book2Price = 11.99;
		double book3Price = 80.50;
		
		
		//number of purchased copies of each book
		int numPurchasedBook1 = 2;
		int numPurchasedBook2 = 4;
		int numPurchasedBook3 = 1;
		
		//tax rate
		final double TAX_RATE = 0.0875;
		
		//price calculation
		double pretaxTotal = book1Price * numPurchasedBook1 + 
			                 book2Price * numPurchasedBook2 + book3Price * numPurchasedBook3;
		double salesTax = pretaxTotal * TAX_RATE;
		double totalCost = pretaxTotal + salesTax;
		
		//print out the information
		System.out.println("Purchase " + numPurchasedBook1 + " copies of " + book1Title + ", " 
		                 + book1Author + ". Each copy costs $" + book1Price + ".");
		System.out.println("Purchase " + numPurchasedBook2 + " copies of " + book2Title + ", " 
                         + book2Author + ". Each copy costs $" + book2Price + ".");
		System.out.println("Purchase " + numPurchasedBook3 + " copy of " + book3Title + ", " 
                         + book3Author + ". Each copy costs $" + String.format("%.2f", book3Price) + ".");
		
		System.out.println("Total before tax: $" + pretaxTotal);
		System.out.println("Sales tax: $" + String.format("%.2f", salesTax));
		System.out.println("The total cost of your order will be $" + String.format("%.2f", totalCost));
		


		
	}
}
