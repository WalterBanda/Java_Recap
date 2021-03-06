package recap;

import recap.advanced.LambdaFunctions;
import recap.advanced.Linky;
import recap.advanced.Polymorphism;
import recap.advanced.subclass_superclass.Subclass_Superclass;
import recap.one.Escape_CharacterR;
import recap.one.Exponents;
import recap.one.Operators;
import recap.one.StringR;

public class init {
    /**
     * @author Walter Banda
     * <div>##########################################</div>
     * <div>#################--Hi👋--#################</div>
     * <div>###--My Java Recap ☕ and Small Applications--####</div>
     * <div>########--And Some other small projects--#######</div>
     * <div>##############----Made with 💗--------##############</div>
     * <div>#################################################</div>
     */
    public static void initr(){
        space();
        System.out.println("Main Entry Point");
        space();
        welcome();
        space();
    }
    static void welcome(){
        System.out.print(
                "#####################################################\n" +
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
    public static void main(){
        initr();
        System.out.println("Other classes");
        space();
        StringR.madlibs();
        space();
        Escape_CharacterR.init();
        space();
        Operators.init();
        space();
        Exponents._init();
        space();
        Subclass_Superclass._init();
        space();
        Linky.init();
        Polymorphism.init();
        LambdaFunctions.init();
    }
}
