package helloWorld;

import java.util.Scanner;

public class helloWorld {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		helloWorld hw = new helloWorld();

		String namee = hello();
		
		greet(namee);

		
	}

	public helloWorld() {
		System.out.println("hello World this is an Object Oriented Programming");
		System.out.println("heheh");


	}


	private static void greet(String namee) {
		int age = 0;
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Hello" + namee + " Your age is: " + age);
	}


	private static String hello() {

		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		String greet = "Hello World";
		for (int i = 1; 5 >= i; i++) {
			System.out.println(greet + " " + name);
		}
		return name;
	}

}
