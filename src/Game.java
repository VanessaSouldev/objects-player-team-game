public class Game {

    Team hometeam;
    Team outteam;
    int homeTeamGoals = 0;
    int outTeamGoals = 0;

 Game(Team hometeam, Team outteam) {
        this.hometeam = hometeam;
        this.outteam = outteam;
    }

    void addGoal(boolean isHomeTeamGoal){
        if(isHomeTeamGoal) {
            homeTeamGoals += 1;
        } else {
            outTeamGoals += 1;
        }
    }

        void print(){
            System.out.println(hometeam.name + " " + outteam.name + " = " + homeTeamGoals + "-" + outTeamGoals);

    }
}




