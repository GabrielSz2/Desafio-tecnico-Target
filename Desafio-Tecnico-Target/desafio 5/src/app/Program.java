package app;

public class Program {

	public static void main(String[] args) {
		
		String test1 = "computador";
		String test2 = "passei";
		
		System.out.println(inverterString(test1));
		System.out.println(inverterString(test2));
		
		
	}

	public static String inverterString(String str) {
		String inverse = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			inverse += str.charAt(i);
		}
		
		return inverse;
	}
}
