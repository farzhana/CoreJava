package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		
		try {
		
		int age = 15;
		
		if(age<18) {
		
			throw new ArithmeticException("not valid");
		}
		
		else {
			System.out.println("eligible for voting");
		}
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception handled");
		}
		
		
			
	}

}
