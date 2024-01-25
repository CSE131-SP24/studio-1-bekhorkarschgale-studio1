package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Please type a year");
	int yr = in.nextInt();	
boolean good = (yr%4.0==0);
boolean bad = (yr%10==0); 
boolean exception = (yr%400==0);
boolean check = (bad && exception);
System.out.println (check || good);  
	}
	}