package com.codewithjit;
import java.io.*;
public class FileReader {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            String inputFileName="/Users/jiteshgandluru/IdeaProjects/JavaUtilities/input.txt";
            String outputFileName="output.txt";
            in = new FileInputStream(inputFileName);
            out = new FileOutputStream(outputFileName);

            int c;
            while ((c = in.read()) != -1) {
                 out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

        }
    }
}
