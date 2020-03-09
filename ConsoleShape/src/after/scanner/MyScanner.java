package after.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {

	private static Scanner scan;

	public static Scanner getInstance() {
		if(scan == null) {
			scan = new Scanner(System.in);
		}
		return scan;
	}

	public static int scanInteger() {
		int number = -1;
		try{
			System.out.print("choice> ");
			number = scan.nextInt();
		}catch(InputMismatchException e){
			System.out.println(" [!]wrong choice. retry.");
			number = -1;
		}
		scan.nextLine();
		return number;
	}
}
