package lab10;

public class ex1 {
    public static void B(int X){
        System.out.println("hello B"+X);

    }//B
    public static void main(String[] args) {

        System.out.println("hello main");
        A();
        A();
        B(10);
        int s = C(10, 20);
        System.out.println(s);
        System.out.println(C(50,50)*5);
    }//main
    public static void A(){
        System.out.println("hello A");

    }//A
    public static int C(int x, int y) {
        int z = x + y;
        System.out.println("Hello C" + z);
        B(z);

        return z;



    }


}//class
