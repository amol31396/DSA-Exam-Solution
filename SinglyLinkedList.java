class SinglyLinkedList{
	Node head;
	Node tail;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	void addNode(int newData){
		Node newNode=new Node(newData);
		if(head==null){
			head=newNode;
			tail=newNode;
		}else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	Node reverseList(Node head){
		if(head==null)
			return head;
        Node current = head;
		Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
	
	void deleteNode(int key){
		Node current = head, prev = null;
		if(current != null && current.data == key){
			head=current.next;
		return;
		}
		while(current!=null && current.data!=key){
			prev=current;
			current=current.next;
		}
		if(current==null)
			return;
		prev.next=current.next;
	}
	
	void deleteAt(int index){
		Node current=head;
		if(current==null)
			return;
		
		if(index==0)
			current=current.next;
		else
			for(int i=0;i<index-1;i++)
				current=current.next;
			
		if(current==null || current.next==null)
			return;
		
		Node newNode=current.next.next;
		current.next=newNode;
	}
	
	void display(Node head){
		Node current=head;
		if(current==null){
			System.out.println("List is empty");
			return;
		}
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
		System.out.println();
	}
	
}