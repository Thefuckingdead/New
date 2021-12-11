import java.util.ArrayList;

public class Lol {

	public static void main(String[] args) {
		// Luyen ArrayList vs ten cac tuong Lol
		ArrayList<String> Lol = new ArrayList<String>();
		Lol.add("Yasuo");
		Lol.add("Zed");
		Lol.add("Leesin");
		Lol.add("Yone");
		for(String i : Lol) {
			System.out.println(i);
		}
	}

}
