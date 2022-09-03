public class RemoveNthNodeFromEndLL {
//Node class
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node removeNthNodeFromEndLL(Node head, int n){
        //take two nodes and initialize the size
        Node current = head;
        Node previous = head;  //I can reuse current by changing its reference again in the code, after getting the size.
        int size = 0;
        //until current becomes 0
        while(current != null){
            size ++;
            current = current.next;
        }
        //after getting the size get the count
        int count = size -n;
        //if its 0 means, we are asked to delete the first node, so we just return the next node
        if(count ==0){
            return head.next;
        }

        else{
            count --;  //this decrement is because I need a previous node to make the connection of it with its next to next to delete the middle one
            //and run a loop to reach the exact point where we want disconnection
            while(count >0){
                count --;
                previous = previous.next;
            }previous.next = previous.next.next;
            return head;
            //and tada, head is returned
        }
    }

    public static void main(String[] args) {

    }
}
