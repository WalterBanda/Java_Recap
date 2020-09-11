package recap.one;

import java.util.Scanner;

public class StringR {
    private static Scanner input = new Scanner(System.in);
    static void hello() {
        System.out.print(
                "#####################################################\n" +
                "#################--   Madlibs 🏥  --#################\n" +
                "##############---- Game 🎲 ⚽  --------##############\n" +
                "################---   Made with 💗 ---###############\n" +
                "#####################################################\n"
        );
    }
    static void fillinspaces(){
        System.out.println("My ___ sister accidentally ___ed all over her new ___ ");
        System.out.println("Fill in the first word");
        String adjective = input.next();
        System.out.println("Fill in the second word");
        String verb = input.next();
        System.out.println("Fill in the third word");
        String noun = input.next();
        System.out.println("My " + adjective + " sister accidentally " + verb + "ed all over her new " + noun + " ");
    }
    public static void madlibs() {
        hello();
        fillinspaces();
    }
}
