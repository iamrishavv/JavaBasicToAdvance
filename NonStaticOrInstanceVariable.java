package BasicJava;

public class NonStaticOrInstanceVariable {
    //instance/global var/non-static var
    //it is accessed by creating the object.
    //outside the method inside the class.
    // use when want to store diff val based on object
    int a=10;
    int age;
    public static void main(String[] args) {
        NonStaticOrInstanceVariable v=new NonStaticOrInstanceVariable();
        int a1 = v.a;
        System.out.println(a1);
        //every object will maintain its own copy of instance variable.
        NonStaticOrInstanceVariable raju=new NonStaticOrInstanceVariable();
        System.out.println(raju.age=24);
        NonStaticOrInstanceVariable rani=new NonStaticOrInstanceVariable();
        System.out.println( rani.age=23);

    }
}
