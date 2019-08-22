package lab6;

import java.util.Scanner;

public class lab6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i;
        System.out.println("input length in inch :");
        i = sc.nextDouble();
        double m = i*0.254;
        System.out.println(i+"inch is equal to"+m+"meters");

    }
}
