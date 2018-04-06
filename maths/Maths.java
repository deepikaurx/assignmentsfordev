package maths;

import java.util.Scanner;

public class Maths {

	public static void main(String args[]) {
		addition(10, 2);
		times(10, 2);
		divide(10, 2);
		subtract(10, 2);
	}

	public static int addition(int a, int b) {
		System.out.println("Enter two Numbers : ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		int result = a + b;
		System.out.println("The result of the two numbers : " + result);
		return result;
	}

	public static int times(int a, int b) {
		System.out.println("Enter two Numbers : ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		int result = a * b;
		System.out.println("The result of the two numbers : " + result);
		return result;
	}

	public static int divide(int a, int b) {
		System.out.println("Enter two Numbers : ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		int result = a / b;
		System.out.println("The result of the two numbers : " + result);
		return result;
	}

	public static int subtract(int a, int b) {
		System.out.println("Enter two Numbers : ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		int result = a - b;
		System.out.println("The result of the two numbers : " + result);
		return result;
	}

}