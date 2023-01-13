package src.java_io.serializacao.teste;

import src.java_io.Cliente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaopt2 {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Nikolle");
        cliente.setProfissao("DEV");
        cliente.setCpf("123456789");

        ContaCorrente cc = new ContaCorrente(222,333);

        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
