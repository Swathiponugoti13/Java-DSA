public class ArrayListImplementation {

        public static void main(String[] args) {
            MyArrayList list = new MyArrayList();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.printList();

            System.out.println("Element at index 2: " + list.get(2));
            list.remove(1);
            list.printList();

            System.out.println("Current size: " + list.size());

    }
}
