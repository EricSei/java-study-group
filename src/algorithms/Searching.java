package algorithms;

import java.util.HashSet;
import java.util.Set;

public class Searching {
	
	
	public static void main(String[] args) {
		
		//storage
		String[] fruits = { "orange", "papaya", "mango", "pineapple", "apple"};
		
		
		
		String query = "applee"; 
		boolean isFound = false;
		
		//logic or pseudo code
		//compare
		//iteraing frutis array
		//if found return boolean true/false
		
		//equals, ==
		
		int index = new Searching().linearSearch(fruits, query);
		
		System.out.print(query + " found at " + index);
		
		
		//using set
		System.out.println("---------- Using Set -----------");
		Set<String> setFruits = new HashSet<>();
		setFruits.add("orange");
		setFruits.add("papaya");
		setFruits.add("mango");
		setFruits.add("pineapple");
		setFruits.add("apple");
		
		String name = "apple";
		
		if(setFruits.contains(name)) {
			System.out.println(name + " is found" );
		}
	}
	
	//output: index of seraching fruit name
	//notfound -1, found : index
	int linearSearch(String[] arrays, String name) {
		
		int index = -1;
		
		for(int i=0; i < arrays.length; i++) {
			if( arrays[i].equals(name)) {
				index = i;
			}
		}
		
		
		
		return index;
	}
	
	
	//abstraction, reusable code
	//
	boolean linearSerach(int[] numbers, int target) {
		
		boolean isFound = false;
		
		for(int i=0; i < numbers.length; i++) {
			
			System.out.println("Searching at index " + i);
			
			if( numbers[i] == target ) {
				
				System.out.println(" is found.");
				isFound = true;
			}
		}
		
		return isFound;
	}
	

}
