public class BankAccount {
    private String name;
    private int amount;

    public BankAccount(String name, int amount) {
        this.name = name;

        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int withdrawFromAccount(int withdrawAmount) {
        // INSERT CODE HERE
        // Der skal trækkes penge fra din konto, så selve
        // withdrawAmount skal minusses med selve amount på din konto


        return amount; // Denne linje skal slettes og der skal oprettes en ny return
    }

    // Lav en ny metode nedenunder der hedder depositToAccount, så der også kan
    // indsættes penge på din konto. Udkommenter linjerne i Main.java-filen
    // når du er færdig med din metode.

}