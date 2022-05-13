package core.java;

//Person 
// School: Student, Professor, Teacher, 
//		   Employee: Clerk, Adminstrator, Cleaner 
// name, email adress, pw, phone, address, SSN, titile, department
public class Person {
	
	private String name; //default
	protected String email;
	private String password;
	private int phone;
	private int ssn;
	private String title;
	private boolean isEnabled = false;
	
	private String address = "";
	
	
	//constructor
	public Person( ) {
		this.name = "Eric";
		this.password = "0";
		this.email = "eric@gmail.com";
	}
	
	//constructor
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	//void method
	
	public void display() {
		System.out.println(" Person: " + this.name + " " + this.password +" " + this.phone );
	}
	
	
	//return method
	public String getName() {
		//busness logic
		return this.name;
	}
	
	public void setName(String name) {
		//business logic
		// validation
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	
	
}
