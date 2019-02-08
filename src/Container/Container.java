package Container;

import java.util.Scanner;

	public class Container {

		public static void main(String[] args) {
	    System.out.println("Enter number: ");
	    Scanner sc = new Scanner(System.in);
	    int[]  value = new int[9];
	    for(int i = 0 ;i<10; i++) {
	     value[i] = sc.nextInt();
	    }
	      System.out.println(value[1]);
             sc.close();

	   }
	}


