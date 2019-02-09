package Container;

import java.util.Scanner;

	public class Container {

	    public static void main(String[] args) {
	    System.out.println("Enter number: ");
	    Scanner sc = new Scanner(System.in);
	    int[]  value = new int[9];
	    for(int i = 0 ;i<9; i++) {
	    value[i] = sc.nextInt();
	    }
	    for(int j=1; j<9; j++) {
	    System.out.println(value[j]);
	    sc.close();
	    }
	}


