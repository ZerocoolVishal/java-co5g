import java.util.Scanner;

class Exp2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numb1,numb2,ans;
		System.out.print("Enter two numbers : ");
		numb1 = input.nextInt();
		numb2 = input.nextInt();
		if (numb1 > 10 && numb2 > 10) {

			ans = numb1 + numb2;
			System.out.println("Addition is " + ans);
		} else {

			System.out.println("both number should be greater than 10");
		}
	}
}