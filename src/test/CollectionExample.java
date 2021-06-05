package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Raj");
		mylist.add("Kiran");
		mylist.add("Priya");
		mylist.add("Sonu");
		mylist.add("Emir");
		
		System.out.println(mylist);
				
		
		System.out.println("Before Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		System.out.println("After Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println("Descending Order");
		System.out.println(mylist);
		
		
		
		Stack<String> mystack = new Stack <String>();
		
		mystack.push("abc");
		mystack.push("xyz");
		mystack.pop();
		mystack.push("pqr");
		
		System.out.println(mystack);
		
		
		

	}

}
