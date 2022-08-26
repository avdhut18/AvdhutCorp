package main;

import java.util.Scanner;

public abstract class Master {    ///POJo class 

	
	private int sal = 10000;   //data hiding
	
	
	public int getSalaryForHrView() {
		Scanner	security = new Scanner(System.in);
		System.out.println("Enter Password:");
		String password = security.next();
		if(password.equals("Hr123")) 
  		return sal;
		else
			return 0;
	}
	
	
	public int getSalaryForEmp() {
		Scanner	security = new Scanner(System.in);
		System.out.println("Enter Password:");
		String password = security.next();
		if(password.equals("Avdhut")) 
  		return sal;
		else
			return 0;
	}
	
	public void setSalary(int sal) {
		Scanner	security = new Scanner(System.in);
		System.out.println("Enter HR Password:");
		String password = security.next();
		if(password.equals("Hr123")) {
		this.sal=sal;
		System.out.println("Salary Updated");
		System.out.println("Avdhut change");
		System.out.println("New Method Added to show branching");
		}
	}
}
