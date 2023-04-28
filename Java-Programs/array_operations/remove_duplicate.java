//remove duplicates and return the length of new array
import java.util.Scanner;
import java.util.Arrays;
public class remove_duplicate{
	public static void main(String args[]){
		System.out.println("enter the no of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the elements: ");
		for(int i=0;i<ar.length;i++){
			ar[i]=sc.nextInt();
		}

		int unique[] = new int[ar.length];
		int counter=0;
		Arrays.sort(ar);
		for(int i=0; i<ar.length-1; i++){
			if(ar[i] != ar[i+1]){
				unique[counter++] = ar[i];
				//counter++;
			}
		}
		unique[counter] = ar[ar.length-1];
		System.out.println("unique array: ");
		for(int i=0;i<=counter;i++){
			System.out.print(unique[i]+" ");
		}
		System.out.println("length of new array: "+ ++counter);
	}
}