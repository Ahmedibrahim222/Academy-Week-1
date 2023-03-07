package introtojava;

import java.util.Scanner;

public class Util {
	private String[ ] arr = {"Hello", "Hey", "Good morning!"};

	   public int findString(String target) {
	     String word = null;
	     for (int index = 0; index < arr.length; index++) {
	       word = arr[index];
	       if (word.equals(target)) {
	         return index;
	       } 
	     }
	     return -1;
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
//        for(int i=1;i<=100;i++) {
//        	if(i%2==0) {
//        		System.out.println(i);
//        	}
//        }

		Scanner inp = new Scanner(System.in);
	    System.out.print("# in:");
	    int amt = inp.nextInt();
	    inp.nextLine(); //this line is necessary
	    System.out.print("word:");
	    String word = inp.nextLine();
	    //leave the above unedited, write your code below:
	    if(amt == 0 || amt >1){
	      if(word.endsWith("fe")){
	    	 
	    	word =  word.substring(0, word.length()-2);
	        System.out.println(amt+" "+word+"ves");

	      }
	    } else {
	        System.out.println(amt+" "+word);

	    }

//		Util sWorker = new Util();
//		     System.out.println(sWorker.findString("Hey"));
//		   }
	
	}
}
