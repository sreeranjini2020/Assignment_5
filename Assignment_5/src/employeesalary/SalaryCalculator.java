package employeesalary;

public class SalaryCalculator extends EmployeeSalary{
	
	double hra;
	double pf;
	
	public void findHra() {
		hra = .05*basicPay;
		
	}
	
	public void findPf() {
		pf = .02*basicPay;	
	}

}
