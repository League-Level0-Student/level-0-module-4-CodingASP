package _01_double._1_change_calculator;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		Scanner scanner = new Scanner (System.in);
System.out.println("How many nickles do you have?");
String nickles = scanner.next();
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int n = Integer.parseInt(nickles);
		// Ask the user how many dimes they have, and convert their answer
System.out.println("How many dimes do you have?");
String dimes = scanner.next();
int d = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
System.out.println("How many quarters do you have?");
String quarters = scanner.next();
int q = Integer.parseInt(quarters);
		// Calculate how much money the user has.  Hint: Use a double variable 
double total = n*0.05 + d*0.1 + q*0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
System.out.println("$"+total);
	}
}

