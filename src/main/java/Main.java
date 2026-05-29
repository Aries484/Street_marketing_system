public class Main {

    public static void main(String[] args) {

        // Objects
        Marketer marketer1 = new Marketer("Abel", 22, "Piazza", 15);
        Supervisor supervisor1 = new Supervisor("Sara", 30, 5);

        Campaign campaign1 = new Campaign("Summer Street Promotion", "Soft Drink");


        campaign1.showCampaign();

        System.out.println();


        marketer1.displayInfo();

        System.out.println();

        // Display Supervisor Info
        supervisor1.displaySupervisorInfo();

        System.out.println();


        Person p1 = marketer1;
        Person p2 = supervisor1;

        p1.work();
        p2.work();

        System.out.println();


        SalesCalculator calculator = new SalesCalculator();

        int bonus1 = calculator.calculateBonus(15);
        double bonus2 = calculator.calculateBonus(2000.0, 0.15);

        System.out.println("Marketer Bonus: " + bonus1);
        System.out.println("Supervisor Bonus: " + bonus2);
    }
}
