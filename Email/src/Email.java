
public class Email {

	private String firstname;
	private String lastname;
	private String depart;
	private String password;
	private String email;
	private String alternateEmail = "Khuatdangson_t65@hus.edu.vn";
	private int mailboxCapacity;
	public Email(String firstname, String lastname, String depart) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.depart = depart;
		this.password = RandomPasswd();
		this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + depart.toLowerCase() + ".hus.edu.vn";
		this.alternateEmail = "Son_dep_trai";
		this.mailboxCapacity = 500;
	}
	
	private String RandomPasswd() {
		String rndpassword = "26042002";
		return rndpassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getDepart() {
		return depart;
	}
	
	public String getEmail() {
		return email;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setPassword(String Password) {
		password = Password;
	}
	
	public void setMailboxCapacity(int MailboxCapacity) {
		mailboxCapacity = MailboxCapacity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstname + " "
				+ lastname + ": "
				+ depart + "\nEmail : "
				+ email ;
	}
	
	
	
}
