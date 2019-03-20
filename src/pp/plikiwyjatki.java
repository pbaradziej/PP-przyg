
package pp;

 import java.io.File;
 import java.io.BufferedReader;
import java.io.BufferedWriter;
 import java.io.FileReader;
import java.io.FileWriter;
 import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
 


public class plikiwyjatki {

    public static void main(String[] args) {
       /* try{
    File file=new File("liczZnakiSlowa.txt");
    BufferedReader br=new BufferedReader(new FileReader(file));
    String linia=null;
    while((linia=br.readLine())!=null){
        linia.trim();
    String[] s1=linia.split("");
        System.out.println(s1.length);
        boolean x;
        do{
        linia=linia.replace("  ", " ");
        x=linia.contains("  ");
        }while(x);
        String[] s2=linia.split(" ");
        System.out.println(s2.length);
    }
    
        }
    catch(IOException e){System.out.println("Blad");}
    */
       /*int i=1;
       try{
       File file=new File("szukaj.txt");
    BufferedReader br=new BufferedReader(new FileReader(file));
       BufferedWriter bw=new BufferedWriter(new FileWriter("znajdz.txt"));
       String linia=null;Q
       while((linia=br.readLine())!=null){
           
      if(linia.contains("egzamin")){
           bw.write(Integer.toString(i));
           bw.write("."+linia);
           bw.newLine();
       }
           System.out.println(linia);
       
           i++;
           
       }
       br.close();
       bw.close();
       }
       catch(IOException e){System.out.println("Blad");}
       */
    /*   try{
       RandomAccessFile raf=new RandomAccessFile("sumuj.txt","rw");
       int suma=0;
       String tekst="";
       long poz=raf.getFilePointer();
       while(raf.getFilePointer()<raf.length()){
       tekst+=raf.readLine();
         System.out.println(tekst);  
       suma+=Integer.parseInt(tekst);
           
           tekst="";
       }
       suma+=1;
       String y=Integer.toString(suma);
       raf.writeUTF(y);
       System.out.println(suma);
       raf.close();
       }
       catch(IOException e){System.out.println("Blad");}
      */ 
    Random x=new Random();
    for(int i=0;;i++){
    int s=x.nextInt(101)+20;
    if(s==120){
        System.out.println(s);
    }
    
    }
    
    
    
    
    
    
    
    }
    
}
