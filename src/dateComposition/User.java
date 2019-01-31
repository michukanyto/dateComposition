package dateComposition;

public class User {
	String name;
	Date theDate;
	
	
	public User(String name, Date theDate) {
		this.name = name;
		this.theDate = theDate;	
//		System.out.printf("%s", this);
	
	}

	
	
	public String toString() {
		return String.format("User => %s and Birthdate = %s",name,theDate);
	}
}
