import java.util.Scanner;

class Exp4 {

	public static void main(String[] args) {
		
		String s = new String ("Hello Java");
		String search = "Java";
		//to search a word inside a string
		System.out.println("String : " + s);
		System.out.println("Search : " + search);
		if (s.indexOf(search) > 0) {

			System.out.println("Found !!");
		} else {

			System.out.println("Not Found !!");
		}
		//to compare two string
		String s1 = "Java";
		String s2 = "java world";
		System.out.println("String 1 : " + s1);
		System.out.println("String 2 : " + s2);
		if (s1.equals(s2) == true) {

			System.out.println("Both strings are equal");
		} else {

			System.out.println("Both strings are not equal");
		}
		//to print reverse string
		StringBuffer sb = new StringBuffer("java");
		System.out.println("String : "  + sb);
		sb.reverse();
		System.out.println("Reverse string is " + sb);
	}
}