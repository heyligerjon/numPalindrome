/*
6* Palindrome.java
* Author: Jon Isaacs-Heyliger
* Submission Date: 2/26/2016
*
* Purpose: This program is designed to determine if a number is a palindrome and if 
* it is, find the the value of the sum of the numbers from 1 to the number
* 
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

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
