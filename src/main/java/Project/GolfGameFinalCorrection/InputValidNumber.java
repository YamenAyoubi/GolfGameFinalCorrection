package Project.GolfGameFinalCorrection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidNumber {

	static Scanner sc = new Scanner(System.in);

	public int inputNumber() {
		return inputNumber();
	}

	public static int inputNumber(int startPosition, int endPosition) {
		int number = 0;
		boolean run = true;
		while (run) {
			while (run) {
				try {
					number = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Incorrect input");
					System.out.print("Enter Number Please... \n");
				} finally {
					sc.nextLine();
				}
			}
			if (startPosition == 0 && endPosition == 0)
				endPosition = number;
			if (number >= startPosition && number <= endPosition)
				break;
			else {
				System.out.println("Incorrect input it muste be: " + startPosition + " <=> " + endPosition + " \n");
			}
		}
		return number;
	}
}
