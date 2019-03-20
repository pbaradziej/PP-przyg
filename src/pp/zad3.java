
package pp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class zad3 {
    public static void main(String[] args) throws IOException {
    
        RandomAccessFile raf = null;
        BufferedReader in = null;
        int liczbaZmian=0;
        try{
            raf= new RandomAccessFile("nPlD.txt","rw");
            in = new BufferedReader ( new FileReader("nPlT.txt"));
            boolean war = true,war1=false,war2=false;
            String liczba;
            int liczbaT=Integer.MAX_VALUE; //liczba z pliku tekstowego
            int liczbaD=Integer.MAX_VALUE; //liczba z pliku z danymi
            long l; //pozycja getfilepointer
            do{
                if((liczba=in.readLine())!=null)
                    liczbaT=Integer.parseInt(liczba);
                        else {war1=true; liczbaT=Integer.MAX_VALUE;}
                if((l=raf.getFilePointer())<raf.length())
                    liczbaD=raf.readInt();
                        else {war2=true; liczbaD=Integer.MAX_VALUE;}
                if(war1&&war2)
                    war=false;
                        else if(war2){
                                raf.writeInt(liczbaT);
                                liczbaZmian++;
                        }
                            else if(liczbaT<liczbaD){
                                    raf.seek(l);
                                    raf.writeInt(liczbaT);
                                    liczbaZmian++;
                                    }
            }while(war);
        }catch(IOException e){if(raf!=null) raf.close();
                              if(in!=null) in.close();
                             }
            
    }
    
}