import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite o numero da conta: ");
        conta.numero = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o nome do titular da conta: ");
        conta.nome = sc.nextLine();

        System.out.println("Digite o numero da agencia: ");
        conta.agencia = sc.nextLine();

        System.out.println("Digite o seu saldo: ");
        conta.saldo = sc.nextDouble();

        System.out.println("Olá " + conta.nome + ", obrigado por criar uma conta em nosso banco, sua Agencia e: " + conta.agencia + ", conta: " + conta.numero + ", e seu saldo " + conta.saldo + " ja esta disponivel");
    }
}