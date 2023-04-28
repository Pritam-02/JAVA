public class remove_duplicate_numbers{
	public static boolean ar[] = new boolean[26];
    static int i=0;
    public static int removeDuplicates(int str[],int idx,int newstr[]){
        
        if(idx == str.length){
            System.out.println("removing the duplicates,the string is: ");
            for(int j =0;j<newstr.length;j++){

                System.out.print(newstr[j]+" ");
            }
            return i;
        }
        	int currchar = str[idx];
	        if(ar[currchar - 1] == true){
	            removeDuplicates(str,idx+1, newstr);
	        }else{
                
	            newstr[i++] = currchar;
	            ar[currchar - 1] = true;
	            removeDuplicates(str,idx+1, newstr);
	        }
	  return 0;      
    }

     public static void main(String args[]){
        int str[]={1,1,2,1,2,3,3};
        int newstr[]= new int[str.length];
       int k= removeDuplicates(str,0, newstr);
       System.out.println(k);
    }
}