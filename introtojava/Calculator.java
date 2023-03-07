package introtojava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// taking input from the user using the Scanner
        // class
		String exitOrContinue = "1";
		while (exitOrContinue.matches("1")) {

		System.out.println("/................Calculator Menu................/\r\n"
				+ "Press 1 for addition\r\n"
				+ "Press 2 for subtraction\r\n"
				+ "Press 3 for Multiplication\r\n"
				+ "Press 4 for Division\r\n"
				+ "Press 5 for finding Square\r\n"
				+ "Press 6 for finding Square root\r\n"
				+ "Press 7 for finding Reciprocal");
		
		int operation = sc.nextInt();
		double result;

		if(operation == 1 || operation == 2 || operation == 3 || operation == 4) {
		
			System.out.println("Enter the first number");
			double numberOne = sc.nextDouble();
			System.out.println("Enter the second number");
			double numberTwo = sc.nextDouble();
			
			if(operation == 1) {
				result = numberOne+numberTwo;
				System.out.println("The sum of numbers "+numberOne+" and "+numberTwo+" is "+result);
			} else if (operation == 2) {
				result = numberOne-numberTwo;
				System.out.println("The difference between numbers "+numberOne+" and "+numberTwo+" is "+result);

			}else if (operation == 3) {
				result = numberOne*numberTwo;
				System.out.println("The product of numbers "+numberOne+" and "+numberTwo+" is "+result);

			}else if (operation == 4) {
				result = numberOne/numberTwo;
				System.out.println("The division of numbers "+numberOne+" and "+numberTwo+" is "+result);

			}
		} else if (operation == 5 || operation == 6 || operation == 7) {
			System.out.println("Enter a number");
			double number = sc.nextDouble();
			if(operation == 5) {
				result = number * number ;
				System.out.println("The Square of the number "+number+ " = "+result);
			} else if (operation == 6) {
				result = Math.sqrt(number);
				System.out.println("The Square root of  "+number+ " = "+result);
			}else if (operation == 7) {
				result = 1 / number;
				System.out.println("The Reciprocal of the number  "+number+ " = "+result);
	
			}
		} else {
			System.out.println("You have entered and invalid input");
		} 
		System.out.println("To continue calculation Press 1 else Press any button to exit");
		exitOrContinue = sc.next();
		}
    }
   
}

