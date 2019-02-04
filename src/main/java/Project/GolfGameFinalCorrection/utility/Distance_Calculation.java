package Project.GolfGameFinalCorrection.utility;

public class Distance_Calculation {

	int velocity;
	int angle;
	static int distance;
	static double gravity = 9.8;
	double total;
	
	public static int Distance (int velocity,int angle) {
		
		double angleinradians = ((Math.PI / 180) * angle);

		return distance = 
				(int) ((Math.pow(velocity, 2) / gravity * Math.sin(2 * angleinradians)) * 10 / 10);

	}
}
