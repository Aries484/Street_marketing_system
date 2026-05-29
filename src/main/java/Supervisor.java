public class Supervisor extends Person {

    private int teamSize;

    public Supervisor(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if(teamSize > 0) {
            this.teamSize = teamSize;
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " is supervising street marketers.");
    }

    public void displaySupervisorInfo() {
        System.out.println("Supervisor Name: " + getName());
        System.out.println("Team Size: " + teamSize);
    }
}