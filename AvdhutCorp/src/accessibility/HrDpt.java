package accessibility;

import java.util.Scanner;

import main.Master;

public class HrDpt extends Master{

	
	public static void main(String[] args) {
		HrDpt hrObj = new HrDpt();
		System.out.println(hrObj.getSalaryForHrView());
		
		Scanner newSal = new Scanner(System.in);
		System.out.println("Enter Revised Salary:");
		int salNew = newSal.nextInt();
		hrObj.setSalary(salNew);
		System.out.println(hrObj.getSalaryForHrView());
	}
}
