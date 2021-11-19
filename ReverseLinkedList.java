class ReverseLinkedList{
	public static void main(String[] args){
		SinglyLinkedList list=new SinglyLinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.display(list.head);
		list.display(list.reverseList(list.head));
	}
}