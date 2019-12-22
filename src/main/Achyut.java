package main;
import java.util.Scanner;
public class Achyut {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter x:");
        double x= scanner .nextDouble();
        System.out.println("x:",+x);
        System.out.println(Math.pow(x,2.0));
        System.out.println(Math.pow(x,3.0));
        System.out.println(Math.pow(x,4.0));
        scanner close;
    }
}
