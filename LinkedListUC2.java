package linkedListUseCase;

public class LinkedListUC2 {

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

	public static void main(String[] args) {
		LinkedListUC2 list = new LinkedListUC2();
		list.push(70);
		list.push(30);
		list.push(56);
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}

}
