public class SingleLinkedList<E> {
	public static class Node<E> {
		public E elem;
		public Node<E> next;

		public Node(E elem) {
			this(elem, null);
		}

		public Node(E elem, Node<E> next) {
			this.elem = elem;
			this.next = next;
		}
	}

	private Node<E> head;
	private Node<E> tail;
	int size;

	public SingleLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void addFirst(E elem) {
		if (head == null) {
			head = new Node<>(elem);
			tail = head;
			size = 1;
			return;
		}
		Node<E> tmp = new Node<>(elem);
		tmp.next = head;
		head = tmp;
		size++;
	}

	public void addLast(E elem) {
		if (tail == null) {
			addFirst(elem);
			return;
		}
		Node<E> tmp = new Node<>(elem);
		tail.next = tmp;
		tail = tmp;
		size++;
	}

	public E removeFirst() {
		if (head == null) {
			return null;
		}
		if (size == 1) {
			E tmp = head.elem;
			head = null;
			tail = null;
			size = 0;
			return tmp;
		}
		E tmp = head.elem;
		head = head.next;
		size--;
		return tmp;
	}

	public E getFirst() {
		if (head == null) {
			return null;
		}
		return head.elem;
	}

	public E getLast() {
		if (tail == null) {
			return null;
		}
		return tail.elem;
	}

	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		if (head == null) {
			return "Empty";
		}
		Node<E> walker = head;
		StringBuilder sb = new StringBuilder();
		while (walker != null) {
			sb.append(walker.elem.toString());
			sb.append("->");
			walker = walker.next;
		}
		sb.append("null");
		return sb.toString();
	}
}
