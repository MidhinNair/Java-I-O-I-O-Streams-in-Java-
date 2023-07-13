package IO.stream.java;

import java.io.FileInputStream;
//using FileInputStream

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{FileInputStream  f =new FileInputStream("F:\\scaler db\\StreamIO pack\\StreamIO\\src\\text.txt");
        int x=0;
        while((x=f.read()) !=-1){
            System.out.print( (char) x);
        }f.close();
        }
        catch (Exception e){}
    }
}
