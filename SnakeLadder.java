import java.util.Random;

public class SnakeLadder {
	
	private final static int INITIAL_POSITION = 0;
	static int currentPosition = INITIAL_POSITION;
	static int dieNum;

	//rolling a die
	public static void dieRoll() {
		Random rand=new Random();
		 dieNum = rand.nextInt(6) + 1;
		System.out.println("You Got: "+dieNum);
	}
	
	public static void checkOption() {
		Random rand=new Random();
		int option = rand.nextInt(3);
		//System.out.println("Your option is: "+option);
		
		dieRoll();
		switch (option) {
		case 1:
			//for Ladder
			currentPosition += dieNum;
			break;
		case 2:
			//for Snake
			currentPosition -= dieNum;
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

	public static void main(String[] args) {
		checkOption();

	}

}