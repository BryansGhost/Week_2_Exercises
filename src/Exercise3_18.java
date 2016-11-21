import java.util.Scanner;

public class Exercise3_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter weight of package
		System.out.print("Enter weight of package in pounds: ");
		double weight = input.nextDouble();
		double cost = 0.0;
		
		if (weight > 0 && weight <= 1) {
			cost = 3.50;
		} else if (weight > 1 && weight <= 3){
			cost = 5.50;
		} else if (weight > 3 && weight <= 10){
			cost = 8.50;
		} else if (weight > 10 && weight <= 20) {
			cost = 10.50;
		} else if (weight >= 50){
			System.out.println("This package cannot be shipped");
			System.exit(1);
		}
		
		// Display results
		System.out.println("Shipping cost is $" + cost);
	}
}