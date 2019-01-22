package Project.GolfGameFinalCorrection;

import java.util.Scanner;

public class Calculations {

	static Scanner in = new Scanner(System.in);

	public static void Go() {

		double[] distance = new double[0];
		double gravity = 9.8;
		boolean running = true;
		boolean win = false;
		double HoleDistance;
		int NumberOfTries = 0;
		double total = 0;
		int velocity;
		int angle;

		while (running) {

			HoleDistance = Hole.getHoleDistance();

			System.out.println(Hole.getHoleDistance() + " Your Target Distance Good Luck :)");
			if (NumberOfTries == 0) {

				HoleDistance = Hole.getHoleDistance();
				total = 0;
			}

			NumberOfTries = NumberOfTries + 1;
			do {

				NumberOfTries++;

				System.out.println("enter the shot power");
				velocity = InputValidNumber.inputNumber(5, 299);

				System.out.println("enter the angel degrees ");
				angle = InputValidNumber.inputNumber(2, 89);

				double angleinradians = ((Math.PI / 180) * angle);

				distance = Store_The_Result.addToArray(distance,
						(Math.round((Math.pow(velocity, 2) / gravity * Math.sin(2 * angleinradians)) * 10) / 10));

				for (int i = 0; i < distance.length; i++) {

					total += distance[i];
				}

				System.out.println("The Ball distance  " + distance[distance.length - 1] + " Total: " + total);

				if (total < HoleDistance) {
					System.out.println("Too Much Weak ! ");
				}

				if (total == HoleDistance) {
					System.out.println("Gollllllllllllll!!!!!" + " WOW Lucky Shot! ");

					win = true;

				}

				if (total > HoleDistance) {
					System.out.println("Too Much Strong Out Of Stadium! ");

					break;
				}

			} while (!win && NumberOfTries <= 5);
			distance = new double[0];
			NumberOfTries = 0;
			System.out.println("Do You Want To Play Again ? (Y/N)");
			String answer = DoYouWannaPlayAgain.GetPlayAgainAnswer();
			running = DoYouWannaPlayAgain.playagain(answer);
		}
	}

}
