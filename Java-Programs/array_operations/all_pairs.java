import java.util.Scanner;
import java.util.Arrays;
public class all_pairs{
	public static void main(String args[]){
		System.out.println("enter the no of elements: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n+1];
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		int i,j;
		System.out.println("enter the specific number: ");
		int num = sc.nextInt();
		System.out.println("created array is: ");
		System.out.println(Arrays.toString(ar));
		for(i=0; i<ar.length; i++){
			for(j=i; j<ar.length; j++){
				if((ar[i]+ar[j])==num && i!=j){
					System.out.println(i+ ","+j);
				}
			}
		}		
	}
}