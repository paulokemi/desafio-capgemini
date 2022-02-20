import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = entrada.next();

        String senhaForte = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)(?=.*[@#$*%^&+=])(?=.*[0-9]).{6,}$";

        while(!senha.matches(senhaForte)){
            System.out.println("A senha deve ser forte e conter os seguintes requisitos: ");
            System.out.println("Possuir no mínimo 6 caracteres ");
            System.out.println("Conter no mínimo 1 digito");
            System.out.println("Conter no mínimo 1 letra em minúsculo");
            System.out.println("Conter no mínimo 1 letra em maiúsculo");
            System.out.println("Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
            System.out.println("Digite sua senha: ");
            senha = entrada.next();
        }

            System.out.println("A senha é: " + senha);

    }
}
