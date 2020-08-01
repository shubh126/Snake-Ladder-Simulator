import java.util.Random;

public class SnakeLadder {
	
	private final static int POSITION = 0;
	static int currentPosition = POSITION;
	static int dieNum;
	public static void dieRoll() {
		Random rand=new Random();
		 dieNum = rand.nextInt(6) + 1;
		System.out.println("You Got: "+dieNum);
	}
	
	public static void checkOption() {
		Random rand=new Random();
		int option = rand.nextInt(3);
		System.out.println("Your option is: "+option);
		int FOR_NO_PLAY = 2;
		int FOR_LADDER = 0;
		int FOR_SNAKE = 1;
		
		dieRoll();
		
		switch (option) {
		case 0:
			currentPosition += dieNum;
			break;
		case 1:
			currentPosition -= dieNum;
			break;
		case 2:
			currentPosition += 0;
			break;
		}
		System.out.println("Current Position: "+currentPosition);
	}

	public static void main(String[] args) {
		checkOption();

	}

}