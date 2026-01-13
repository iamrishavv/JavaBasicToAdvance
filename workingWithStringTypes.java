package BasicJava;

public class workingWithStringTypes {
    public static void main(String[] args) {
        //String to integer.
        String s1="10";
        String s2="20";
        System.out.println(s1+s2);//->>Input-10 20 Output-->1020
        //Integer.parseInt()--> it is converting string into integer.
        try {
            int i = Integer.parseInt(s1);
            int j = Integer.parseInt(s2);
            System.out.println(i + j); //->>Input-10 20 Output-->30
        }catch (NumberFormatException e) {
            System.out.println("Please provide valid numbers!!");
        }
        //integer to string.
        int k=1;
        int l=2;
        String  u1=String.valueOf(k);
        String u2=String.valueOf(l);
        System.out.println(u1+u2);
    }
}
