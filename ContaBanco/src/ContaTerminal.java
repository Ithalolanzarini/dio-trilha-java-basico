import java.util.Scanner;

public class ContaTerminal {
 
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu primeiro nome!");
        String nome = sc.next();

        System.out.println("Por favor, informe seu saldo!");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + " já está disponível para saque");

        }
         
    }
    
