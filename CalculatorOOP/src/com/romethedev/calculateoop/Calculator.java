package com.romethedev.calculateoop;

public class Calculator implements CalculatorOperands {
	private double firstInput;
	private double secondInput;
	private String operand;
	private double result;
	private static String[] math = {"+", "-", "*", "/"};
	
	public Calculator() {
	}
	
	//Getters and setters:
	public double getFirstInput() {
		return this.firstInput;
	}
		
	public void setFirstInput(String operand) {
		this.firstInput = Double.parseDouble(operand);
	}
		
	public double getSecondInput() {
		return this.secondInput;
	}
	
	public void setSecondInput(String operand) {
		this.secondInput = Double.parseDouble(operand);
	}
		
	public String getOperation() {
		return this.operand;
	}
		
	public void setOperation(String operation) {
		if (operation.length() > 1) {
			System.out.println("Error. Please use only one operation.");
			return;
		} else {
			for (int i = 0; i < 4; i++) {
				if (math[i] == operation) {
					this.operand = operation;
				}
			}
		}
	}
	
	@Override
	public void performOperation() {
		if(this.operand == "+") {
			this.result = (this.firstInput + this.secondInput);
		} else if (this.operand == "-") {
			this.result = (this.firstInput - this.secondInput);
		} else if(this.operand == "*") {
			 this.result = (this.firstInput * this.secondInput);
		} else if (this.operand == "/") {
			 this.result = (this.firstInput / this.secondInput);
		}
	}
	
	@Override
	public double getResults() {
		System.out.println(firstInput + " " + operand + " " + secondInput + " = " + result);
		 return result;
	}
		
}
