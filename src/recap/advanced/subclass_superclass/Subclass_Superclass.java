package recap.advanced.subclass_superclass;

import recap.init;

public class Subclass_Superclass {
    static void intro() {
        System.out.println(
                "               #######---   Superclass_Subclasses   ---#######\n" +
                "We will demonstrate use of subclasses and superclasses using the class Shoe and \n"+
                "                    other small classes it contains");
    }
    public static void _init(){
        Shoe s = new Shoe("Nike", 10);
        Walking w = new Walking(true,"Nike",10);
        Running r = new Running(4.5,"Nike",10);

        intro();
        init.space();
        System.out.println("Shoe Brand :" + s.brand + "\nWalking goreTex :" + w.goreTex + "\nRunning Weight :" + r.weight);
    }
}
