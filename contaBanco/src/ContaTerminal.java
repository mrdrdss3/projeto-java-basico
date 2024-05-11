import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
