class Even extends Thread {

	public void run () {

		for (int i = 0 ; i <= 20 ; i++) {

			if (i % 2 == 0) {

				System.out.println("Even : " + i);
			}
		}
	}
}
class Odd extends Thread {

	public void run () {

		for (int i = 0 ; i <= 20 ; i++) {

			if (i % 2 != 0) {

				System.out.println("Odd : " + i);
			}
		}
	}
}
class Exp9 {

	public static void main(String[] args) {
		
		Even even = new Even();
		Odd odd = new Odd();
		even.start();
		odd.start();
	}
}