package UC5;

public class LinkedList<T> {

	MyNode<T> head;

	
//	 * Adding Node to the linkedList
	  
//	 * @param data is generic type 
	
	public void add(T data) {
		MyNode<T> newNode = new MyNode<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;

		} else {
			MyNode<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}
	

//	 * @param Node data added at Start
	
	public  void addAtStart (T data) {
		MyNode<T> node =new MyNode<>();
		node.data=data;
		node.next=head;
		head=node;
	}
	
//	 * @param index is to add new node at index number position
//	 * @param data is key value of node
	 
	public void addAtIndex(int index, T data) {
		MyNode<T> newNode = new MyNode<>();
		newNode.data = data;

		if (index == 0) {
			addAtStart(data);
		} else {
			MyNode<T> node = head;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			newNode.next = node.next;
			node.next = newNode;
		}
	}
	
	
//	 * @param data
//	 * Deleting first Node from Link

	public void deleteFirst (){
		if (head != null) {
			MyNode<T> Head = head.next;
			
			head=Head;
		}
	}
	
//	 * @show is a method for Printing The Data Of Node till next equal to null
	 
	public void show() {
		MyNode<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node=node.next;;
		}
		System.out.print(node.data);
	}
}