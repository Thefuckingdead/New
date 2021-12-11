import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myobj = new File("Horse.txt");
			System.out.println(myobj.getAbsolutePath());
			Scanner myreader = new Scanner(myobj);
			while(myreader.hasNextLine()) {
				String data = myreader.nextLine();
				System.out.println(data);
			}
			myreader.close();
		}catch(FileNotFoundException e) {
			System.out.println("Can find your File :( ");
			e.printStackTrace();
		}
	}

}
