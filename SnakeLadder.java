import java.util.Random;

public class SnakeLadder {
	
	private final static int INITIAL_POSITION = 0;
	private final static int WINNING_POSITION = 100;
	int currentPosition = INITIAL_POSITION;
	int dieNum;
	
	//rolling a die
	public void dieRoll() {
		Random rand=new Random();
		 dieNum = rand.nextInt(6) + 1;
		System.out.println("You Got: "+dieNum);
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
			if (currentPosition > WINNING_POSITION)
			{
				currentPosition -= dieNum;
			}
			break;
		case 2:
			//for Snake
			currentPosition -= dieNum;
			if (currentPosition < INITIAL_POSITION)
			{
				currentPosition += dieNum;
			}
			break;
		default:
			//for no-play
			break;
		}
		//at initial position snake bite happens position must be 0
		if (currentPosition < 0)
		{
			currentPosition = INITIAL_POSITION;
		}
		System.out.println("Current Position: "+currentPosition);
	}
	
	public void winningPosition() {
		while (currentPosition < WINNING_POSITION) {
			checkOption();
		}
		System.out.println(" !... Player Won ...! ");
	}

	public static void main(String[] args) {
		SnakeLadder a = new SnakeLadder ();
		a.winningPosition();

	}

}
