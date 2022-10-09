package application;

import java.util.Locale;
import java.util.Scanner;

import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Addition sum = new Addition();
		Subtraction sub = new Subtraction();
		Multiplication mul = new Multiplication();
		Division div = new Division();
		
		System.out.println("Enter the number of the operation");
		System.out.print("Addition: 1\n"
				+ "Subtraction: 2\n"
				+ "Multiplication: 3\n"
				+ "Division: 4\n"
				+ "Finish: 0\n");
		
		int operation = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the first value: ");
		double firstValue = sc.nextDouble();
		System.out.print("Enter the second value: ");
		double secondValue = sc.nextDouble();
		
		while (operation != 0) {
			switch (operation) {
			case 1:
				sum.setFirstNumber(firstValue);
				sum.setSecondNumber(secondValue);
				System.out.printf("Result: %.2f%n", sum.result());
				break;
			case 2:
				sub.setFirstNumber(firstValue);
				sub.setSecondNumber(secondValue);
				System.out.printf("Result: %.2f%n", sub.result());
				break;
			case 3:
				mul.setFirstNumber(firstValue);
				mul.setSecondNumber(secondValue);
				System.out.printf("Result: %.2f%n", mul.result());
				break;
			case 4:
				div.setFirstNumber(firstValue);
				div.setSecondNumber(secondValue);
				System.out.printf("Result: %.2f%n", div.result());
				break;
			}
			
			System.out.println();
			System.out.print("Enter the number of the operation: ");
			operation = sc.nextInt();
			
			if (operation != 0) {
				System.out.print("Enter the first value: ");
				firstValue = sc.nextDouble();
				System.out.print("Enter the second value: ");
				secondValue = sc.nextDouble();
			}
		}
		
		System.out.println();
		System.out.println("Thanks for use this calculator!");
		
		sc.close();
	}
}
