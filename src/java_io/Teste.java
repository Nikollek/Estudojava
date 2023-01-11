package src.java_io;

import java.nio.charset.Charset;

public class Teste {
    public static void main(String[] args) {

        String m = "m";
        System.out.println(m.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

    }

}
