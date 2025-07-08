class Car {
    String make, model;
    int year;

    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.make = "Toyota";
        c.model = "Corolla";
        c.year = 2022;
        c.displayDetails();
    }
}