/*Application: Project 2
 * Name: Dimitrius Morgan
 * Github User: dm2sh
 * Date: Sep 22, 2022
 * Version: 2.0
 * Description: Inputting values with a keyboard, manipulating them with menu options, then comparing them
 */

import java.util.Scanner;
//imports Scanner class

public class morganProject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read input from keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//Store first number based off keyboard input
		System.out.println("Type a Number");
		int firstNumber = keyboard.nextInt();
	
		//Store second number based off keyboard input
		System.out.println("Type a Second Number");
		int secondNumber = keyboard.nextInt();
		
		//Store third number based off keyboard input
		System.out.println("Type a Third Number");
		int thirdNumber = keyboard.nextInt();
		
		//Stores numerical product of any operation between the first and second number
		int product = 0;
		
		//Display menu options
		System.out.println("Select a menu option");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		//Select a menu option based off keyboard input
		int menuSelection = keyboard.nextInt();

		//Execute a mathematical operation based on menu selection
		switch (menuSelection)
		{
		case 1: 
			System.out.print("Addition: ");
			product = firstNumber + secondNumber;
			System.out.println(firstNumber + " + " + secondNumber + " = " + product + "!");
			break;
			
		case 2:
			System.out.print("Subtraction: ");
			product = firstNumber - secondNumber;
			System.out.println(firstNumber + " - " + secondNumber + " = " + product + "!");
			break;
			
		case 3:
			System.out.print("Multiplication: ");
			product = firstNumber * secondNumber;
			System.out.println(firstNumber + " * " + secondNumber + " = " + product + "!");
			break;
			
		case 4:
			System.out.print("Division: ");
			product = firstNumber / secondNumber;
			System.out.println(firstNumber + " / " + secondNumber + " = " + product + "!");
			break;	
		}

		//Determines if product is less than, greater than, or equal to thirdNumber
		if (product<thirdNumber)
		{
			System.out.println("Your product (" + product + ") is less than " + "your third number (" + thirdNumber + ")!");
		}
		else if (product>thirdNumber)
		{
			System.out.println("Your product (" + product + ") is more than " + "your third number (" + thirdNumber + ")!");
		}
		else 
		{
			System.out.println("Your product (" + product + ") is equal to " + "your third number (" + thirdNumber + ")!");
		}
	}

}
