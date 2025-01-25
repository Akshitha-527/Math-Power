import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base :");
       int a = sc.nextInt();
       System.out.println("Enter power:");
       int b = sc.nextInt();
       System.out.println(Math.pow(a, b));
    }
}
