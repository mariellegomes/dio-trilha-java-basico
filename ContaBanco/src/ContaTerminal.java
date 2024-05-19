import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // ToDo: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para nosso usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o seu Nome!");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o seu Saldo!");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
