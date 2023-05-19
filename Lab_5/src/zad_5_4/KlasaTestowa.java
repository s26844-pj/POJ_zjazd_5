package zad_5_4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
public class KlasaTestowa {
    public static void main(String[] args) {
        List<Ksiazka> books = new ArrayList<>();
        books.add(new Ksiazka("W pustyni i w puszczy", "Henryk Sienkiewicz", 244));
        books.add(new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 480));

        List<KsiazkaPapierowa> paperBooks = new ArrayList<>();
        paperBooks.add(new KsiazkaPapierowa("Lalka ", "Bolesław Prus", 320, 1887));
        paperBooks.add(new KsiazkaPapierowa("Dziady", "Adam Mickiewicz", 120, 1823));

        List<Ebook> ebooks = new ArrayList<>();
        ebooks.add(new Ebook("Przedwiośnie", "Stefan Żeromski", 100, 50, "pdf"));
        ebooks.add(new Ebook("Ania z Zielonego Wzgórza", "Lucy Maud Montgomery", 320, 120, "epub"));

        books.sort(Comparator.comparing(Ksiazka::getTytul));

        System.out.println("\nLista książek posortowana po tytule:");
        for (Ksiazka ksiazka : books) {
            System.out.println(ksiazka.getTytul() + " | " + ksiazka.getAutor());
        }

        Collections.sort(ebooks, new Comparator<Ebook>() {
            @Override
            public int compare(Ebook ebook1, Ebook ebook2) {
                return ebook1.getTytul().compareTo(ebook2.getTytul());
            }
        });

        System.out.println("\nLista ebooków posortowana po tytule:");
        for (Ebook ebook : ebooks) {
            System.out.println(ebook.getTytul() + " | " + ebook.getAutor());
        }

        Collections.sort(paperBooks, new Comparator<KsiazkaPapierowa>() {
            @Override
            public int compare(KsiazkaPapierowa ksiazka1, KsiazkaPapierowa ksiazka2) {
                return ksiazka1.getTytul().compareTo(ksiazka2.getTytul());
            }
        });

        System.out.println("\nLista książek papierowych posortowana po tytule:");
        for (KsiazkaPapierowa ksiazkaPapierowa : paperBooks) {
            System.out.println(ksiazkaPapierowa.getTytul() + " | " + ksiazkaPapierowa.getAutor());
        }

    }
}
