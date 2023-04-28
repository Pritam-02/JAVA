import java.util.Scanner;
public class delete_conso{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.println("original string is: "+s);
		String str="";
		for(int i =0; i<s.length();i++){
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				str=str+c;
			}
		}
		System.out.println("new string is: "+str);
	}
}