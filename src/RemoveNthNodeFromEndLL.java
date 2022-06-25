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
        Node current = head;
        Node previous = head;
        int size = 0;
        while(current != null){
            size ++;
            current = current.next;
        }
        int count = size -n;
        if(count ==0){
            return head.next;
        }
        else{
            count --;
            while(count >0){
                count --;
                previous = previous.next;
            }previous.next = previous.next.next;
            return head;
        }
    }

    public static void main(String[] args) {

    }
}
