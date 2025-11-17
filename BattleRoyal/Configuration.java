package BattleRoyal;

public class Configuration {
    // Sat til 20, ellers tager spillet for lang tid
    public int getMaxPlayers() {
        return 20;
    }

    public int getMinPlayers() {
        return 2;
    }

    public int setWaitTimeBetweenRounds() {
        return 2000; // (Det er millisekunder her, så 2000 = 2 sekunder)
    }
}
