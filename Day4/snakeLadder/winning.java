public class winning {
static final int noPlay = 0, snake = 1, ladder = 2;
		
	public static void main(String[] args) {
	
 //static final int noPlay = 0, snake = 1, ladder = 2;
		int player = 0;
		while (player < 100) {	
		double dice = Math.floor(Math.random() * 10 % 6 + 1);	// For getting Dice 1 to 6
		System.out.println("Dice: " + dice);		
		double option = Math.floor(Math.random() * 10 % 3);	// for getting option 0, 1 or 2
		System.out.println("Option: " + option);
		
		switch ((int) option) {
			case snake:
				//if (player <= 94) {}
				player -= (int) dice; 
				break;
			case ladder:
				player += (int) dice;
				if (player > 100) {	player -= (int) dice;	}
				break;
			default:
				player = player;
				break;
			}
	System.out.println("Player position: " + player);	
	if (player < 0) {
			player = 0; }
		
		}
	
	}
}
