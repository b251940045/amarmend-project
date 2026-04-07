package lab2a;

import java.util.Scanner;

public class lab2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" radius:");
		double r = input.nextDouble();
		double bvslvvrynurt = 2*Math.PI*r;
		System.out.println("bvslvvryn urt: = " + bvslvvrynurt);
		input.close();
	}
}
