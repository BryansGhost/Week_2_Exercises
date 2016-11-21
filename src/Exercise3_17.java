import java.util.Scanner;

public class Exercise3_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter their choice
		System.out.print("(0)Rock, (1)Paper, or (2)Scissors? ");
		
		int playerMove = input.nextInt();
		
		if (playerMove != 0 && playerMove !=1 && playerMove != 2) {
			System.out.println("Invalid entry.");
			System.exit(1);
		}
		
		// Compute random number for computer's choice
		int computer = (int)(Math.random() * 2);
		
		// Display player choice
		switch (playerMove) {
		case 0: System.out.print("You chose Rock. "); break;
		case 1: System.out.print("You chose Paper. "); break;
		case 2: System.out.print("You chose Scissors. "); break;
		}
		
		//Display computer choice
		switch (computer) {
		case 0: System.out.println("Computer chose Rock. "); break;
		case 1: System.out.println("Computer chose Paper. "); break;
		case 2: System.out.println("Computer chose Scissors. "); break;
		}
		
		// Compute who has won
		if (playerMove == computer) {
			System.out.println("It is a draw!");
		}
		else if (computer == 0 && playerMove == 1)
			System.out.println("Paper covers Rock. You have Won!");
		else if (computer == 0 && playerMove == 2)
			System.out.println("Rock breaks scissors. Computer Wins!");
		else if (computer == 1 && playerMove == 0)
			System.out.println("Paper covers Rock. Computer Wins!");
		else if (computer == 1 && playerMove == 2)
			System.out.println("Scissors cut paper. You have Won!");
		else if (computer == 2 && playerMove == 0)
			System.out.println("Rock breaks scissors. You have Won!");
		else if (computer == 2 && playerMove == 1)
			System.out.println("Scissors cut Paper. Computer Wins!");
	}
}