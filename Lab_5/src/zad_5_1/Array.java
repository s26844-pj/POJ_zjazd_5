package zad_5_1;
import java.util.ArrayList;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        long aktualnyCzas = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i += 2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        System.out.println("Wprowadź liczbę parzystą od 0 do 98 której numer indeksu chcesz wyświetlić: ");
        int liczba = scan.nextInt();
        for (int j = 0; j < 50; j++) {
            if (numbers.get(j) == liczba)
            {
                System.out.println("Indeks liczby " + liczba + " wynosi " + j);
            }
        }

        long koncowyCzas = System.currentTimeMillis() - aktualnyCzas;
        System.out.println("Czas trwania programu to " + koncowyCzas + " [ms].");

    }
}
