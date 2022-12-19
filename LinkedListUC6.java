package linkedListUseCase;

public class LinkedListUC6 {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head = null;
	public static Node tail = null;

	public boolean isEmpty() {
		return head == null;
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
	}

	public Node popLast(Node tail) {
		if (isEmpty()) {
			System.out.println("Empty LinkedList");
		}
		System.out.println("After deleted last element");
		tail.next = tail;
		return tail;
	}

	public static void main(String[] args) {
		LinkedListUC6 list = new LinkedListUC6();
		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
		Node last = list.popLast(tail);
		Node temp = head;
		while (temp != last) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}

}
