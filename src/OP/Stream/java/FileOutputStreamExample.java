package OP.Stream.java;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fp = new FileOutputStream("F:\\scaler db\\StreamIO pack\\StreamIO\\src\\output.txt");
            String s = "Example of FileOutputStream it writed on output file";
            char ch [] = s.toCharArray();
            int x=0;
            while(x<s.length()){
                fp.write(ch[x++]);
            }fp.close();

        }catch(Exception e){}
    }
}
