package datastructures.linkedlist;

public class LinkedList {
	
	public Node head;
	int size;
	
	public LinkedList( ) {
		this.head = null;
		this.size = 0;
	}
	
	//add a node at a head
	void addNode(int value) {
		//1) step
		Node newNode = new Node(value);
		//head is null
		if(this.head == null) {
			this.head = newNode; //3 step
			this.size += 1;
			return;
			
		}
		//head is not null
		newNode.next = this.head; //2 step
		this.head = newNode; //3 step
		
		this.size += 1;
		
	}
	
}
