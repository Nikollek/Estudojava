package src.java_io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter ps = new PrintWriter("lorem2.txt","UTF-8");
        ps.println("Aliquam sit amet finibus risus, in pharetra ligula. Maecenas tellus neque, scelerisque vitae interdum vel, suscipit in nunc.");
        ps.println();
        ps.println();
        ps.println();
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");

    }
}
