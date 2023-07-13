package IO.stream.java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try {

            FileInputStream f = new FileInputStream("F:\\scaler db\\StreamIO pack\\StreamIO\\src\\text.txt");
            BufferedInputStream bf = new BufferedInputStream(f);

            // using the available method
            System.out.println("Available bytes: " + bf.available());
            int x = 0;
            while ((x = bf.read()) != -1) {
                System.out.print((char) x);
            }bf.close();

        }catch(Exception e){

        }
    }
}
