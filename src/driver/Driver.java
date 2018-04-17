package driver;

import lab4.Employees;

public class Driver {

	public static void main(String[] args) {

		Employees obj1 = new Employees();
		System.out.println("printing list");
		obj1.print();
		
		System.out.println("sorting list");
		obj1.sort();
		
		
		System.out.println("printing list");
		obj1.print();
		
	}

}
