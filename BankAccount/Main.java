import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter amount in account: ");
        int amount = scanner.nextInt();

        BankAccount bankAcc = new BankAccount(name, amount);

        System.out.println(bankAcc.getName());
        System.out.println(bankAcc.getAmount());
        scanner.close();
    }
}