import java.util.*;
class Addition{
	double real;
	double img;
	double r1,r2,img1,img2;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two real number: ");
		this.r1 = sc.nextDouble();
		this.r2 = sc.nextDouble();
		System.out.println("enter two imaginary number: ");
		this.img1 = sc.nextDouble();
		this.img2 = sc.nextDouble();

	}
	void input(double real,double img){
		this.real = real;
		this.img = img;
	}
	void sum(Addition ob1,Addition ob2){
		double real_no = ob1.real+ob2.real;
		double imag_no = ob1.img + ob2.img;
		System.out.println("the sum is: "+real_no+" + "+imag_no+"i"); 
	}
	void sum(){
		double real_no = this.r1+this.r2;
		double imag_no = this.img1+this.img2;
		System.out.println("the sum is: "+real_no+" + "+imag_no+"i"); 
	}
}
public class complex{
	public static void main(String args[]){
		Addition a1 = new Addition();
		a1.input();
		a1.sum();
		Addition a2 = new Addition();
		a2.input(4,5);
		Addition a3 = new Addition();
		a3.input(2,2);
		a1.sum(a2,a3);
	}
}