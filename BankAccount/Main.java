import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Indsæt navn:");
        String navn = scanner.nextLine();
        System.out.println("Skriv saldo på konto:");
        int saldo = scanner.nextInt();

        BankAccount bankAcc = new BankAccount(navn, saldo);
        System.out.println("Navn:" + bankAcc.hentNavn() + ", Saldo: " + bankAcc.hentSaldo());
        
        System.out.println("Hvor meget vil du trække fra din konto?");
        int hæveBeløb = scanner.nextInt();
        bankAcc.hæveFraKonto(hæveBeløb);
        System.out.println("Din konto har nu: " + bankAcc.hentSaldo() + " DKK.");

        // System.out.println("Hvor meget vil du indsætte på din konto?");
        // int beløb = scanner.nextInt();
        // bankAcc.indsætPåKonto(beløb);
        // System.out.println("Din konto har nu: " + bankAcc.hentSaldo() + " DKK.");

        scanner.close();
    }
}