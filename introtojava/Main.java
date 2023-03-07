package introtojava;

import java.util.Scanner;

public class Main {
	
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
    String command = scan.nextLine();
    
    if (command.equals("n")) 
    {
        System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
    }else if (command.equals("s")) {
    	System.out.println("South");
    }else if (command.equals("e")) {
    	System.out.println("East");
    }else if (command.equals("w")) {
    	System.out.println("West");
    }else {System.out.println("End of adventure!");}
    // Add else-ifs for s, e, and an else for any other input. Be creative!
    
    
    scan.close();
  }
}