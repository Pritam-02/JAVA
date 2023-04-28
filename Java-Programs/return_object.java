package object_passing;
class ObjectReturnDemo{
    int a;
    ObjectReturnDemo(int i){ //constructor
        a=i;
    }
    ObjectReturnDemo incrByTen(){ //method returns an object
        ObjectReturnDemo temp = new ObjectReturnDemo(a+10);
        return temp;
    }
}

public class return_object {
    public static void main(String[] args) {
        ObjectReturnDemo ob1 = new ObjectReturnDemo(2);
        ObjectReturnDemo ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
    }   
}
