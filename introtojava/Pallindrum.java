package introtojava;

import java.util.Random;
import java.util.Scanner;

public class Pallindrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
System.out.println("Please input a word");
String word = input.nextLine();
String reversedWord = "";
int i = word.length();
while(i!=0) {
	i--;
	reversedWord+=word.charAt(i);
}

if(word.matches(reversedWord)) {
	System.out.println("This is a Pallindrum");
} else {
	System.out.println("This is not a Pallindrum");
}
	}

}
