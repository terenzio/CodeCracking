//  Definition for singly-linked list.

public class deleteNodeLinkedList {

    public static void main(String[] args) {
    
        System.out.println("Adding a Node:");
        // ListNode node = new ListNode(1);
        // ListNode node = new ListNode(2);
        // ListNode node = new ListNode(3);
        // ListNode node = new ListNode(4);
    
        ListNodeClass listNode = new ListNodeClass();
        
        System.out.println("Adding a Node:");
        listNode.addNode(listNode, 10);
        listNode.addNode(listNode, 9);
        listNode.addNode(listNode, 8);
        
        
        System.out.println("Displaying a Node:");
        listNode.displayList(listNode);
        
        
        System.out.println("Deleting a Node:");
    
        
    }
}


class ListNodeClass {
    
    // Pointer to the Next Node (ListNode next)
    int val;
    // Data to to store content (ListNode(int x) ) 
    ListNodeClass nextNode;
    
    public ListNodeClass() {
            // this is an empty list, so the reference to the head node
        // is set to a new node with no data
       this.val = 0;
       this.nextNode = null; 
    }
     
    //Constructors
    // public ListNodeClass(ListNodeClass nextNodeInput, int x) {
    //         // this is an empty list, so the reference to the head node
    //     // is set to a new node with no data
    //   val = x;
    //   nextNodeInput = nextNodeInput; 
    // }
     
    
    public void addNode(ListNodeClass listnode, int value) {
         this.nextNode = listnode;
         this.val = value;
     }
    
    public void displayList(ListNodeClass listnode) {
        
        //Loop through the list
        while (listnode.nextNode != null) {
            
            System.out.println("Value: "+listnode.val);
        }
        
    }
    
    
    // public void deleteNode(ListNode node) {
        
    // }
    
}