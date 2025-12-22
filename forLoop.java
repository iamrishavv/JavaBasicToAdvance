package BasicJava;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        for (int j=n;j>=1;j--){
            System.out.println(j);
        }
    }
}
