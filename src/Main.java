import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Leo Messi", 10_000_000, 'm');
        Player p2 = new Player("Lieke Martens", 20_000_000, 'f');

        ArrayList<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        Team t1 = new Team("RealMadrid", "Madrid");
        Team t2 = new Team("Ajax", "Amsterdam");
        Game g1 = new Game(t1, t2);

        g1.addGoal(true);
        g1.addGoal(true);


        t1.addPlayer(p1);
        t1.addPlayer(p2);

        g1.print();



    }
}
