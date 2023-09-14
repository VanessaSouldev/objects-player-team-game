import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Team t1 = new Team("Banaan", "Amsterdam");

        Player p1 = new Player("Leo Messi", 10_000_000, 'm');

        Player p2 = new Player("Lieke Martens", 20_000_000, 'f');

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.showPlayers();
    }
}
