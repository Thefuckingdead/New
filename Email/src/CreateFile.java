import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		try {
			File myobj = new File("Khuat_Dang_Son.txt");
			if(myobj.createNewFile()) {
				System.out.println("File create : " + myobj.getName());
			}else {
				System.out.println("File already exist !!!");
			}
		}catch(IOException e) {
			System.out.println("An error Occurs !!!");
			e.printStackTrace();
		}

	}

}
