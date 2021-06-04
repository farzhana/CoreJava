package OopsConcepts;

public class RunnerClass {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ClassA Emp1 = new ClassA();
		
		Emp1.name = "Emir";
		Emp1.OrgName = "xyz";
		Emp1.salary = 2000;
		
		
		Emp1.Display();
	} */
		
		MethodOverloading obj3 = new MethodOverloading();
		
		obj3.add(1, 2);
		obj3.add(1.1, 2.3);
		
		//----------------------------
		
		MethodOverrideChild obj4 = new MethodOverrideChild();
		
		obj4.Display();
		
		//------------------
		
		AbstractChild obj5 = new AbstractChild();
		
		obj5.method2();
		
		//------------------
		
		InterfaceChild obj6 = new InterfaceChild();
		obj6.method1();
		
		//------------------
		
		EncapsulationExample obj7 = new EncapsulationExample();
		
		obj7.setSalary(1800);
		
		System.out.println(obj7.getSalary());
		
		
		
		

	}
}

