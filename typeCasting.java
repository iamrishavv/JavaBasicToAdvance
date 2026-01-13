package BasicJava;
//Type casting is the process of converting one data type into another.
//👉 In Java, type casting is mainly of two types:
//1️⃣ Primitive Type Casting(widening and narrowing)
//2️⃣ Object (Reference) Type Casting(upcasting and down-casting)
//order-{byte → short → int → long → float → double}.
public class typeCasting {
   static class parent{

    }
   static class child extends parent{

    }
    public static void main(String[] args) {
        //Widening-->No Data loss.
        byte b=10;
        int a=b;
        System.out.println(a);
        //narrowing-->Data loss
        double d=11;
        int e= (int) d;
        System.out.println(e);
        parent p= new child();//upcasting
        //for down-casting we have to first do upcasting.
        parent p1= new child();
        child c= (child) p1;//down-casting

    }
}
