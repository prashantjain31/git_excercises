import java.io.*;


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
					a = sc.nextFloat();
					b = sc.nextFloat();
					a = sc.nextFloat(); //asdasdasdasdasd
					b = sc.nextFloat(); // asdasdasdasfryhgsdv
					res = a + b; // ffhtrysrgsgs asdawe4sefdryyrefewsfs
					System.out.println("Result: " + res);
					break;
				case '2':
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
		} while(choice != '2');
	}
}
