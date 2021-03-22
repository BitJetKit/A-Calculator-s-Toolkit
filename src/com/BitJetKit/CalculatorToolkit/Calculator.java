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

	public double getFactorial() {
		return factorial;
	}
	public void setFactorial(double factorial) {
		this.factorial = factorial;
	}
	public void add(double number1, double number2) {
		double sum = number1 + number2;
	}
	public void subtract(double number1, double number2) {
		double difference = number1 - number2;
	}
	public void multiply(double number1, double number2) {
		double product = number1 * number2;
	}
	public void divide(double number1, double number2) {
		double division = number1 / number2;
	}
	public void modulus(double number1, double number2) {
		double remainder = number1 % number2;
	}
	public void sin(double number1) {
		double sinResult = Math.sin(number1);
	}
	public void cos(double number1) {
		double cosResult = Math.cos(number1);
	}
	public void tan(double number1) {
		double tanResult = Math.tan(number1);
	}
	public void aSin(double number1) {
		double aSinResult = Math.asin(number1);
	}
	public void aCos(double number1) {
		double aCosResult = Math.acos(number1);
	}
	public void aTan(double number1) {
		double aTanResult = Math.atan(number1);
	}
	public void iterativeSeries(double number1) {
		for(index = getIndex(); index < getLimit(); index++) {
			index++;
		}
	}
	// Get the limit then multiply the limit by every iteratively less number to 1.
	static int factorialCalculator(int factNum) {
		if(factNum == 0) {
			return 1;
		}
		else {
			return(factNum * factorialCalculator(factNum - 1));
		}
	}
	static double triangleCalculator(double number1, double number2) {
		double triangleSide = 0.0;
		if(number1 == 0 && number2 == 0) {
			return triangleSide;
		}
		else if(number1 == 0 && number2 != 0){
			return triangleSide;
		}
		else if(number1 != 0 && number2 == 0) {
			return triangleSide;
		}
		else {
			triangleSide = 180 - number1 - number2;
			return triangleSide;	
		}
	}
	static double triangleArea(double number1, double number2) {
		double area = 0.0;
		double height = number1;
		double base = number2;
		if(number1 == 0 && number2 == 0) {
			return area;
		}
		else if(number1 == 0 && number2 != 0){
			return area;
		}
		else if(number1 != 0 && number2 == 0) {
			return area;
		}
		else {
			area = (height / base) / 2;
			return area;	
		}
	}
	static double cosineRule()
}
