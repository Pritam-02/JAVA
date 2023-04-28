//remove a specific element from an array
import java.util.Scanner;
public class remove_element{
	public static int[] remove(int ar[],int index){
		if(ar==null || index<0 || index>=ar.length){
			return ar;
		}
		int i,k;
		int new_array[] = new int[ar.length-1];
		for(i=0,k=0; i<ar.length; i++){
			if(i == index){
				continue;
			}
			new_array[k++] = ar[i];
		}
		return new_array;
	}

	public static void main(String args[]){
		System.out.println("enter the no of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the elements: ");
		for(int i=0;i<ar.length;i++){
			ar[i]=sc.nextInt();
		}
		System.out.println("enter the index to be removed: ");		
		int index = sc.nextInt();
		int new_ar[]=remove(ar,index);
		System.out.println("new array: ");
		for(int i=0;i<new_ar.length;i++){
			System.out.print(new_ar[i]+" ");
		}
	}
}