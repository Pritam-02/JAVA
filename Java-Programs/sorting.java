public class sorting{
	public static void main(String args[]){
		int ar[]={4,3,2,1,5,6,7,8};
		System.out.println("original array is: ");
		for(int i=0; i<ar.length; i++){
			System.out.print(ar[i]+ " ");
		}
		System.out.println("");
		//sorting first half in ascending order
		for(int i=0; i<ar.length/2; i++){
			for(int j=0; j<(ar.length/2)-1-i; j++){
				int temp =0;
				if(ar[j]>ar[j+1]){
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		System.out.println("sorted first half:");
		for(int i=0; i<ar.length; i++){
			System.out.print(ar[i]+ " ");
		}

		//sorting second half in descending order
		for(int i=(ar.length/2); i<ar.length; i++){
			for(int j=i+1; j<ar.length; j++){
				int temp =0;
				if(ar[i]<ar[j]){
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}	
			}
		}
		System.out.println("");
		System.out.println("sorted second half:");
		for(int i=0; i<ar.length; i++){
			System.out.print(ar[i]+ " ");
		}
	}
}