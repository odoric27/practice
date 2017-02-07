import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = "Hello";
		//exception handling to come later
		multiPrint(n, s);
	}
	public static void multiPrint(int n, String s) {
  		if(n == 0)
			return;
		else {
			System.out.println(s);
			multiPrint(n-1, s);
		}
			
	}
}
