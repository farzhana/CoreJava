package test;

import java.util.Scanner;

public class Checkprimenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int i=0,m=0,flag=0;
		int n = s.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n + " is not prime number");
		}
		else {
			for(i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println(n + " is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n + " is prime number");
			}
		}
		
	}

}
