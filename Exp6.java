import java.util.Scanner;

class Book {

	String author,title,publisher;
}
class BookInfo extends Book {

	double price;
	int stockPosition;
	void addBook() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Title : ");
		title = input.nextLine();
		System.out.print("Enter Author : ");
		author = input.nextLine();
		System.out.print("Enter Publisher : ");
		publisher = input.nextLine();
		System.out.print("Enter Price : Rs.");
		price = input.nextDouble();
		System.out.print("Enter Stock Position : ");
		stockPosition = input.nextInt();
	}
	void show() {

		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Publisher : " + publisher);
		System.out.println("Price : Rs." + price);
		System.out.println("Stock Position : " + stockPosition);
	}
	void display() {


		System.out.println(title + "\t" + author + "\t" + publisher + "\t" + price + "\t" + stockPosition);
	}
}
class Exp6 {

	public static void main(String[] args) {
		
		BookInfo[] book = new BookInfo[3];
		for (int i = 0 ; i < book.length ; i++) {

			book[i] = new BookInfo();
		}
		System.out.println("Enter Books :>");
		for (int i = 0 ; i < book.length ; i++) {
			
			book[i].addBook();
		}
		System.out.println("Show Books :>");
		/*for (int i = 0 ; i < book.length ; i++) {
			
			book[i].show();
		}*/
		System.out.println("Title\t\t\tAuthor\t\tPublisher\t\tPrice\tStock Position");
		System.out.println("--------------------------------------------------------------------------------------");
		for (int i = 0 ; i < book.length ; i++) {
			
			book[i].display();
		}		
	}
}