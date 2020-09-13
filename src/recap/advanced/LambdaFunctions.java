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
        Game football = () -> System.out.println("Im playing Football");
        football.play();
        // This is the lambda format when enlarged
        Game cricket = new Game() {
            @Override
            public void play() {
                System.out.println("Im playing cricket");
            }
        };
        cricket.play();
        Series odiSeries = (type) -> System.out.println("Its a "+ type +" game");
        odiSeries.play("Minecraft");
        //This is the lambda with parameters when enlarged
        Series OdiSeries = new Series() {
            @Override
            public void play(String type) {
                System.out.println("Its a "+type+" game");
            }
        };
        OdiSeries.play("hockey");
    }
    interface Game{ void play(); }
    interface Series{ void play( String type );}

}
