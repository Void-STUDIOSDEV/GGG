import java.util.Scanner;
import java.util.Random;
import java.util.Locale;

public class v2 {
	static int points;
	
	public static void main(String[] args) throws InterruptedException {
		Scanner Input = new Scanner(System.in);
		Random random = new Random();
		int easy = random.nextInt(6);
		int mild = random.nextInt(11);
		int hard = random.nextInt(21);
		int imp = random.nextInt(6);
		
		System.out.println("THE LAMEST GUESSING GAME!\n");
		Thread.sleep(1000);
		
		
		while (true) {
			System.out.println("[E]ASY [+2 Points / -1 Points / 0-5] || [M]ILD [+2 Points / -2 Points / 0-10] || [H]ARD [+3 Points / -5 Points / 0-20] || [I]mpossible / ???");
			System.out.printf("CHOICE: ");
			char a = Input.next().charAt(0);
			char b = Character.toUpperCase(a);
			
			if (b == 'E') {
				Thread.sleep(1000);
				System.out.println("\nGUESS THE NUMBER... 0-5!");
			
				while (true) {
					System.out.printf("GUESS: ");
					int choice = Input.nextInt();
				
					if (choice == easy) {
						Thread.sleep(1000);
						points += 2;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("Congratulations! Do another guess?\n");
					}
			
					else {
						Thread.sleep(1000);
						points -= 1;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("WRONG! Do another guess to try again or type '100' to quit\n");
					}
				
					if (points == 50) {
						System.out.println("YOU WIN!! CONGRATULATIONS, NOW TRY A HARDER DIFFICULTY!!!");
						break;
					}
				}
			}
			
			
			
			else if (b == 'M') {
				Thread.sleep(1000);
				System.out.println("\nGUESS THE NUMBER... 0-10!");
			
				while (true) {
					System.out.printf("GUESS: ");
					int choice = Input.nextInt();
				
					if (choice == mild) {
						Thread.sleep(1000);
						points += 2;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("Congratulations! Do another guess?\n");
					}
				
					else {
						Thread.sleep(1000);
						points -= 2;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("WRONG! Do another guess to try!\n");
					}
					
					if (points == 50) {
						System.out.println("YOU WIN!! CONGRATULATIONS! Mild difficulty is probably the best for a person like you!\n");
						break;
					}
				}
			}
			
			
			
			else if (b == 'H') {
				Thread.sleep(1000);
				System.out.println("\nGUESS THE NUMBER... 0-5!");
			
				while (true) {
					System.out.printf("GUESS: ");
					int choice = Input.nextInt();
				
					if (choice == hard) {
						Thread.sleep(1000);
						points += 3;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("Congratulations! Do another guess?\n");
					}
				
					else {
						Thread.sleep(1000);
						points -= 5;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("\nWRONG! Do another guess to try again!\n");
					}
					
					if (points == 50) {
						System.out.println("You can't fight change - Dutch van Der Linde.\n");
						break;
					}
				}
			}
			
			
			
			else if (b == 'I') {
				Thread.sleep(1000);
				System.out.println("\nGUESS THE NUMBER... 0-5!");
			
				while (true) {
					System.out.printf("GUESS: ");
					int choice = Input.nextInt();
				
					if (choice == imp) {
						Thread.sleep(1000);
						points += 1;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("Congratulations! Do another guess?\n");
					}
					
					else {
						Thread.sleep(1000);
						points -= 10;
						System.out.printf("POINTS: ");
						System.out.println(points);
						Thread.sleep(1000);
						System.out.println("\nWRONG! Do another guess to try again!\n");
					}
					
					if (points == 100) {
						System.out.println("After all the testing, I have not even guessed right in this one. Congratulations, really!");
						break;
					}
				}
			}
			
			
			
			else {
				System.out.println("INVALID CHOICE. TRY AGAIN!\n");
			}
		
		}
	}
}
