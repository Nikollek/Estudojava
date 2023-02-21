package src.basic.condicao;

public class IfAndElse {
    public static void main(String[] args) {

        int idade = 12;
        int quantidadeDePessoas = 0;
        boolean acompanhado = quantidadeDePessoas >= 2;

        if (idade >= 18 || acompanhado) {
           System.out.println("Seja bem-vindo");
        }else{
            System.out.println("entrada não permitida!");
        }

    }
}
