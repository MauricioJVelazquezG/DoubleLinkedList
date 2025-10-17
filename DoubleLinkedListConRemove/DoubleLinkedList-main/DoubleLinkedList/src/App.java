public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.printforward();
        doubleList.add(1);
        doubleList.add(2);
        doubleList.add(3);
        doubleList.add(4);
        doubleList.add(5);
        doubleList.printforward();

        System.out.println("--------------------");

        doubleList.printbackward();

        System.out.println("--------------------");

        doubleList.remove(1);
        doubleList.remove(3);
        doubleList.remove(5);
        doubleList.printforward();
    }
}
