package homework1;
import java.util.Scanner;

public class Application {
	public static void main (String args[]) {
		System.out.print("Welcome to Call Center");
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Where do you like to be tansferred");
		System.out.println("1. Complaint Department");
		System.out.println("2. Card Information");
		System.out.println("3. Lost Cards");
		System.out.print("Enter branch : ");
		String branch = inp.nextLine();
		
		if (branch.equalsIgnoreCase("Complaint Department")) {
			Complaint taken = new Complaint();
			taken.direct();
		}
		else if (branch.equalsIgnoreCase("Card Information")) {
			Information taken = new Information();
			taken.direct();
			taken.check();
		}
		else if (branch.equalsIgnoreCase("Lost Cards")) {
			Lost taken = new Lost();
			taken.direct();
			taken.share();
		}
		else {
			System.out.print("Not found");
		}
	}
}
