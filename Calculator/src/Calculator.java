import java.util.Scanner;


public class Calculator {
	public static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String numRegex = "\\.??[0-9]";
		String modRegex = "[+]|[-]|x|[/]";
		
		double first = Double.parseDouble(get("Enter a number: ", numRegex));
		double second = Double.parseDouble(get("Enter another number: ", numRegex));
		char mod = get("Enter a modifier (+, -, x, /): ", modRegex).charAt(0);
		
		double result = 0;
		
		if(mod == '+') result = first+second;
		if(mod == '-') result = first-second;
		if(mod == 'x') result = first*second;
		if(mod == '/') result = first/second;
		
		System.out.printf("%.2f %s %.2f = %.2f", first, mod, second, result);
	}
	
	public static String get(String prompt, String regex) {
		String s = null;
		do {
			System.out.print(prompt);
			s = sc.nextLine();
			
			if(s.matches(regex)) return s;
			else System.out.println(s + " is not valid.");
		} while(true);
	}
}