import java.util.Scanner;

class Mobile {

	String companyName;
	float screenSize;
	void createMobile () {

		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the company name : ");
		companyName = scan.nextLine();
		System.out.print("Enter the screen size : ");
		screenSize = input.nextFloat();
	}
	void displayMonile () {

		System.out.println("Company name : " + companyName);
		System.out.println("Screen size : " + screenSize);
	}
}
class Exp3 {

	public static void main(String[] args) {
		
		Mobile mob[] = new Mobile[5];
		System.out.println(mob.length);
		for (int i = 0 ; i < mob.length ; i++) {

			mob[i] = new Mobile();
		}
		System.out.println("Enter data :> ");
		for (int i = 0 ; i < mob.length ; i++) {

			mob[i].createMobile();
		}
		System.out.println("Diplay data :> ");
		for (int i = 0 ; i < mob.length ; i++) {

			mob[i].displayMonile();
		}
	}
}