import java.util.Random;

public class SnakeLadder {
	
	private final static int INITIAL_POSITION = 0;
	private final static int WINNING_POSITION = 100;
	private final static int PLAYERS = 2;
	int currentPosition = INITIAL_POSITION;
	int dieNum;
	int roll = 0;
	int playerNo;
	static int[] multiPlayer = new int [3];
	//List <Integer> multiPlayer = new ArrayList <Integer> ();
	//rolling a die
	public void dieRoll() {
		Random rand=new Random();
		 dieNum = rand.nextInt(6) + 1;
		//System.out.println("You Got: "+dieNum);
	}
	
	public void forLadder() {
		if (currentPosition > WINNING_POSITION)
		{
			currentPosition -= dieNum;
		}
	}
	
	public void forSnake() {
		if (currentPosition < INITIAL_POSITION)
		{
			currentPosition += dieNum;
		}
	}
	
	public void checkOption() {
		Random rand=new Random();
		int option = rand.nextInt(3);
		//System.out.println("Your option is: "+option);
		
		dieRoll();
		switch (option) {
		case 1:
			//for Ladder
			currentPosition += dieNum;
			forLadder();
			checkOption();
			break;
		case 2:
			//for Snake
			currentPosition -= dieNum;
			forSnake();
			break;
		default:
			//for no-play
			break;
		}
		//at initial position snake bite happens position must be 0
		if (currentPosition < INITIAL_POSITION)
		{
			currentPosition = INITIAL_POSITION;
		}
		System.out.println("Player "+playerNo+" is at: "+currentPosition+" position");
	}
	
	//checking how many times die has been rolled for winning
	public void dieRollStatus(int multiPlayer) {
		checkOption();
		roll++;
		if (currentPosition == WINNING_POSITION)
		{
			System.out.println("Reached at "+currentPosition);
		}
		/*else if (currentPosition == INITIAL_POSITION)
		{
			currentPosition = INITIAL_POSITION;
		}*/
		System.out.println("Player rolled a die for: "+roll+" times \n_______________________________________");
	}
	
	// 2 players playing Snake & Ladder
	public void winningPosition() {
		
		int checking = 1;
		while (checking == 1) {
			for (playerNo = 1;playerNo <= PLAYERS;playerNo++) {
				multiPlayer[playerNo] = INITIAL_POSITION;
				System.out.println("Player "+playerNo+" is Playing");
				dieRollStatus(multiPlayer[playerNo]);
				multiPlayer[playerNo] = currentPosition;
				
				if (multiPlayer[playerNo] == WINNING_POSITION)
				{
					System.out.println("Player "+playerNo+" has won the game");
					checking = 0;
					break;
				}
			}
		}
		//System.out.println(" !... Player Won ...! ");
	}


	public static void main(String[] args) {
		SnakeLadder a = new SnakeLadder ();
		a.winningPosition();
	}

}
