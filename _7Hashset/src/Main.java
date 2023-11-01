import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> cars = new HashSet<String>();

        //Funzione per riempire Hashset
        addElements(cars, "Fiat", "Ferrari", "Bmw");

        //Stampare grandezza Set
        System.out.println("Quante auto in totale? " + cars.size());

        //Stampare elementi set
        for (String element : cars) {
            System.out.println(element);
        }

    }

    static void addElements(Set container, String a, String b, String c) {

        container.add(a);
        container.add(b);
        container.add(c);
    }

}