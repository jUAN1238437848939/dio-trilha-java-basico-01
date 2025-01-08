import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, informe seu nome Cliente!");
        String Nome_cliente = in.nextLine();
        System.out.println("Por favor, informe seu número de agência");
        int Agencia = in.nextInt();
        System.out.println("Por favor, informe o número da conta");
        int Numero_conta = in.nextInt();
        System.out.println("Por favor, informe seu saldo atual");
        float Saldo = in.nextFloat();
        System.out.println("Olá "+ Nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+ ", conta "+ Numero_conta + " e seu saldo " + Saldo + "R$ já está disponível para saque.");




    }
}
