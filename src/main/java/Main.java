import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // === User Input for Campaign ===
        System.out.print("Enter campaign name: ");
        String campaignName = input.nextLine();

        System.out.print("Enter product name: ");
        String productName = input.nextLine();

        Campaign campaign = new Campaign(campaignName, productName);

        System.out.println(" --- Campaign Created ---");
                campaign.showCampaign();

        // === User Input for Marketer ===
        // Pipeline testing
        System.out.print(" Enter marketer name: ");
        String mName = input.nextLine();

        System.out.print("Enter marketer age: ");
        int mAge = input.nextInt();

        input.nextLine(); // clear buffer

        System.out.print("Enter marketer location: ");
        String location = input.nextLine();

        System.out.print("Enter number of sales: ");
        int sales = input.nextInt();

        Marketer marketer = new Marketer(mName, mAge, location, sales);

        // === User Input for Supervisor ===
        input.nextLine(); // clear buffer

        System.out.print(" Enter supervisor name: ");
        String sName = input.nextLine();

        System.out.print("Enter supervisor age: ");
        int sAge = input.nextInt();

        System.out.print("Enter team size: ");
        int teamSize = input.nextInt();

        Supervisor supervisor = new Supervisor(sName, sAge, teamSize);

        System.out.println(" --- System Output ---");

                // Display info
                marketer.displayInfo();
        System.out.println();
        supervisor.displaySupervisorInfo();

        System.out.println();

        // Polymorphism (runtime)
        Person p1 = marketer;
        Person p2 = supervisor;

        p1.work();
        p2.work();

        System.out.println();

        // Bonus calculation
        SalesCalculator calculator = new SalesCalculator();

        int bonus1 = calculator.calculateBonus(sales);
        double bonus2 = calculator.calculateBonus(sales * 100.0, 0.15);

        System.out.println("Marketer Bonus: " + bonus1);
        System.out.println("Supervisor Bonus: " + bonus2);

        input.close();
    }
}