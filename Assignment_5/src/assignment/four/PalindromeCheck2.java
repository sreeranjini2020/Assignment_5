package assignment.four;

public class PalindromeCheck2 {

	public static void main(String[] args) {
		String s = new String ("Malayalam");
		
		
		String reverse= "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
	
		System.out.println("Is Java Palindrome?: "+s.equalsIgnoreCase(reverse));

}
}