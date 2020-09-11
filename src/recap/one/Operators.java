package recap.one;

import recap.init;

public class Operators {
    public static void init(){
        listofOperators();
        comparisonOperators();
    }
    static void listofOperators(){
        System.out.print(
                "#################################################################################\n" +
                "#################--  Operators are crucial in app development --#################\n" +
                "##############---   To know all extensive on operators visit    ---##############\n" +
                "##########----    https://www.javatpoint.com/operators-in-java     ---###########\n" +
                "###########################---     Made with 💗     ---##########################\n" +
                "#################################################################################\n"
        );
    }
    static void comparisonOperators() {
        System.out.println("Integers, long, double, char use == for comparison while string use foo.equals for comparison");
        int a = 1, b = 1; //Represents the integers long double
        char e = 'e', f = 'e';
        String r = "hello", d = "hello";
        init.space();
        System.out.println("Testing comparison for integer");
        if (a == b) System.out.println("comparison succeeded");
        else System.out.println("comparison failed");
        init.space();
        System.out.println("Testing comparison for character");
        if (f == e) System.out.println("comparison succeeded");
        else System.out.println("comparison failed");
        init.space();
        System.out.println("Testing comparison for String");
        if (r.equals(d)) System.out.println("comparison succeeded");
        else System.out.println("comparison failed");
    }
}
