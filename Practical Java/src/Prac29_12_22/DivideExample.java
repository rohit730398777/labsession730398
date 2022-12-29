package Prac29_12_22;

import java.util.Scanner;

public class DivideExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two number:");
		int number1=s.nextInt();
		int number2=s.nextInt();
		try {
			int result=number1/number2;
			System.out.println("Result="+ result);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception:");
		}

	}

}
