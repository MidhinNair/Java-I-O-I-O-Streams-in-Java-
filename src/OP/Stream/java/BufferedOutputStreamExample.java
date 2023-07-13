package OP.Stream.java;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fp = new FileOutputStream( "F:\\scaler db\\StreamIO pack\\StreamIO\\src\\output.txt");
            BufferedOutputStream bf = new BufferedOutputStream(fp);
            String s = "Example of BufferedOutputStream it writed on output file";
            char ch [] = s.toCharArray();
            int x=0;
            while(x<s.length()){
                bf.write(ch[x++]);
            }bf.close();
            fp.close();
        }catch(Exception e){}
    }
}
