import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Informe o número da conta: ");
        numero = sc1.nextInt();
        System.out.println("Informe o número da agência com dígito: ");
        agencia = sc1.next();
        System.out.println("Informe o nome do cliente: ");
        nomeCliente = sc1.next();
        System.out.println("Informe o saldo: ");
        saldo = sc1.nextDouble();

        System.out.println("Olá, "+ nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }


}
