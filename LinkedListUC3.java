package linkedListUseCase;

public class LinkedListUC3<T> {

	public class Node {
		int data;
		Node next;
		Node previous;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("LinkedList Sequence...!");
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.previous;
		}

	}

	public static void main(String[] args) {
		LinkedListUC3<Integer> list = new LinkedListUC3<Integer>();
		list.push(30);
		list.push(70);
		list.push(56);

		list.display();
	}
}
