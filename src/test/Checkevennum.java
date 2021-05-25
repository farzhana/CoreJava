package test;

import java.util.Scanner;

public class Checkevennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n;
		
		n = s.nextInt();
		
		if(n%2==0) {
			System.out.println(n + " is even number");
		}
		else {
			System.out.println(n + "is not even number");
		}
	
	}

}
