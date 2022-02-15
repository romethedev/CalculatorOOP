package com.romethedev.calculateoop;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cAddition = new Calculator();
		Calculator cSubtraction = new Calculator();
		
		//Addition calculator
		cAddition.setFirstInput("10.5");
		cAddition.setSecondInput("5.2");
		cAddition.setOperation("+");
		cAddition.performOperation();
		cAddition.getResults();
		System.out.println();
		
		//Subtraction calculator
		cSubtraction.setFirstInput("22");
		cSubtraction.setSecondInput("13");
		cSubtraction.setOperation("-");
		cSubtraction.performOperation();
		cSubtraction.getResults();
		System.out.println();
	}

}
