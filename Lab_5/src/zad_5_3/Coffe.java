package zad_5_3;
import java.util.ArrayList;
import java.util.Iterator;
public class Coffe {
    public static void main(String[] args) {
        ArrayList<String> typeOfCoffe = new ArrayList<>();
        typeOfCoffe.add("espresso");
        typeOfCoffe.add("latte");
        typeOfCoffe.add("cappuccino");
        typeOfCoffe.add("mocha");
        typeOfCoffe.add("auLait");
        typeOfCoffe.add("macchiato");

        System.out.println(typeOfCoffe);

        Iterator<String> it = typeOfCoffe.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        for (String i : typeOfCoffe
        ) {
            System.out.println(i.toUpperCase());
        }
        for (int i = 0; i < typeOfCoffe.size(); i++) {
            String name = typeOfCoffe.get(i);
            for (int j = 0; j < 4; j++) {
                char letter = name.charAt(j);
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
