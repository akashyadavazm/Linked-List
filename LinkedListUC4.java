package linkedListUseCase;

public class LinkedListUC4 {

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

	public void insertAtMid(int data) {

		if (isEmpty()) {
			System.out.println("Empty LinkedList");
		} else {

			Node insertNode = new Node(data);
			Node ptr = head;
			int len = 0;
			// calculate length of the linked list(the number of nodes)
			while (ptr != null) {
				len++;
				ptr = ptr.next;
			}
			// count the number of nodes after which the new node is to be inserted
			int count;
			if ((len % 2) == 0) {
				count = (len / 2);
			} else {
				count = (len + 1) / 2;
			}
			ptr = head;

			while (count-- > 1)
				ptr = ptr.next;
			insertNode.next = ptr.next;
			ptr.next = insertNode;
		}
	}

	public static void main(String[] args) {
		LinkedListUC4 list = new LinkedListUC4();
		list.push(56);
		list.push(70);
		list.insertAtMid(30);
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}

	}

}
