import java.util.Scanner;
class ArrayRotate{
	void rotLeft(int[] arr, int numOfRotation){
		int length=arr.length;
		int flag=0;
		while(flag<numOfRotation){
			int i;
			flag++;
			int temp=arr[0];
			for(i=0;i<length-1;i++){
				arr[i]=arr[i+1];
			}
			arr[i]=temp;
		}
		display(arr);
	}
	
	void display(int[] arr){
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		ArrayRotate obj=new ArrayRotate();
		System.out.print("Enter size of Array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter number of rotation : ");
		int num=scan.nextInt();
		System.out.print("Enter "+size+" array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
		}
		obj.rotLeft(arr,num);
	}
}