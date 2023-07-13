package IO.stream.java;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

    public static void main(String[] args) throws IOException {
        try {
            // loading a file into f1 variable using FileInputStream
            FileInputStream f1 = new FileInputStream("F:\\scaler db\\StreamIO pack\\StreamIO\\src\\text.txt");

            int x = 0;
            String S = "";
            // while loop untill the end of the file.
            while ((x = f1.read()) != -1) {
                // printing the character
                S = S + (char) x;
            }
            // closing a input stream
            f1.close();

            // converting string to array of bytes
            byte[] b = S.getBytes();
            // declaring ByteArrayInputStream
            ByteArrayInputStream b1 = new ByteArrayInputStream(b);

            x = b1.read();
            while (x != -1) {
                System.out.print((char) x);
                x = b1.read();
            }
            System.out.println();
            // close the input stream
            b1.close();
        } catch (Exception e) {
            // printing exception
            System.out.println(e);
        }
    }
}
