package lab4;

import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int x = scanner.nextInt();

        System.out.println("You entered an integer: "+x);





        System.out.print("Please enter an double: ");
        double y = scanner.nextDouble();

        System.out.print("Please enter your name: ");
        String  s = scanner.nextLine();

        System.out.println("You name is: "+s);









    }
}
