package BasicJava;
//static var
// with static keyword and be accessed using class name.
//use when we want to store same value for all objects 
public class staticVariables {
    static int age=12;
    public static void main(String[] args) {
        int age1 = staticVariables.age;
        System.out.println(age1);
    }
}
