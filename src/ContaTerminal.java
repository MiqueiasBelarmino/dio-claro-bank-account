import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try {
            Scanner readScanner = new Scanner(System.in);
            System.out.print("Por favor, informe o número da conta: ");
            int numeroConta = readScanner.nextInt();
            readScanner.nextLine();
            System.out.print("Por favor, informe a agência: ");
            String agencia = readScanner.nextLine();
            System.out.print("Por favor, informe o nome do cliente: ");
            String nomeCliente = readScanner.nextLine();
            System.out.print("Por favor, informe o saldo inicial: ");
            BigDecimal saldo = readScanner.nextBigDecimal();
            readScanner.close();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
             " sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo.doubleValue());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
