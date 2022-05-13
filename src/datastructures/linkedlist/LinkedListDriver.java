package datastructures.linkedlist;

public class LinkedListDriver {
	
	public static void main(String[]args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.addNode(3);
		linkedList.addNode(6);
		linkedList.addNode(9); //head
		
		System.out.println("First Value: " + linkedList.head.value); //9
		System.out.println("second Value: " + linkedList.head.next.value); //6
		System.out.println("Thrid Value: " + linkedList.head.next.next.value); //3
		
		System.out.println("Head Node: " + linkedList.head.value);
		
		
		System.out.println("Size: " + linkedList.size);
		
	}
}
