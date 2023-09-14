public class Player {
    String name;
    int salary;
    char gender;
    Team team;

    Player(String name, int salary, char gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
    void print() {
        System.out.println("Player " + name + ", salary " + salary +
                ", gender " + gender + ", plays for " + team.name);
    }
}
