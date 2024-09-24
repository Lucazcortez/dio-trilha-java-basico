import java.util.Scanner;

public class ContaTerminal {

    public static void main(String [] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da sua Conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua Agência:");
            agencia = scanner.next();

            System.out.println("Digite o seu nome:");
            nomeCliente = scanner.next();

            System.out.println("Digite o saldo da sua conta:");
            saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + " obrigado por criar conta em nosso banco,sua agência é" + agencia + ", conta " + numeroConta + "e o seu saldo" + saldo + " já está disponive para saque.");
        }

        }
    