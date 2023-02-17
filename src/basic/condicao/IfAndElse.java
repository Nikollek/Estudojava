package src.basic.condicao;

public class IfAndElse {
    public static void main(String[] args) {

        int idade = 12;
        int quantidadeDePessoas = 2;

        if (idade >= 18) {
           System.out.println("Seja bem-vindo");
        }else{
            if(quantidadeDePessoas <= 2) {
                System.out.println("Idade não permitida!");
            }else{
                System.out.println("Seja bem vindo!!");
            }
        }

    }
}
