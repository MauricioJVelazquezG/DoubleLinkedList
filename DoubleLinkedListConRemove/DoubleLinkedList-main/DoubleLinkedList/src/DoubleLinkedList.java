public class DoubleLinkedList {
    
    Node head;

    public void add (int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode; //Guarda el nuevo nodo
        newNode.prev = current; //En el nuevo nodo, se guarda la referencia del anterior
    }

    public void printforward (){
        if (head == null){
            System.out.println("La lista esta vacia");
            return;
        }
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    public void printbackward (){
        if (head == null){
            System.out.println("La lista esta vacia");
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        while (current != null){
            System.out.println(current.data);
            current = current.prev;
        }

    }

    public void remove(int data) {
        if (head == null) {
            System.out.println("La lista está vacía, no hay nada que eliminar.");
            return;
        }
        Node current = head;
        
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("El valor " + data + " no se encontró en la lista.");
            return;
        }
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        current.prev.next = current.next;

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }
}
