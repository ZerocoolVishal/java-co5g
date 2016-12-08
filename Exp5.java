import java.util.Vector;

class Exp5 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		for (int i = 0 ; i < 5 ; i ++){

			v.addElement(new String(args[i]));
		}
		System.out.println("Objects Store in the vector : ");
		System.out.println(v);
	}
}