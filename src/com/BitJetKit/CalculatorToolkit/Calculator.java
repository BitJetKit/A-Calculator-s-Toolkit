package com.BitJetKit.CalculatorToolkit;

public class Calculator {
	// Declare the fields.
	private double number1 = 0.0;
	private double number2 = 0.0;
	// These are the accessor getters and setters. 
	// Maintain privacy. But also, maintain security.
	public double getNumber1() {
		return number1;
	}
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
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
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
}
