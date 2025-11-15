public class BankAccount {
    // Variabler
    private String name;
    private int saldo;

    // Konstruktør
    public BankAccount(String name, int saldo) {
        this.name = name;

        this.saldo = saldo;
    }

    // Dette er properties (både hentNavn og hentSaldo)
    public String hentNavn() {
        return name;
    }

    public int hentSaldo() {
        return saldo;
    }

    // Dette er en metode
    public int hæveFraKonto(int hæveBeløb) {
        // INDSÆT KODE HER
        // Der skal trækkes penge fra din konto, så selve
        // 'hæveBeløb' skal minusses med selve saldoen på din konto

        
        return saldo;
    }

    // Lav en ny metode nedenunder der hedder indsætPåKonto, så der også kan
    // indsættes penge på din konto. Udkommenter linjerne i Main.java-filen
    // når du er færdig med din metode.

}