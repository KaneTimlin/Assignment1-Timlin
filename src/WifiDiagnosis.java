import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userInput;
		int fixed = 0;
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis tool might work.\n");
		System.out.println("First Step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		userInput = input.nextLine().toLowerCase();
		if (userInput.equals("no")) {
			System.out.println("Second step: reboot your router");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			userInput = input.nextLine().toLowerCase();
			if (userInput.equals("no")) {
				System.out.println("Third step: Make sure the cables connecting the router are firmly plugged in and the router is getting power");
				System.out.println("Are you able to connect with the internet? (yes or no)");
				userInput = input.nextLine().toLowerCase();
				if (userInput.equals("no")) {
					System.out.println("Fourth Step: move your computer closer to the router");
					System.out.println("Are you able to connect with the internet? (yes or no)");
					userInput = input.nextLine().toLowerCase();
					if (userInput.equals("no")) {
						System.out.println("Fifth step: contact your isp");
						fixed = 0;
						
					} else if (userInput.equals("yes")) {
						fixed = 4;
					}
				} else if (userInput.equals("yes")) {
					fixed = 3;
				}
			} else if (userInput.equals("yes")) {
				fixed = 2;
			}
		} else if (userInput.equals("yes")) {
			fixed = 1;
		}
		switch (fixed) {
			case 1: System.out.println("Rebooting your computer seemed to work"); break;
			case 2: System.out.println("Rebooting the router seemed to work"); break;
			case 3: System.out.println("Checking the routers cables seemed to work"); break;
			case 4: System.out.println("Moving your computer closer to the router seemed to work"); break;
			default: System.out.println("Make sure your ISP is hooked up to your router");
		}
		System.out.println("Thank you for testing my program!\nPROGRAMMERS NAME: KANE TIMLIN\nDUE DATE: 9/13/2020\nASSIGNMENT 1");
	}
}
