package BasicJava;
//Wrapper classes convert primitive data types into objects.
//Java is object-oriented, but primitives are not objects.
//Wrapper classes allow primitives to be treated as objects.
//All wrapper classes are in java.lang package.
//🔹 Why Wrapper Classes Are Needed?
//Required for Collections (ArrayList, HashMap)
//Used in Generics
//Enables object behavior on primitives
//Supports null values
//All wrapper classes having 2 constructor but character wrapper classes having only one constructor.
//A String cannot be converted directly into a char
//char represents a single character
//String can contain multiple characters
//Conversion from String to char is ambiguous
public class wrapperClasses {

    public static void main(String[] args) {
        //primitive data
        int a=10;
        System.out.println(a);
        //object
        Integer i=new Integer(a);//autoboxing--converting primitive to object
        System.out.println(i);
        int  b1=i;//auto-unboxing-->converting object to primitive
        System.out.println(b1);
//        Integer a1=new Integer("20");
//        Integer a2=new Integer("30");
//        Integer a3=a1+a2;
//        System.out.println(a3);
        Integer i1 = new Integer(10);     // primitive
        Integer i2 = new Integer("10");// String
        Character c = new Character('A');
        //Character c = new Character("A");//wrong because




    }
}
