import java.util.Scanner;
import java.util.Random;

public class RAND {
	public static void main(String[] args) throws InterruptedException {
		Scanner Input = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(11);
		
		System.out.println("THE GREAT GUESSING GAME!\n");
		Thread.sleep(1000);
		System.out.println("GUESS THE NUMBER... 0-10 [or type '12' to quit");
		
		while (true) {
			System.out.printf("GUESS: ");
			int choice = Input.nextInt();
			
			if (choice == number) {
				Thread.sleep(1000);
				System.out.println("\nCongratulations! Do another guess to try again or type '100' to quit.\n");
			}
			
			else {
				Thread.sleep(1000);
				System.out.println("\nWRONG! Do another guess to try again or type '100' to quit\n");
			}
		}
	}
}
