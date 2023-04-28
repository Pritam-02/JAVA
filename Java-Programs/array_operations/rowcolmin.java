import java.util.Scanner;
public class rowcolmin{
	public static void main(String args[]){
		int ar[][] = new int[4][4];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array elements: ");
		for(int i=0; i<ar.length-1; i++){
			for(int j=0; j<ar[i].length-1; j++){
				System.out.printf("[%d,%d]: ",i,j);
				ar[i][j]= sc.nextInt();
			}
		}
		System.out.println("inputted matrix is: ");
		for(int i=0; i<ar.length-1; i++){
			for(int j=0; j<ar[i].length-1; j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		//row minimum
		for(int i=0; i<ar.length-1; i++){
			int rowMin = ar[i][0];
			for(int j=0; j<ar[i].length-1; j++){
				if(ar[i][j]<rowMin){
					rowMin=ar[i][j];
				}
			}
			ar[i][ar[i].length-1]=rowMin;
		}
		//col minimum
		for(int i=0; i<ar[0].length-1; i++){
			int colMin = ar[0][i];
			for(int j=0; j<ar.length-1; j++){
				if(ar[j][i]<colMin){
					colMin=ar[j][i];
				}
			}
			ar[ar.length-1][i] = colMin;
		}
		//displaying the new matrix
		System.out.println("the new matrix is: ");
		for(int i=0; i<ar.length; i++){
			for(int j=0; j<ar[i].length; j++){
				if(ar[i][j] != ar[ar.length-1][ar[i].length-1]){
					System.out.print(ar[i][j]+" ");
				}
			}
			System.out.println();
		}

	}
}