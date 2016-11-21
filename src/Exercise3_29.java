import java.util.Scanner;

public class Exercise3_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter circle1's center x-, y-coordinates, and radius
		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		// Prompt user to enter circle2's center x-, y-coodinates, and radius
		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		// Get distance
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		// Calculate position of circles and Display results
		
		if (distance <= Math.abs(radius2 - radius1)) {
			if (radius1 > radius2) {
				System.out.println("Circle 2 is inside Circle 1.");
			} else if (radius2 > radius1) {
				System.out.println("Circle 1 is inside Circle 2.");
			} else {
				System.out.println("Circle 2 is the same as Circle 1.");
			}
		}	else if (distance < radius2 + radius1) {
			System.out.println("Circle 2 overlaps Circle 1.");
		}	else if (distance >= radius2 + radius1) {
			System.out.println("Circle 2 does not overlap Circle 1");
		}
	}
}