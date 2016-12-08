import useFul.UseMe;
import java.util.Scanner;

class Exp7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Length & Breadth (cm): ");
		float l = input.nextFloat();
		float b = input.nextFloat();
		System.out.println("Area : " + UseMe.area(l,b) + " sqcm.\n");

		System.out.print("Enter Marks Obtained : ");
		float ob = input.nextFloat();
		System.out.print("Enter Total Marks : ");
		float tot = input.nextFloat();
		System.out.println("Percentage : " + UseMe.percentage(ob,tot) + "%");
	}
}