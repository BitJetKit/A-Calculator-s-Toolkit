package com.BitJetKit.CalculatorToolkit;
/*
 * Title: Calculator.java
 * @author: BitJetKit
 * Date: March 22, 2021
 * Purpose: This is the fundamental calculator functionality
 */
public class Calculator {
	// Declare the fields.
	private double number1 = 0.0;
	private double number2 = 0.0;
	private double number3 = 0.0;
	private int factNum;
	// These initializing variables are for the iterative series.
	private double counter;
	private double index;
	private double limit;
	private double factorial;
	// Implement the hash code method for testing. 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(number1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(number2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	// Implement the equals method for testing. 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculator other = (Calculator) obj;
		if (Double.doubleToLongBits(number1) != Double.doubleToLongBits(other.number1))
			return false;
		if (Double.doubleToLongBits(number2) != Double.doubleToLongBits(other.number2))
			return false;
		return true;
	}
	// These are the accessor getters and setters. 
	// Maintain privacy. But also, maintain security.	
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	public double getCounter() {
		return counter;
	}
	public void setCounter(double counter) {
		this.counter = counter;
	}
	public double getIndex() {
		return index;
	}
	public void setIndex(double index) {
		this.index = index;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	static String add(double number1, double number2) {
		double sum = number1 + number2;
		
		return (number1 + " + " + number2 + " = " + sum);
		
	}
	static String subtract(double number1, double number2) {
		double difference = number1 - number2;
		
		return (number1 + " - " + number2 + " = " + difference);
	}
	static String multiply(double number1, double number2) {
		double product = number1 * number2;

		return (number1 + " * " + number2 + " = " + product);
	}
	static String divide(double number1, double number2) {
		double division = number1 / number2;
		
		return (number1 + " / " + number2 + " = " + division);

	}
	static String modulus(double number1, double number2) {
		double remainder = number1 % number2;
		
		return (number1 + " % " + number2 + " = " + remainder);
	}
	static String sin(double number1) {
		double sinResult = Math.sin(number1);
		
		return("sin(" + number1 + ")" + " = " + sinResult);
	}
	static String cos(double number1) {
		double cosResult = Math.cos(number1);
		
		return("cos(" + number1 + ")" + " = " + cosResult);
	}
	static String tan(double number1) {
		double tanResult = Math.tan(number1);
		

		return("tan(" + number1 + ")" + " = " + tanResult);
	}
	static String aSin(double number1) {
		double aSinResult = Math.asin(number1);
		
		return("arcsin(" + number1 + ")" + " = " + aSinResult);
	}
	static String aCos(double number1) {
		double aCosResult = Math.acos(number1);
		
		return("arccos(" + number1 + ")" + " = " + aCosResult);
	}
	static String aTan(double number1) {
		double aTanResult = Math.atan(number1);
		
		return("arcTan(" + number1 + ")" + " = " + aTanResult);
	}	
	
	static String triangleCalculator(double number1, double number2) {
		double triangleSide = 0.0;
		
		double side1 = number1;
		double side2 = number2;
		if(number1 == 0 && number2 == 0) {
			return String.valueOf(triangleSide);
		}
		else if(number1 == 0 && number2 != 0){
			return String.valueOf(triangleSide);
		}
		else if(number1 != 0 && number2 == 0) {
			return String.valueOf(triangleSide);
		}
		else {
			triangleSide = 180 - side1 - side2;
			return "Side 1 = " + String.valueOf(side1) + " Side 2 = " + "String.valueOf(side2); " + "180 - " + 
			String.valueOf(side1) + " - " + String.valueOf(side2) + " = " + String.valueOf(triangleSide);	
		}
	}
	static String triangleArea(double number1, double number2) {
		double area = 0.0;
		double height = number1;
		double base = number2;
		if(number1 == 0 && number2 == 0) {
			return "Enter values for the 1st and 2nd known sides";
		}
		else if(number1 == 0 && number2 != 0){
			return "Enter a value for the 1st known side";
		}
		else if(number1 != 0 && number2 == 0) {
			return "Enter a value for the 2nd known side";
		}
		else {
			area = (height / base) / 2;
			return "Height = " + height + " Base = " + base + "; (" + height + " / " + base + ") / 2 = " + area + " Area = " + area;
			
		}
	}
}
