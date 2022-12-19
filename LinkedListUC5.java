package linkedListUseCase;

public class LinkedListUC5 {

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

	public void push(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
	}

	public Node popFirst(Node head) {
		if (isEmpty()) {
			return null;
		}
		System.out.println("After deleted First element");
		head = head.next;
		return head;
	}

	public static void main(String[] args) {
		LinkedListUC5 list = new LinkedListUC5();
		list.push(56);
		list.push(30);
		list.push(70);
		Node temp = head;
		temp = list.popFirst(head);
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}

}
