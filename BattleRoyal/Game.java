package BattleRoyal;

import java.util.*;

public class Game {

    private List<Player> players = new ArrayList<>();
    private Random random = new Random();
    private Configuration config = new Configuration();

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int count = scanner.nextInt();
        
        if (count > config.getMaxPlayers()) {
            System.out.println("Max players is " + config.getMaxPlayers() + ". Setting to max.");
            count = config.getMaxPlayers();
        }
        createPlayers(count);

        System.out.println("\n--- Battle Royale Started! ---");
        printPlayers();

        while (alivePlayers() > 1) {
            processGameTick();
        }

        System.out.println("\nWinner: " + getAlivePlayer().getName() + "!");
        scanner.close();
    }

    private void createPlayers(int count) {
        for (int i = 1; i <= count; i++) {
            players.add(new Player("Player" + i));
        }
    }

    private void printPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void processGameTick() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n--- New Round ---");

        List<Player> alive = getAlivePlayers();

        Player attacker = alive.get(random.nextInt(alive.size()));
        Player target;

        do {
            target = alive.get(random.nextInt(alive.size()));
        } while (target == attacker);

        int dmg = attacker.attack();
        target.takeDamage(dmg);

        System.out.println(attacker.getName() + " attacks " + target.getName() +
                           " for " + dmg + " damage!");
        System.out.println(target.getName() + " now has " + target.getHealth() +
                           " health left!");

        if (!target.isAlive()) {
            System.out.println(target.getName() + " has been eliminated!");
            System.out.println("Alive players: " + alivePlayers());
        }
    }

    private int alivePlayers() {
        return (int) players.stream().filter(Player::isAlive).count();
    }

    private Player getAlivePlayer() {
        return players.stream().filter(Player::isAlive).findFirst().orElse(null);
    }

    private List<Player> getAlivePlayers() {
        List<Player> alive = new ArrayList<>();
        for (Player p : players) if (p.isAlive()) alive.add(p);
        return alive;
    }
}
