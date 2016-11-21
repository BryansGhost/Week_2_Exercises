import java.util.Scanner;

public class Exercise3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter today's day number
		System.out.println("Enter today's day (number): ");
		int today = input.nextInt();
		
		// Prompt user to enter days elapsed since today
		System.out.println("Enter days elapsed since today: ");
		int elapsedDays = input.nextInt();
		
		int futureDay = (today + elapsedDays) % 7;
		
		// Calculate today
		switch (today){
			case 0: System.out.print("today is Sunday"); break;
			case 1: System.out.print("today is Monday"); break;
			case 2: System.out.print("today is Tuesday"); break;
			case 3: System.out.print("today is Wednasday"); break;
			case 4: System.out.print("today is Thursday"); break;
			case 5: System.out.print("today is Friday"); break;
			case 6: System.out.print("today is Saturday"); break;
 		}

		// Calculate days elapsed from today
		switch (futureDay){
			case 0: System.out.print(" and the future day is Sunday"); break;
			case 1: System.out.print(" and the future day is Monday"); break;
			case 2: System.out.print(" and the future day is Tuesday"); break;
			case 3: System.out.print(" and the future day is Wednsday"); break;
			case 4: System.out.print(" and the future day is Thursday"); break;
			case 5: System.out.print(" and the future day is Friday"); break;
			case 6: System.out.print(" and the future day is Saturday"); break;
		}
	}
}