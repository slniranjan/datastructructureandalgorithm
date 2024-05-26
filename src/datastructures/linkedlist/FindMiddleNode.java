package datastructures.linkedlist;

/**
 * Implement a method called findMiddleNode that returns the middle node of the linked list.
 * If the list has an even number of nodes, the method should return the second middle node.
 * Note: this LinkedList implementation does not have a length member variable.
 */
public class FindMiddleNode {

	private Node head;
	private Node tail;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public FindMiddleNode(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (head == null) {
			System.out.println("Head: null");
			System.out.println("Tail: null");
		} else {
			System.out.println("Head: " + head.value);
			System.out.println("Tail: " + tail.value);
		}
		System.out.println("\nLinked List:");
		if (head == null) {
			System.out.println("empty");
		} else {
			printList();
		}
	}

	public void makeEmpty() {
		head = null;
		tail = null;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public Node findMiddleNode() {

		Node slow = head;
		Node fast = head;

		while(fast !=null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}
}
