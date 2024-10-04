package employeesalary;

public class SalarySlip extends SalaryCalculator{

	double totalSalary;

	public static void main(String[] args) {
		SalarySlip ss = new SalarySlip();
		
		ss.processSalarySlip( );

	}
	public void processSalarySlip() {
        inputMethod();       

        findHra();           
        findPf();            

        findTotalSalary();   

        displaySalarySlip(); 
    }
	
	public void findTotalSalary() {
		
		totalSalary = (basicPay +hra+bonus)-(pf+deduction);
		
	}

	
	public void displaySalarySlip() {
		System.out.println("\n****** Salary Slip*******");
		System.out.println("Basic Pay: "+ basicPay);
		System.out.println("HRA: "+ hra);
		System.out.println("PF: "+ pf);
		System.out.println("Deduction: "+deduction);
		System.out.println("Bonus: "+ bonus);
		System.out.println("Total Salary: "+totalSalary);
		
	}

}
