package src.java_io.serializacao;

import src.java_io.Cliente;

import java.io.*;

public class TesteSerializacaoEscrita {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Nikolle");
        cliente.setProfissao("DEV");
        cliente.setCpf("123456789");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

    }
}
