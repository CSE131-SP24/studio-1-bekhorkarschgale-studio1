package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	System.out.println("Please type an integer");
	int n1 = in.nextInt();
	System.out.println("Please type an integer");
	int n2 = in.nextInt();
	System.out.println("This is the average of your numbers");
	System.out.println((n1+n2)/2.0);
	

	}

}
