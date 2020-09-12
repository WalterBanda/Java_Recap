package recap.advanced;

import recap.init;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void init(){
        info();
        init.space();
        linkyMethod();
    }

    static void info() {
        System.out.println(
                "##################################################################\n" +
                "#                    LinkedList aka Linky                        #\n" +
                "#   This is a flexible datastructures like array, stack, queue   #\n" +
                "# More information on Linked List can be found in the site below #\n" +
                "#           https://www.javatpoint.com/java-linkedlist           #\n" +
                "##################################################################");
    }
    static void linkyMethod(){
        LinkedList<String> linky = new LinkedList<>();
        linky.add("Rob");
        linky.add("Alex");
        linky.add("Hosee");
        linky.add("Walter");
//        linky.remove();
//        linky.clear();
        System.out.println(" All elements in linky 🖐🏿  :" + linky + "\n First element in linky 🔨  :" + linky.getFirst());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(78);
        linkedList.add(1);
        linkedList.add(9);

        System.out.println(" All elements in linkedList 🗽  :" + linkedList +
                "\n Finding Certain element in linked List");

        Iterator iterator = linkedList.iterator();
        int lookupValue = 78;
        while (iterator.hasNext()) {
            if ((int)iterator.next() == lookupValue) {
                System.out.println("We have found the lookup value");
            }
//            else System.out.println("lookup value not found");
        }

    }
}
