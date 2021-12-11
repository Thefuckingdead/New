import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Email> emailList = new ArrayList<Email>();
		Email email1 = new Email("Son", "Khuat", "Dev");
		Email email2 = new Email("Ao", "Loi", "Sale");
		Email email3 = new Email("Duong", "Minh", "Manager");
		
		emailList.add(email1);
		emailList.add(email2);
		emailList.add(email3);
		
		for(Email mail : emailList) {
			System.out.println(mail.getEmail());
		}
	}

}
