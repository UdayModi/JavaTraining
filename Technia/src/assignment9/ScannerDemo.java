package assignment9;

import java.util.Scanner;

public class ScannerDemo {

	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);

		int age;
		String height;
		double weight;

		System.out.print( "How old are you? " );
		age = input.nextInt();

		System.out.print( "How tall are you? " );
		height = input.next();

		System.out.print( "How much do you weigh? " );
		weight = input.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + " tall and " + weight + " heavy." );
	}
}
/*OUTPUT
How old are you? 44
How tall are you? 6
How much do you weigh? 45
So you're 44 old, 6 tall and 45.0 heavy.
 */