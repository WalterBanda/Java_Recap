package recap.one;

import java.util.Scanner;

public class Exponents {
    public static void _init(){
        System.out.println("Exponents are Power or Indices mathematical operations " + "They are expressed by Math.pow(a,b)");
        run();
    }

    private static void run() {
        Scanner enter = new Scanner(System.in);
        int base=5,raised=4;
        System.out.println("Enter The Base number:     " + base);
//       base  = enter.nextInt();
        System.out.println("Enter The Raised Number:   " + raised);
//       raised  = enter.nextInt();
        System.out.println("The exponential is:        " + (int)(expoFunction(base,raised)));
    }

    private static double expoFunction(int a , int b) {
        return Math.pow(a,b);
    }
}
