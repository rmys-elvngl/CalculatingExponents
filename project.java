package main;
import java.util.Scanner;
import java.text.NumberFormat;
public class project {
	public static void main(String[] args) {
		int base ,exp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		base = scan.nextInt();
		System.out.println("Enter a pow of value: ");
		exp = scan.nextInt();
		
		System.out.println(Calculate(base,exp));
		
	}
	static int Calculate(int base, int exp) {
		 if (exp == 0) {
	            return 1;
	        } else {
	            return base * Calculate(base, exp - 1);
	        }
	}
}
