class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
        Node next = null;

    }
}
   class LinkedList{
    Node head;

    public void insert(int new_data){//Insertion at begining;
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }
    public void insertAfter(Node prev_Node, int new_data){
        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;

    }
    public void append(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return ;
        }
        new_node.next = null;//mandotry in this code;
        Node last = head ;
        while(last.next != null ){
            last = last.next;
        }
            last.next = new_node;
           return;   
        

    }
    public void deleteNode(int key){//All scenarios of deletion is done 
        Node temp = head;//,prev = null;
        if(temp != null && temp.data == key){
          head = temp.next;
          return;
        }
      /*  while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null )
        return;
            prev.next = temp.next;//Deletion at end;*/
        

        
    }
    public void display(){
        Node n ;
        n = head;
        while(n != null){
            System.out.print(n.data+"  ");
            n = n.next;
        }
    }
   }
public class Link2 {
    public static void main(String[] args) {
        Node node = new Node(6);
        Node node1 = new Node(9);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        LinkedList l1 = new LinkedList();
        l1.head = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
       
        l1.insert(20);
        l1.insert(30);
        l1.display();
        System.out.println("      ");
        l1.insertAfter(l1.head.next.next,40);
        l1.display();
        l1.append(100);
        System.err.println("  ");
        l1.display();
        l1.deleteNode(30);
        System.out.println("    ");
        l1.display();
        

       
       
    }
}
