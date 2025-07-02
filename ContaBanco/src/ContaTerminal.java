import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To do: conhecer e importar a classe scanner
        var scanner = new Scanner(System.in);
        //Exibir mensagens solicitando o código agência
        System.out.println("Por gentileza, digite o código da agência com dígito:");
        //Obter pelo scanner o código da agência
        String agency = scanner.next();
        //Exibir mensagens solicitando o número da conta corrente
        System.out.println("Por gentileza, digite o número da conta corrente:");
        //Obter pelo scanner o número da conta corrente
        int currentAccount = scanner.nextInt();
        //Exibir mensagens solicitando o nome do cliente
        System.out.println("Por gentileza, digite o nome completo:");
        //Obter pelo scanner o nome do cliente
        String customerName = scanner.next();
        // saldo conta corrente - informação interna
        Double currentAccountBalance = 247.48;  
        //Exibir a mensagen conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",customerName, agency, currentAccount, currentAccountBalance );
    }
}
