class objectpassdemo{
    int a,b;
    objectpassdemo(int i,int j){
        a=i;
        b=j;
    }
    boolean equalTo(objectpassdemo ob){
        System.out.println("ob.a = "+ob.a);
        System.out.println("a= "+a);
        return(ob.a == a && ob.b == b);
    }
}
public class pass_demo {
    public static void main(String[] args) {
        objectpassdemo ob1 = new objectpassdemo(100, 22);
        objectpassdemo ob2 = new objectpassdemo(100, 22);
        objectpassdemo ob3 = new objectpassdemo(-1, -2);
        
        System.out.println("ob1 == ob2: "+ob1.equalTo(ob2));
        System.out.println("ob1 == ob2: "+ob1.equalTo(ob3));
    }
}
