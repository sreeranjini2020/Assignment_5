package assignment.four;

public class NumberReverse {
	
	int number;
	
	
	public NumberReverse() {
		System.out.println("“Finding reverse”");
	}
	
	public NumberReverse(int number) {
		this();
		this.number =number;
		
		int reverse = 0;
		
		while(number!= 0){
			int remainder = number% 10;
			reverse = reverse*10 + remainder;
			number = number/10;
			}
		System.out.println("The reverse of the given number: "+reverse);
	}

	public static void main(String[] args) {
		NumberReverse a = new NumberReverse(4578);
		

	}

}
