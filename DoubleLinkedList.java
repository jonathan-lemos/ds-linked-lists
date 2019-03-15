public class DoubleLinkedList<E> {
	private static class Node<E> {
		public E elem;
		public Node<E> prev;
		public Node<E> next;

		public Node(E elem) {
			this(elem, null, null);
		}

		public Node(E elem, Node<E> prev, Node<E> next) {
			this.elem = elem;
			this.prev = prev;
			this.next = next;
		}
	}

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public DoubleLinkedList() {
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
		head.prev = tmp;
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
		tmp.prev = tail;
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
		head.next.prev = null;
		head = head.next;
		size--;
		return tmp;
	}

	public E removeLast() {
		if (tail == null) {
			return null;
		}
		if (size == 1) {
			return removeFirst();
		}
		E tmp = tail.elem;
		tail.prev.next = null;
		tail = tail.prev;
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
			sb.append("(");
			sb.append(walker.prev != null ? walker.prev.elem.toString() : "null");
			sb.append("<-");
			sb.append(walker.elem.toString());
			sb.append("->");
			sb.append(walker.next != null ? walker.next.elem.toString() : "null");
			sb.append("),");
			walker = walker.next;
		}
		return sb.toString();
	}
}
