import java.util.ArrayList;

public class Team {
    String name;
    String city;
    ArrayList<Player> players;

    Team(String name, String city) {
        this.name = name;
        this.city = city;
        players = new ArrayList<>();
    }

    void addPlayer(Player p) {
        this.players.add(p);
        p.team = this;
    }

    void showPlayers() {
        for (Player p : this.players) {
            p.print();
        }
    }
}
