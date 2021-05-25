package test;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//....basics.....
		
		System.out.println("Hello world");
		
		int num1;
		int num2;
				
		num1=10;
		num2=55;
		
		int sum=num1+num2;
		int mul=num1*num2;
		float div=(float)num1/num2;
		
		System.out.println("Addition " + sum);
		System.out.println("Multiplication " + mul);
		System.out.println("Division " + div);
				
		//...string......
		
		String name ="Rahul";
		System.out.println("hello " + name);
		System.out.println("length " + name.length());
		System.out.println("UppeCase " + name.toUpperCase());
		
		//...Input the string....//
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the name of the user : ");
		String name1 = Scanner.next();
		System.out.println("hello " + name1);
		System.out.println("length " + name1.length());
		System.out.println("UppeCase " + name1.toUpperCase());
	
		
		
				
		}
		
		
		
	}


