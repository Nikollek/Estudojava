package src.java_io;

import java.io.*;

public class TesteSerializacao {

    //exceção de classe não achada, porque pode ter serializado o objeto e depois apagado a classe que continha ele
    //no nosso caso, a classe é o String
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);

    }
}
