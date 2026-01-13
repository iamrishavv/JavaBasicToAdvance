package BasicJava;
//Varargs allows a method to accept zero or more arguments of the same type.
//Introduced in Java 5
//Uses ellipsis (...)
//Internally it ois using array concept.
// var agrs should be always be in last.
public class variableArguments {
    public void add(int... nums){// // internally → int[] nums
        int sum=0;
        for(int x: nums){
            sum=sum+x;
        }
        System.out.println("The sum of the given numbers are:"+sum);
    }
    void show(String name, int... num){
        for(int x:num){
            System.out.println(x);
        }
        System.out.println(name);
    }
    //below code is wrong because var args should be in last always..
//    void show(int...s,String w{
//        System.out.println(w);
//    }
    public static void main(String[] args) {
        variableArguments v=new variableArguments();
        v.add(10,20);
        v.add(11,12,13);
        v.show("Rishav",10,20);
    }
}
