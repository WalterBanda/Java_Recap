package recap;
public class init {
    public static void initr(){
        space();
        System.out.println("Main Entry Point");
        space();
        welcome();
        space();
    }
    static void welcome(){
        System.out.print("#####################################################\n" +
                "#################--    Hi 👋      --#################\n" +
                "####-- My Java Recap ☕ and Small Applications --####\n" +
                "########--  And Some other small projects  --########\n" +
                "##############---- Made with 💗--------##############\n" +
                "#####################################################\n"
        );
    }
    public static void space(){
        System.out.println("\n");
    }
}
