package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
boolean L = x>y;	
boolean M = y>z;
boolean greater = (L&&M);
boolean N = z>y;
boolean O = y>x;
boolean less = (N&&O);
System.out.print (greater||less);
}

}
