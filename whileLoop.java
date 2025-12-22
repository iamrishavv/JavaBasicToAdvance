package BasicJava;

import java.util.Scanner;

//wap to print 1 to n;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int i =1;
        while(i <=n){
            System.out.println(i);
            i++;
        }
        int j=10;
        while(j>=1){
            System.out.println(j);
            j--;
        }
        int k=10;
        while(k>=1){
            System.out.println(k);
        }
    }
}
