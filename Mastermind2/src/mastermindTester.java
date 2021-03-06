import java.util.Scanner;
/*Tester class for Mastermind 2
 * Based on Mastermind from 20 Code Challenges
 * From GCSE (9-1) Computer Science
 * Code written by Matthew Bishop
 */
public class mastermindTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		int modeSelect;
		Mastermind game;
		String choice = new String();
		//Explanation of the game
		System.out.println("Welcome to Mastermind, a game where you guess a randomly generated number");
		System.out.println("There are 3 difficulties: easy, medium, and hard");
		System.out.println("Easy: the randomly generated number is 4 digits, and it tells you what positions you got correct");
		System.out.println("Medium: the randomly generated number is 4 digits");
		System.out.println("Hard: the randomly generated number is 4 digits");
		
		//Play the game
		while(cont) {
			
			System.out.println("Please select the game mode: 1 for Easy, 2 for Medium, 3 for Hard, 4 to quit");
			modeSelect = input.nextInt();
			//Easy
			if(modeSelect == 1) {
				System.out.println("Easy Mode");
				game = new MastermindEasy();
				game.play();
				System.out.println("Do you want to play again? Yes or No?");
				choice = input.nextLine();
				if(choice.equals("Yes")) {
					System.out.println("Okay");
					cont = true;
				}
				else if(choice.equals("No")) {
					System.out.println("Okay");
					cont = false;
				}
				else {
					System.out.println("Please enter Yes or No, returning to top");
				}
				System.out.println("Thank you for playing Easy Mode");
			}
			//Medium
			else if(modeSelect == 2) {
				System.out.println("Medium Mode");
				game = new MastermindMedium();
				game.play();
				System.out.println("Do you want to play again? Yes or No?");
				choice = input.nextLine();
				if(choice.equals("Yes")) {
					System.out.println("Okay");
					cont = true;
				}
				else if(choice.equals("No")) {
					System.out.println("Okay");
					cont = false;
				}
				else {
					System.out.println("Please enter Yes or No, returning to top");
				}
				System.out.println("Thank you for playing Medium Mode");
			}
			//Hard
			else if(modeSelect == 3) {
				System.out.println("Hard Mode");
				game = new MastermindEasy();
				game.play();
				System.out.println("Do you want to play again? Yes or No?");
				choice = input.nextLine();
				if(choice.equals("Yes")) {
					System.out.println("Okay");
					cont = true;
				}
				else if(choice.equals("No")) {
					System.out.println("Okay");
					cont = false;
				}
				else {
					System.out.println("Please enter Yes or No, returning to top");
				}
				System.out.println("Thank you for playing Hard Mode");
			}
			//quit
			else if(modeSelect == 4) {
				cont = false;
			}
			else {
				System.out.println("Please enter 1, 2, or 3 to select your game mode");
			}
		}
		System.out.println("Thank you for playing");
		input.close();
	}
}
