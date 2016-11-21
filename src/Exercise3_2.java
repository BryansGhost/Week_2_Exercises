import java.util.Scanner;

public class Exercise3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Generate three random numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		// Prompt user to add the three numbers
		System.out.println("What is " + number1 + " + " + number2 + " + "
				+ number3 + "? ");
		
		int answer = input.nextInt();
		
		// Calculate results
		if (answer == (number1 + number2 + number3)){
			System.out.println(number1 + " + " + number2 + " + " + number3 + " is " +
					(number1 + number2 + number3));
			System.out.println("You are Correct!");
		}
		else {
			System.out.println(number1 + " + " + number2 + " + " + number3 + " is " +
					(number1 + number2 + number3));
			System.out.println("You are incorrect.");
		}
	}
}