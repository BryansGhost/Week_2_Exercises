import java.util.Scanner;

public class Exercise3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter input for a, b, c, d, e, and f.
		System.out.println("Enter a, b, c, d, and f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Cramer's Rule
		double x = (e * d - b * f)/(a * d - b * c);
		double y = (a * f - e * c)/(a * d - b * c);
		
		// Calculate input
		if ((a * d - b * c) == 0){
			System.out.println("Equation has no soltion.");
		}
		else {
			System.out.println("x is " + x  + " and y is " + y);
		}
	}
}