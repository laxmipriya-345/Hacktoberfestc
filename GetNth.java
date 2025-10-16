// Java program to find n'th node in linked list
// using recursion

import java.io.*;
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class GfG {

    // Takes head pointer of the linked list and index
    // as arguments and return data at index*/
    static int GetNth(Node head, int index) { 
      
        if (head == null)
            return -1;

        // if index equal to 1 return node.data
        if (index == 1)
            return head.data;

        // recursively decrease n and increase
        // head to next pointer
        return GetNth(head.next, index - 1);
    }
  
    public static void main(String args[]) {
      
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.printf("Element at index 3 is %d",
                          GetNth(head, 3));
    }
}
