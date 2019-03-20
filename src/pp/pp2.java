package pp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class pp2 {

    public static void main(String[] args) {
        int koszt, c = 0, k = 0;
        Person g1 = null;
        String imie = "", nazwisko = "", marka = "", nrrejestracyjny = "", x = "";
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Witaj w warsztacie samochodowym");
        System.out.println("Wybierz odpowiednia instrukcje");
        System.out.println("1 Aby dodac naprawe");
        System.out.println("2 Aby odczytac naprawe");
        System.out.println("0 Aby wyjsc z programu");
        x = scan1.nextLine();
        while (!"0".equals(x)) {
            if (c >= 1) {
                System.out.println("\n" + "1 Aby dodac naprawe");
                System.out.println("2 Aby odczytac naprawe");
                System.out.println("0 Aby wyjsc z programu");
                x = scan1.nextLine();
            }
            switch (x) {
                case "1":
                    System.out.print("Podaj imie ");
                    imie = scan1.nextLine();
                    System.out.print("Podaj nazwisko ");
                    nazwisko = scan1.nextLine();
                    System.out.print("Podaj marke ");
                    marka = scan1.nextLine();
                    System.out.print("Podaj nrrejestracyjny ");
                    nrrejestracyjny = scan1.nextLine();
                    g1 = new Person(imie, nazwisko, marka, nrrejestracyjny);
                    try (
                            FileOutputStream fos = new FileOutputStream("Warsztat.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);) {
                        oos.writeObject(g1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Dane zostaly dodane");
                    c++;
                    break;
                case "2":
                    File file = new File("Warsztat.txt");
                    try (
                            FileInputStream fis = new FileInputStream(file);
                            ObjectInputStream ois = new ObjectInputStream(fis);) {
                        g1 = (Person) ois.readObject();
                        k++;
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (g1 != null) {
                        System.out.println("Wczytano dane:");
                        System.out.println("Imie: " + g1.imie + "\n" + "Nazwisko: " + g1.nazwisko + "\n" + "Marka: " + g1.marka + "\n" + "NrRejestracyjny: " + g1.nrrejestracyjny);
                    }
                    System.out.println("\n" + "1 Aby dodac naprawe");
                    System.out.println("2 Aby odczytac naprawe");
                    System.out.println("0 Aby wyjsc z programu");
                    x = scan1.nextLine();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Podaj liczbe w zakresie od 0-2");
                    x = scan1.nextLine();
                    break;
            }
        }

        }

    class Company implements Serializable {

        public static final int PERSONE = 3;
        private Person[] Persons;

        public void setPerson(Person[] Presons) {
            this.Persons = Persons;
        }

        public Company() {
            Persons = new Person[PERSONE];
        }

        public void add(Person p, int index) {
            Persons[index] = p;
        }
    }

}
