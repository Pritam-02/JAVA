//insert an element(into a specific position)
import java.util.Scanner;
public class insert_element{
	public static void main(String args[]){
		System.out.println("enter the no of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n+1];
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		System.out.println("enter the position of inserting: ");
		int pos = sc.nextInt();
		System.out.println("enter the element you want to insert: ");
		int x=sc.nextInt();
		for(int i=(n-1); i>=(pos-1); i--){
			ar[i+1] = ar[i];
		}
		ar[pos-1] = x;
		System.out.println("after inserting: ");
		for(int i=0; i<n+1; i++){
			System.out.println(ar[i]+" ");
		}
	}
}