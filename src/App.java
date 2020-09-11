import recap.one.Escape_CharacterR;
import recap.one.Operators;
import recap.one.StringR;
import recap.init;

public class App {
    public static void main(String[] args) {
        submain();
    }
    static void submain(){
        init.initr();
        System.out.println("Other classes");
        init.space();
        StringR.madlibs();
        init.space();
        Escape_CharacterR.init();
        Operators.init();
    }
}
