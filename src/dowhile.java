import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value;
		do {
			System.out.println("Introduce un entero entre cero y  cien: ");
			value= in.nextInt();
		} while (value>100 || value<0);
			System.out.println("Thank you for entering "+ value);
		
		
		
	}

}
