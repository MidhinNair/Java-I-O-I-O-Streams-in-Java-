package OP.Stream.java;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fp = new FileOutputStream("F:\\scaler db\\StreamIO pack\\StreamIO\\src\\output.txt");
            String s= "Example of ByteArrayOutputStream it writed on output file";
            ByteArrayOutputStream by = new ByteArrayOutputStream();
            by.write(s.getBytes());
            by.writeTo(fp);
            by.close();
            fp.close();
        }catch(Exception e){}
    }
}
