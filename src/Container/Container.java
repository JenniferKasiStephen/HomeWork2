package Container;

import java.util.Scanner;

	public class Container {

		public static void main(String[] args) {
	    System.out.println("Enter number: ");
	    Scanner sc = new Scanner(System.in);
	    int[]  value = new int[3];
	    for(int i = 0 ;i<5; i++) {
	     
	     value[i] = sc.nextInt();
	    }
	       sc.close();
	       System.out.println(value[4]);

	   }
	}


