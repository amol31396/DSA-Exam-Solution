import java.util.Scanner;
class LinkedListOperations{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
		
		int button;
		do{
			System.out.println("Press : ");
			System.out.println("\t1.Insert\n 	2.Delete\n 	3.Display\n 	4.Exit");
			button=scan.nextInt();
			switch(button){
				case 1: System.out.print("Enter element : ");
						list.addNode(scan.nextInt());
						break;
						
				case 2: System.out.println("\t1.Delete with key\n 	2.Delete with Index");
						switch(scan.nextInt()){
							case 1: System.out.print("Enter key : ");
									list.deleteNode(scan.nextInt());
									break;
									
							case 2: System.out.print("Enter Index : ");
									list.deleteAt(scan.nextInt());
									break;
						}
						break;
						
				case 3: System.out.println("List element : ");
						list.display(list.head);
						break;
						
				default :
			}
		}while(button<4);
	}
}