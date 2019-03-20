package pp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PP {

    public static void main(String[] args) {
        int koszt,c=0,k=0;
        String imie="",nazwisko="",marka="",nrrejestracyjny="",x="";
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        System.out.println("Witaj w warsztacie samochodowym");
        System.out.println("Wybierz odpowiednia instrukcje");
        System.out.println("1 Aby dodac naprawe");
        System.out.println("2 Aby odczytac naprawe");
        System.out.println("0 Aby wyjsc z programu");
        x=scan1.nextLine(); 
        while(!"0".equals(x)){
            if(c>=1){
                System.out.println("\n"+"1 Aby dodac naprawe");
        System.out.println("2 Aby odczytac naprawe");
        System.out.println("0 Aby wyjsc z programu");
                x=scan1.nextLine();}
        switch (x){
            case "1":
                System.out.print("Podaj imie ");
                imie=scan1.nextLine();
                System.out.print("Podaj nazwisko ");
                nazwisko=scan1.nextLine();
                System.out.print("Podaj marke ");
                marka=scan1.nextLine();
                System.out.print("Podaj nrrejestracyjny ");
                nrrejestracyjny=scan1.nextLine();
                System.out.print("Koszt wynosi ");
                koszt=10000;
                System.out.println(koszt);
                System.out.println("Dane zostaly dodane");
                c++;
        break;
            case "2":
                File file=new File("Warsztat.txt");
                try(
                FileReader fr=new FileReader(file);
                BufferedReader br=new BufferedReader(fr);
                        ){
                    String nextLine=null;
                    while((nextLine=br.readLine())!=null){
                        if(k==0){System.out.print("Imie ");}
                        if(k==1){System.out.print("Nazwisko ");}
                        if(k==2){System.out.print("Marka ");}
                        if(k==3){System.out.print("nrRejestracyjny ");}
                        System.out.println(nextLine);
                        k++;
                    }
                    
                
                
                }catch(IOException e){e.printStackTrace();}
                
                System.out.println("\n"+"1 Aby dodac naprawe");
        System.out.println("2 Aby odczytac naprawe");
        System.out.println("0 Aby wyjsc z programu");
                x=scan1.nextLine();
        break;
            case "0":
        break;
            default:
                System.out.println("Podaj liczbe w zakresie od 0-2");
                x=scan1.nextLine();
                break;
        }
        }
        
        
        
    }
    
}
