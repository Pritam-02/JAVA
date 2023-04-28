abstract class phone{
    abstract void on();
}
class smartphone1 extends phone{
    public void on(){
        System.out.println("phone is on");
    }
    public void run(){
        System.out.println("someone is running");
    }
}
public class abstarction {
    public static void main(String[] args) {
        phone obj = new smartphone1();
        //obj.run(); will not work because variable obj is of type phone
        //above is called run time polymorphism
        obj.on();
    }    
}
