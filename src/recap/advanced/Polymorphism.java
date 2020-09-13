package recap.advanced;
public class Polymorphism {
    static void info(){
        System.out.println(
                "############################################################################\n" +
                "#                    Polymorphism                                          #\n" +
                "#   This is where methods and classes are able to be reused and extended   #\n" +
                "#      More information on Linked List can be found in the site below      #\n" +
                "#           https://www.javatpoint.com/runtime-polymorphism-in-java        #\n" +
                "############################################################################");
    }
    public static void init(){
        info();
        Bird b = new Bird();
        Robin r = new Robin();
        chicken c = new chicken();
        b.sing();
        r.sing();
        c.sing();
    }
}
class Bird {
    public void sing(){
        System.out.println(" Bird: Tweet tweet tweet");
    }
}
class chicken extends Bird {
    public void sing(){
        System.out.println(" Chicken: cockledoodle");
    }
}
class Robin {
    public void sing(){
        System.out.println(" Robin: Tweetiledee");
    }
}
