import java.util.Scanner;
/*
 * Author: Matthew Bishop
 * Refresher1: A space to practice and refresh
 * myself on basic Java
 * February 2, 2021
 */
public class Refresher1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String sentence;
		String[] words;
		int total;
		String cont;
		boolean run = true;
		while(run) 
		{
			System.out.println("Please enter a sentence, this program will state how many works are in it.");
			sentence = input.nextLine();
			words = sentence.split(" ");
			total = words.length;
			System.out.println("There are " + total + " words in your sentence");
			System.out.println("Continue? Y/N");
			cont = input.nextLine();
			if(cont.equals("N") || cont.equals("n")) 
			{
				run = false;
				System.out.println("Thank you for using this program.");
			}
			else 
			{
				System.out.println("Please enter Y, y, N, or n in order to decide whether to end the loop or not.");
			}
		}
		input.close();
	}
}
