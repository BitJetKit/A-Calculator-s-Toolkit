package com.BitJetKit.CalculatorToolkit;

import java.util.Scanner;

/*
 * Title: Test.java
 * @author: BitJetKit
 * Date: March 22, 2021
 * Purpose: This is the test functionality
 */

public class Test {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner reader = new Scanner(System.in);
		int choice;
		System.out.println("==================A Calculator's Toolkit==================");	
		System.out.println("This is for calculator's: mathematicians who work on many fundamental mathematics problems");
		System.out.println("Select an option:");
		System.out.println("1. Arithmetic");
		System.out.println("2. Exponent (Beta)");
		System.out.println("3. Trigonometry");
		try {
			choice = reader.nextInt();
		} catch(NumberFormatException e) {
			System.out.println("Enter a value from 1 to 3 (no words).");
		}
		if (choice != 1 || choice != 2 || choice != 3) {
			System.out.println("Enter a value from 1 to 3 (no words).");
		}
		else if (choice == 1) {
			System.out.println("1. Add 2 numbers.");
			System.out.println("2. Subtract 2 numbers.");
			System.out.println("3. Multiply 2 numbers.");
			System.out.println("4. Divide 2 numbers.");
			System.out.println("5. Modulus: Find the remainder of a 1st number divided by a 2nd number.");	
		}
		else if (choice == 2)
		{
			System.out.println("1. Exponent: Find a number to the power of another number.");
			System.out.println("2. Logarithm: Find ")
		}		System.out.println("Find a sine value");
		System
		
	}

}
