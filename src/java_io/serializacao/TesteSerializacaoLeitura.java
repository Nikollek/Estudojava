package src.java_io.serializacao;

import src.java_io.Cliente;

import java.io.*;

public class TesteSerializacaoLeitura {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente)ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getProfissao());

    }
}
