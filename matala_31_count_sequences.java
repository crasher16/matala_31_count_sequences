package ex1;
import unit4.collectionsLib.Node;

public class matala_31_count_sequences {
	
	// By: Idan Dror

    public static int countSequences(Node<Integer> head, int x) {
        int count = 0;
        Node<Integer> current = head;

        boolean inSequence = false; 

        while (current != null) {
            if (current.getValue() == x) {
                if (!inSequence) {

                	count++;
                    inSequence = true;
                }
            } else {

            	inSequence = false;
            }
            current = current.getNext();
        }

        return count;
    }

    // ---------- helper methods ----------
    public static void printList(Node<Integer> head) {
        Node<Integer> tmp = head;
        for (; tmp != null; tmp = tmp.getNext())
            System.out.print(tmp.getValue() + " ");
        System.out.println();
    }

    public static Node<Integer> createList(int[] arr) {
        Node<Integer> head = null;
        Node<Integer> tmp = null;

        for (int i = 0; i < arr.length; i++) {
            if (head == null) {
                head = new Node<Integer>(arr[i]);
                tmp = head;
            } else {
                tmp.setNext(new Node<Integer>(arr[i]));
                tmp = tmp.getNext();
            }
        }
        return head;
    }

    // -------------------- main tests --------------------
    public static void main(String[] args) {
        Node<Integer> h1 = createList(new int[]{1, 2, 2, 3, 2, 2, 2, 4,2,5,2});
        printList(h1);
        System.out.println("Number of sequences of 2: " + countSequences(h1, 2));
        
        Node<Integer> h2 = createList(new int[]{5, 5, 5, 5});
        printList(h2);
        System.out.println("Number of sequences of 5: " + countSequences(h2, 5)); 
        
        Node<Integer> h3 = createList(new int[]{1, 3, 4, 6});
        printList(h3);
        System.out.println("Number of sequences of 2: " + countSequences(h3, 2)); 
        
        Node<Integer> h4 = null;
        printList(h4);
        System.out.println("Number of sequences of 1: " + countSequences(h4, 1)); 
    }
}

