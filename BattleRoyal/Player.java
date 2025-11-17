package BattleRoyal;

import java.util.Random;

public class Player {
    private int health;
    private int damage;
    private String name;
    private Random random = new Random();

    public Player(String name) {
        this.name = name;
        this.health = random.nextInt(50) + 50;
        this.damage = random.nextInt(5) + 5;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public int attack() {
        return damage + random.nextInt(6);
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + ", DMG: " + damage + ")";
    }
}
