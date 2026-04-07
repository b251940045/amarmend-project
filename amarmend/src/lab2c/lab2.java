package lab2c;

import java.util.Scanner;

public class lab2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("A tsegin kordinat (x1, y1)=");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("B tsegin kordinat (x2, y2)=");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("C tsegin kordinat (x3, y3)=");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double talbai = 0.5* Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
		
		System.out.println("TALBAI=" + talbai);
		
		System.out.println("-------------------------------------------------");
		
		System.out.print("a=");
		double a = input.nextDouble();
		System.out.print("b=");
		double b = input.nextDouble();
		System.out.print("c=");
		double c = input.nextDouble();
		
		double p = 0.5*(a+b+c);
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("TALBAI=" + area);
		
		input.close();
		
	}
	

}
