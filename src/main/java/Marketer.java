public class Marketer extends Person {

    private String location;
    private int sales;

    public Marketer(String name, int age, String location, int sales) {
        super(name, age);
        this.location = location;
        this.sales = sales;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        if(sales >= 0) {
            this.sales = sales;
        }
    }

    @Override
    public void work() {

        System.out.println(getName() + " is promoting products on the street.");
    }

    public void displayInfo() {
        System.out.println("Marketer Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Location: " + location);
        System.out.println("Sales: " + sales);
    }
}