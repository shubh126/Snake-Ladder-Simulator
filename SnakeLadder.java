import java.util.Random;

public class SnakeLadderUC1 {
	
	private final int POSITION = 0;
	int currentPosition = POSITION;
	
	public static void dieRoll() {
		Random rand=new Random();
		int dieNum = rand.nextInt(6) + 1;
		System.out.println("You Got: "+dieNum);
	}

	public static void main(String[] args) {
		dieRoll();

	}

}
