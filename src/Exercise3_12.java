import java.util.Scanner;

public class Exercise3_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a three-digit number
		System.out.println("Enter a three-digit number: ");
		
		final int number = input.nextInt();
		
		// Calculate if number is palindrome (reads the same forward and backward)
		int integer1 = (number / 100);
		int integer3 = (number % 100 % 10);
		
		// Display results
		if (integer1 != integer3){
			System.out.println(number + " is not a palindrome.");
		}
		else{
			System.out.println(number + " is a palindrome.");
		}
	}
}