import java.util.Scanner;

public class Main { 

  public static void main(String args[]) {

    int condition = 0; 
    int choice;
    Scanner scan = new Scanner(System.in);

     do {

      System.out.println("/........... String Operations Menu................/");
      System.out.println("Press 1 for palindrom check");
      System.out.println("Press 2 to reverse a string");
      System.out.println("Press 3 to concatenate two strings");
      System.out.println("Press 4 for string comparison");
      System.out.println("Press 5 to find length of string ");

      choice = scan.nextInt();

     if (choice == 1) {
        String str, rev = "";
        System.out.println("Enter a string to check if it is a palindrome");
        str = scan.next(); // scanner won't input string with nextLine()
        int strLen = str.length();

        for (int i = strLen - 1; i >= 0; i--) {
          rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
          System.out.println(str + " is a palindrome");
        } else {
          System.out.println(str + " is not a palindrome");
        }

        System.out.println("To continue calculation Press 1 or Press any number to exit");

        condition = scan.nextInt();
     }
  
  
     if (choice==2) {
                    
        String ty = scan.nextLine();
        System.out.println("Enter first string:");

        String am = scan.nextLine();
        StringBuffer am1 = new StringBuffer();
                        
        am1.append(am);
        am1.reverse();

        System.out.println("reversed string is " + am1);
                        
        System.out.println("To continue operation Press 1 else Press any button to exit");
                        
        condition = scan.nextInt();
    }   
                
     if (choice == 3) {

        String firstStr = scan.nextLine();
        System.out.println("Enter first string: "); 
         
         
        String secondStr = scan.nextLine();
        System.out.println("Enter second string: ");

        String thirdStr = scan.nextLine();
        String concat = firstStr +" "+ secondStr;
        System.out.println("Concatenated string is: " + concat);

        System.out.println("To continue calculation please Press 1 or Press any number to exit");
        
        condition = scan.nextInt();
        
      }
        
                     

     if (choice == 4){
      
          String string1 = scan.nextLine();
          System.out.println("Enter First String: ");

          String string2 = scan.nextLine();
          System.out.println("Enter Next String: ");

          String result = scan.nextLine();
          int res = string2.compareTo(result);
          if(res == 0) {
              System.out.println("Strings are equal");
          } else {
              System.out.println("Strings are not equal");
          }

         System.out.println("To continue operation Press 1 or else Press any button to exit");

         condition = scan.nextInt();  
          }
       

     if (choice == 5) {
         
        String strng1 = scan.nextLine();
        System.out.println("Enter string: ");

        String strng2 = scan.nextLine();
        int a= strng2.length(); 
        
        
        System.out.println("The length of this string is " +a);        
        System.out.println("To continue operation Press 1 or else Press any button to exit");

         condition = scan.nextInt();    
        }

     } while (condition == 1);
     
    }  
}