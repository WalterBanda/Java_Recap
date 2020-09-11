import recap.one.StringR;

public class App {
    public static void main(String[] args) {
        space();
        System.out.println("Main Entry Point");
        space();
//        welcome();
//        space();
        System.out.println("Other classes");
        space();
        StringR.madlibs();
    }
    static void welcome(){
        System.out.print("#####################################################\n" +
                "#################--    Hi 👋      --#################\n" +
                "####-- My Java Recap ☕ and Small Applications --####\n" +
                "########--  And Some other small projects  --########\n" +
                "##############---- Made with 💗--------##############\n" +
                "#####################################################"
        );
    }
    static void space(){
        System.out.println("\n");
    }
}
