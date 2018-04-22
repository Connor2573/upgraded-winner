import java.util.Scanner;

public class HelloWorld {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		System.out.println(LazyBoy(x));
		
	}
	public static String LazyBoy(int y) {
		String orange="";
		if(y == 1) {
			orange="Hello";
		}
		else if (y == 2) {
			orange = "mustang";
		}
		else if (y == 3) {
			orange = "ice cream";
		}
		else {
			orange = "fortnite";
		}
		return orange;
	}
}
