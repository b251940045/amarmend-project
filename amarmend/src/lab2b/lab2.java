package lab2b;

import java.util.Scanner;

public class lab2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("a=");
		double a = input.nextDouble();
		System.out.print("b=");
		double b = input.nextDouble();
		
		double arifmetik = (a + b)/2;
		double geomytr = Math.sqrt(a * b);
		
		System.out.println("Arifmetik dundaj: " + arifmetik);
		System.out.println("geomytr dundaj: " + geomytr);
	}
	

}
