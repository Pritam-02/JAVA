interface animal{
    //default method
    default void say(){
        System.out.println("hello this is my default method");
    }
    //abstract method
    void bark(); //u dont need to specify abstract keyword because interface
    // is pure abstraction
}
public class default_interface implements animal{
    // u can specify @override here. its optional
    public void bark(){
        System.out.println("dog barks");
    }
    public static void main(String[] args) {
        default_interface ob = new default_interface();
        ob.bark();
        ob.say();
    }
    
}
