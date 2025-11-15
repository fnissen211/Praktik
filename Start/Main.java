package Start;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hej! Hvad er dit navn?");
        String navn = scanner.nextLine();
        System.out.println("Velkommen, " + navn + "!");




        scanner.close();
    }
    
}
