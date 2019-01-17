package Project.GolfGameFinalCorrection;

import java.util.Scanner;

public class App 
{

	static Scanner in = new Scanner (System.in);
	static InputValidNumber usethemethod = new InputValidNumber();
		
		public static void main(String[] args) 
	    {
	    
				
	    		double []distance = new double [0];
	    		double gravity =9.8;
	    		boolean running = true;
	    		boolean win =false;
	    		double HoleDistance;
	    		int NumberOfTries=0;
	    		double total;
	    		int velocity;
	    		int angle;
	    		
	    		
	    		while (running) {
	    			
	    			HoleDistance=Hole.getHoleDistance();
	        		
	    			System.out.println(Hole.getHoleDistance() + " Your Target Distance Good Luck :)");
	    			if(NumberOfTries == 0) {
	    			
	   				HoleDistance = Hole.getHoleDistance();}
	 
	    			NumberOfTries = NumberOfTries + 1 ;
	    			do {

	    			NumberOfTries++; 
					System.out.println("enter the shot power");
					velocity = usethemethod.inputNumber(5,299);

					System.out.println("enter the angel degrees ");	
					angle = usethemethod.inputNumber(2,89);

					
					double angleinradians = ((Math.PI / 180) * angle);
					
				    distance = Store_The_Result.addToArray(distance, (Math.round((Math.pow(velocity, 2) / gravity * Math.sin(2 * angleinradians)) * 10 ) / 10) );
				    
				    total = 0;
					
				    for (int i = 0; i < distance.length; i++) {
						
				    	total += distance[i];
					}
				    
					System.out.println( "The Ball distance  " + distance[distance.length - 1] + " Total: " + total );


					 if (total < HoleDistance) {
						System.out.println("Too Much Weak ! ");}
					 
					 
					 if (total == HoleDistance) {
							System.out.println("Gollllllllllllll!!!!!" + " WOW Lucky Shot! ");
							
						win=true;
						
					 }
					 
						if (total > HoleDistance ) {
							System.out.println("Too Much Strong Out Of Stadium! ");
							break;
						}
					 

	    		}while(!win && NumberOfTries<=5 );

						System.out.println("Do You Want To Play Again ? (Y/N)");
						String answer = GetPlayAgainAnswer();
						running = PlayAgain(answer);
						NumberOfTries=0;
						total=0;}
					}	
	 
	    	
		private static boolean PlayAgain(String answer) {
			String upperCaseString = answer.toUpperCase();
	 		switch(upperCaseString) {
	 		case "Y":
	 			System.out.println("welcome Back 👍");
	 			return true;
	 		default:
	 			System.out.println(" ಠ_ಠ   See You Soon ಠ_ಠ");
	 			return false;
	 			
	 		}

		}
		
	 	    public static String GetPlayAgainAnswer() {
	 			return in.nextLine();
	 			
	 	    }

}
