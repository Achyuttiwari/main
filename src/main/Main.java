package main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter x:");
        double x= scanner .nextDouble();
        System.out.println("x:",+x);
        System.out.println("x^2:",+(x*x));
        System.out.println("x^3:",+(x*x*x));

        scanner close;
    }
}
