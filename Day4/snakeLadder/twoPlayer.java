public class twoPlayer {
static final int noPlay = 0, snake = 1, ladder = 2;
		
	public static void main(String[] args) {
	
 		int playerSwitch = 1;
		int winA = 0, winB = 0;
		while (winA < 100 && winB < 100) {	
	//Loop for 1st player
		if (playerSwitch == 1) {

		double dice = Math.floor(Math.random() * 10 % 6 + 1);	// For getting Dice 1 to 6
//		System.out.println("Dice: " + dice);		
		double option = Math.floor(Math.random() * 10 % 3);	// for getting option 0, 1 or 2
//		System.out.println("Option: " + option);

		if ((int) option == ladder) { playerSwitch = 1; } else { playerSwitch = 2; }		
		switch ((int) option) {
			case snake:
				winA -= (int) dice; 
				break;
			case ladder:
				winA += (int) dice;
				if (winA > 100) {	winA -= (int) dice;	}
				break;
			default:
				winA = winA;
				break;
			}

//	System.out.println("First Player Position: " + winA);	
	if (winA < 0) { winA = 0; }
		}
	//Loop for 2nd player
                if (playerSwitch == 2) {
                
                double dice = Math.floor(Math.random() * 10 % 6 + 1);   // For getting Dice 1 to 6
//                System.out.println("Dice: " + dice);
                double option = Math.floor(Math.random() * 10 % 3);     // for getting option 0, 1 or 2
//                System.out.println("Option: " + option);

                if ((int) option == ladder) { playerSwitch = 2; } else { playerSwitch = 1; }
                switch ((int) option) {
                        case snake:
                                winB -= (int) dice;
                                break;
                        case ladder:
                                winB += (int) dice;
                                if (winB > 100) {       winB -= (int) dice;     }
                                break;
                        default:
                                winB = winB;
                                break;
                        }

//      System.out.println("Second Player Position: " + winB);
        if (winB < 0) { winB = 0; }
                }
		
		}
	System.out.println("First Player Position: " + winA);
	System.out.println("Second Player Position: " + winB);
	System.out.println(" ");
	if (winA == 100) { System.out.println("First player is Winner"); }
        if (winB == 100) { System.out.println("Second player is Winner"); }
	
	}
}
