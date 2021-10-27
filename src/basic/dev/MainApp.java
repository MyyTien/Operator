package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		int a = sc.nextInt();
		System.out.println("Nhap b");
		int b = sc.nextInt();
		// Tong 
		int tong = a + b;
		System.out.println("Tong: " +tong);
		int hieu = a - b;
		System.out.println("Hieu: " + hieu);
		// Tich
		int tich = a * b;
		System.out.println("Tich: " + tich);
		// Thuong 
		int thuong = a / b;
		System.out.println("Thuong: " + thuong);
		// Gan c 
		boolean c = a > b;
		System.out.println("So sanh hon: " + c);
		 c = a < b;
		System.out.println("So sanh nho: " +c);
		c = a >= b;
		System.out.println("So sanh lon hon hoac bang: " + c);
		c = a <= b;
		System.out.println("So sanh be hon hoac bang: " + c);
					
	}
}
