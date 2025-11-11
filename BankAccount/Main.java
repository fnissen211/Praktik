import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter amount in account:");
        int amount = scanner.nextInt();

        BankAccount bankAcc = new BankAccount(name, amount);
        System.out.println("Name:" + bankAcc.getName() + ", Amount: " + bankAcc.getAmount());
        
        System.out.println("How much do you want to withdraw from your account?");
        int withdrawAmount = scanner.nextInt();
        bankAcc.withdrawFromAccount(withdrawAmount);
        System.out.println("Your account now has: " + bankAcc.getAmount() + " DKK.");

        // System.out.println("How much do you want to withdraw from your account?");
        // int depositAmount = scanner.nextInt();
        // bankAcc.depositToAccount(depositAmount);
        // System.out.println("Your account now has: " + bankAcc.getAmount() + " DKK.");

        scanner.close();
    }
}