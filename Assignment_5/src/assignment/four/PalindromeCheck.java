package assignment.four;

public class PalindromeCheck {

	public static void main(String[] args) {
		String s = new String ("Java");
		System.out.println(s.charAt(1));
		
		String reverse= "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
	
		System.out.println("Is Java Palindrome?: "+s.equalsIgnoreCase(reverse));

}
}