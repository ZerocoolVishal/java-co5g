import java.io.*;

class Exp11 {

	public static void main(String[] args) throws IOException {
		
		String fileName = args[0];
		BufferedReader read = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = read.readLine()) != null) {

			System.out.println(line);
		}
	}
}