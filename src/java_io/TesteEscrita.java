package src.java_io;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("hey hey hey hey ehey");
        bw.newLine();
        bw.newLine();
        bw.write("sad sad sad sad sad");

        bw.close();
    }
}
