package introtojava;

import java.util.Scanner;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc = new Scanner(System.in);
		System.out.println("please enter the number of fibonacci number");
		int n = abc.nextInt();
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.print(a+", ");
		System.out.print(b);

		for (int i = 1; i <= n-2; i++) {
			System.out.print(", "+c);
			a = b;
			b = c;
			c = a + b;
		} 
		
		

	}

}
