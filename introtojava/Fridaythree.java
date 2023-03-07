package introtojava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Input a value to be converted to meters");

double inches = scan.nextDouble();
System.out.println(+inches+" inches equals to "+(inches * 0.0254)+" meters");
    }
}