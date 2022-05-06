package core.java;

import java.util.ArrayList;

//HW1
// 1 to many 

//Liabray name, location, --> Many Books id, name, author  ArrayList

// create 1 Lib and 10 books and print them

public class Main {
	
	
	public static void main(String[] args) {
		
		Person ps1 = new Person("Eric", "eric@gmail.com");
		
		ArrayList<Person> persons = new ArrayList<>(); // [ person1, person2, ]
		
		
		for(int i=1; i < 11; i++) {
			Person temp = new Person("Name"+i , "Email"+i );
			
			persons.add( temp  );
		}
		
		
		for(int i=0; i < persons.size(); i++) {
			
			System.out.println( persons.get(i).name + " " + persons.get(i).email );
		}
		
	}
}
