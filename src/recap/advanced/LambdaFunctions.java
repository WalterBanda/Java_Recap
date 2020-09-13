package recap.advanced;

public class LambdaFunctions {
    public static void init(){ info();lambdaim(); }
    static void info(){
        System.out.println(
                "############################################################################\n" +
                "#                    Polymorphism                                          #\n" +
                "#   This is where methods and classes are able to be reused and extended   #\n" +
                "#      More information on Linked List can be found in the site below      #\n" +
                "#           https://www.javatpoint.com/runtime-polymorphism-in-java        #\n" +
                "############################################################################");
    }
    static void lambdaim(){
        Game football = new Game() {
            @Override
            public void play() {
                System.out.println("Im playing ");
            }
        };
    }
    interface Game{ void play(); }

}
