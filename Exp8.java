import java.util.Scanner;

class AuthenticationFailureException extends Exception {

	AuthenticationFailureException() {

		super("Wrong username or password");
	}
}
class Exp8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String username = "vishal";
		String password = "123456";
		String un,pw;

		try{

			System.out.print("Enter username : ");
			un = input.nextLine();
			System.out.print("Enter password : ");
			pw = input.nextLine();

			if (un.equals(username) == false || pw.equals(password) == false) {

				throw new AuthenticationFailureException();
			} 
			System.out.println("Welcome " + username + " !!");

		} catch (Exception e) {

			System.out.println(e);
		}
			
	}
		
}