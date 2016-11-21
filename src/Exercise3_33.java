import java.util.Scanner;

public class Exercise3_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter weight and price of package 1
		System.out.print("Enter weight (ounces) of package 1: ");
		double weight1 = input.nextDouble();
		System.out.print("Enter price of package 1: $");
		double price1 = input.nextDouble();
		
		// Prompt user to enter weight and price of package 2
		System.out.print("Enter weight (ounces) of package 2: ");
		double weight2 = input.nextDouble();
		System.out.print("Enter price of package 2: $");
		double price2 = input.nextDouble();
		
		// Calculate the better buy
		double pricePerOz1 = (price1 / weight1);
		double pricePerOz2 = (price2 / weight2);
		
		if (pricePerOz1 == pricePerOz2) {
			System.out.println("Both packages are equal in price. Choose whichever you want!");	
		} else if (pricePerOz1 < pricePerOz2)
			System.out.println("Package 1 has the better price.");
		  else if (pricePerOz1 > pricePerOz2)
			System.out.println("Package 2 has the better price.");
	}
}