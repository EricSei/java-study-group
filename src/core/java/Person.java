package core.java;

//Person 
// School: Student, Professor, Teacher, 
//		   Employee: Clerk, Adminstrator, Cleaner 
// name, email adress, pw, phone, address, SSN, titile, department
public class Person {
	
	String name; //default
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
	
	
	
	
	
}
