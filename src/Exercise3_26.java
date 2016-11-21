import java.util.Scanner;
	
public class Exercise3_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter an integer
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		// Calculate if integer is divisible by 5 and 6, 5 or 6, 5 and 6 but not both
		boolean isDivisibleByBoth = 
			(number % 5 == 0 && number % 6 == 0);
		
		//Calculate if integer is divisible by 5 or 6
		boolean isDivisibleByEither = 
				(number % 5 == 0 || number % 6 == 0);
		
		//Calculate if number is  divisible by 5 or 6 but NOT both
		boolean divisibleByEitherNotBoth = 
				(number % 5 == 0 ^ number % 6 == 0);	
		
		
		//Display results
		System.out.println("Is " + number + " divisible by 5 and 6? " + isDivisibleByBoth);
		System.out.println("Is " + number + " divisible by either 5 or 6? " + isDivisibleByEither);
		System.out.println("Is " + number + " divisible by either 5 or 6 byt not both? " + 
				divisibleByEitherNotBoth);
	}
}