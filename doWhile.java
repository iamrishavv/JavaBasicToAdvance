package BasicJava;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
