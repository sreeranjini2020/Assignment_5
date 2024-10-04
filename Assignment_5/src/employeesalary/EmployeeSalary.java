package employeesalary;

import java.util.Scanner;


public class EmployeeSalary {
	
	double basicPay;
	
	double deduction;
	
	double bonus;


    Scanner sc = new Scanner(System.in); 

    public void inputMethod() {
        System.out.print("Enter the basic pay: ");
        basicPay = sc.nextDouble();

        System.out.print("Enter deduction: ");
        deduction = sc.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = sc.nextDouble();
	

	
    }
}
