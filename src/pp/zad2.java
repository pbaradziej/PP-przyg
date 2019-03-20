package pp;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) throws IOException {
    /*    String czesccalk = "";
        String czesculam = "";
        Scanner scan = new Scanner(System.in);
        int podstawa = scan.nextInt();
        double liczba = scan.nextInt();
        String liczbas = Double.toString(liczba);
        String[] tab = liczbas.split("\\.");
        String calkowite = tab[0];
        String ulamki = tab[1];
        int calkowity = Integer.parseInt(calkowite);
        double ulamek = Double.parseDouble(ulamki);
        while (calkowity != 0) {
            czesccalk = Integer.toString(calkowity % podstawa) + czesccalk;
            calkowity /= podstawa;
        }
        while (ulamek != 0.0) {
            ulamek *= podstawa;
            String pomoc = Double.toString(ulamek);
            czesculam += pomoc.substring(0, 1);
            pomoc = "0." + pomoc.substring(2, pomoc.length());
            ulamek = Double.parseDouble(pomoc);
        }
        System.out.println(czesccalk + "." + czesculam);
*/
    RandomAccessFile raf=null;
    try{
    raf= new RandomAccessFile("nPlD.txt","r");
    }catch(IOException e){raf.close();}
    
    
    }

}
