public class SalesCalculator {

    // Compile-time Polymorphism (Method Overloading)

    public int calculateBonus(int sales) {
        return sales * 10;
    }

    public double calculateBonus(double sales, double percentage) {
        return sales * percentage;
    }
}