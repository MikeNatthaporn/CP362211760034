package lab7;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("which subjects you like the most?");
        System.out.println("1.system Analysis and design");
        System.out.println("2.computer programming");
        System.out.println("3.internet Application programming");
        System.out.print("Select");
        int Selector = sc.nextInt();

        //switch-case
        switch (Selector){
            case 1:System.out.println("sure? This subject is very hard");
            break;
            case 2:System.out.println("yes,computer programming is very fun");
            break;
            case 3:System.out.println("ohhh, you might expert in programming ");
            break;
            default:System.out.println("you have to enter 1-3.");
        }


    }//main
}//class
