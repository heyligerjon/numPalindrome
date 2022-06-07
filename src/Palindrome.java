import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Number prompt
		System.out.print("Please enter an integer > 0: " );
		int integer = keyboard.nextInt();
		
		//Variables
		int sum, remainder;
		
		//Here are my variables for when I added up the number values
		int count = 0;
		long value = 0;
		int ogInt = integer;
		
		if (integer <= 0)
		{
			System.out.println("Sorry, you must enter an integer greater than zero.");
			
		}
		else
		{
			
			sum = 0;
			while (integer > 0)
			{
				//Determines if # is a palindrome
				remainder = integer % 10;
				integer = integer / 10;
				sum = sum * 10 + remainder;
			}
				
			//Statement to determine what to do if the number is a palindrome or not
			if (sum == ogInt)
			{
				//This is the loop to add up the number values
				while (count <= ogInt)
				{
					value += count;
					count++;		
				}
				//Print statement for the total
				System.out.print("The sum of the numbers from 1 to " + ogInt);
				System.out.println(" is " + value);
			}
			else 
			{
				System.out.println("The integer " + ogInt + " is not a palindrome");
			}
		}

		keyboard.close();
	}

}
