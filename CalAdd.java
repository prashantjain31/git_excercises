<<<<<<< HEAD
import java.util.*;
=======
import java.io.*;

>>>>>>> origin/main

// This code is used for addition of two numbers
class CalAdd {
	public static void main(String args[]) {
		float a, b, res;
		char choice, ch;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Add two numbers");
			System.out.println("2. Exit");
			// for same reason made changes here also in main to simulate merge conflict
			//Made some changes in file for some reason
			System.out.print("Enter your choice: ");
			choice = sc.next().charAt(0);

			switch(choice) {
				case '1': 
					System.out.print("Enter two Numbers: ");
					a = sc.nextFloat();// input for variable a
					b = sc.nextFloat();//input for variable b
					res = a + b;//result stores addition of both the variables
					System.out.println("Result: " + res);
					break;
				case '2':
					System.exit(0);
					break;

				case '3':
					System.out.print("Enter two Numbers: ");
					a = sc.nextFloat();
					b = sc.nextFloat();
					res = a - b;// res variable has diff of a and b
					System.out.println("Result: " + res);
				default:
					System.out.println("Invalid Choice");
					break;
			}
		} while(choice != '3');
	}
}
