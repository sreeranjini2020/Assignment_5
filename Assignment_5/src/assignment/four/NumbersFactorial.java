package assignment.four;

public class NumbersFactorial {
	
	int factorial =1;
	

	public static void main(String[] args) {
		NumbersFactorial fact = new NumbersFactorial();
		
		fact.findFactorial(5);

	}
	
	public void findFactorial(int n) {
		System.out.println("The given number is: "+ n);
		for(int i= 1; i<n+1; i++) {
			factorial = factorial*i;
		}
		this.printFactorial(factorial);
	}
	public void printFactorial(int x) {
		System.out.println("Factorial of the given number: "+x);
		
	}

}
