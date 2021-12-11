import java.util.ArrayList;

public class Family {

	public static void main(String[] args) {

		ArrayList<String> family = new ArrayList<String>();
		
		family.add("Ong");
		family.add("Ba");
		family.add("Bo");
		family.add("Me");
		family.add("Anh");
		family.add("Chi");
		
		for(String i : family) {
			System.out.println(i);
		}
	}

}
