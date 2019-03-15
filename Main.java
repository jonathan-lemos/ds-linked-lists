public class Main {

    public static void main(String[] args) {
        System.out.println("------dll tests------");
        DoubleLinkedList<String> dll = new DoubleLinkedList<>();
        dll.addFirst("c");
        dll.addLast("d");
        dll.addFirst("b");
        dll.addFirst("a");
        dll.addLast("e");
        System.out.println(dll);
        dll.removeFirst();
        System.out.println(dll);
        dll.removeLast();
        System.out.println(dll);
        System.out.println(dll.size());
        System.out.println(dll.getFirst());
        System.out.println(dll.getLast());

        System.out.println("------sll tests------");
        SingleLinkedList<String> sll = new SingleLinkedList<>();
        sll.addFirst("c");
        sll.addLast("d");
        sll.addFirst("b");
        sll.addFirst("a");
        sll.addLast("e");
        System.out.println(sll);
        sll.removeFirst();
        System.out.println(sll);
        System.out.println(sll.size());
        sll.removeFirst();
        System.out.println(sll);
        System.out.println(sll.size());
        System.out.println(sll.getFirst());
        System.out.println(sll.getLast());
    }
}
