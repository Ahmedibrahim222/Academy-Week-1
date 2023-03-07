package introtojava;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number");
		double a = input.nextDouble();
		if (a >= 0) {
			System.out.println("number is positive");
			
		} else {
			System.out.println("number is negative");
			
		}

	}

}
