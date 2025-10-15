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
    
}
