package forthLtask;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork4Main {

	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("Enter a nambers:");
		int consolInt = 0;
		while (consolInt >= 0) {

			consolInt = new Scanner(System.in).nextInt();
			

			if (consolInt < 0) {
				System.out.println("You entered negative number.");
				break;

			} else {
				
				sum += consolInt;
			}
		}

		System.out.println(sum);
	}

}