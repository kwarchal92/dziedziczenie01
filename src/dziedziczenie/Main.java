package dziedziczenie;

import java.io.*;
import java.nio.Buffer;

class Osoba
{
    String nazwisko;
    String imie;
    String ulica;
    String kod;
    String miasto;

    public void inicjuj()
        throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("wprowadzamy dane: ");
            System.out.println("podaj nazwisko: ");
            nazwisko = br.readLine();
            System.out.println("podaj imie: ");
            imie = br.readLine();
            System.out.println("podaj ulice: ");
            ulica = br.readLine();
            System.out.println("podaj kod: ");
            kod = br.readLine();
            System.out.println("podaj miasto: ");
            miasto = br.readLine();
            System.out.println();
        }

        public void drukuj()
        {
            System.out.println("wyswietlenie danych");
            System.out.println("===================");
            System.out.println("Nazwisko: " + nazwisko + ".");
            System.out.println("Imie: " + imie + ".");
            System.out.println("Ulica: " + ulica + ".");
            System.out.println("Kod: " + kod + ".");
            System.out.println("Miasto: " + miasto + ".");
        }
    }

    class kadra extends osoba //klasa kadra dziedziczy po klasie osoba
    {
        String wyksztalcenie;
        String stanowisko;

        public void inicjuj1()
                throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            inicjuj(); //wywolujemy metode inicjuj
            




        }
    }
}
public class Main {
}
