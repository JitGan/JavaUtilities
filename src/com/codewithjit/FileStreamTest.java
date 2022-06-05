package com.codewithjit;
import java.io.*;
public class FileStreamTest {
    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("test.txt");
            String [] strArry={"Line1","Line2"};
            //byte[] bWrite = {11, 21, 3, 5, 40};
            for (String b : strArry) {
                System.out.println("Writing:"+b);
                os.write(b.getBytes());   // writes the bytes
            }
            os.flush();
            os.close();
            System.out.println("test.txt File Has been Written");

            System.out.println("Reading the file test.txt");
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

