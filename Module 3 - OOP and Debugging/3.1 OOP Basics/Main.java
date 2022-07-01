
public class Main {
    // Dealership can sell many different cars
    // Cars have a make, price, year, and color to describe them
    // Dealership can search for a car based on model and price
    // Car drives off the dealership lot after purchase
    public static void main(String[] args) {
        // String make1 = "Toyota";
        // int price1 = 50000;
        // int year1 = 2022;
        // String color1 = "green";
        // System.out.println("This is a " + color1 + " " +  year1 + " " + make1 + ". It is $" + price1);
        // String make2 = "Nissan";
        // int price2 = 120000;
        // int year2 = 2020;
        // String color2 = "black";
        // System.out.println("This is a " + color2 + " " +  year2 + " " + make2 + ". It is $" + price2);
        Car car1 = new Car("toyota", 50000, 2022, "green");
        Car car2 = new Car("nissan", 120000, 2020, "black");
        

        System.out.println("This is a " + car1.getColor() + " " +  car1.getYear() + " " + car1.getMake() + ". It is $" + car1.getPrice());
        System.out.println("This is a " + car2.getColor() + " " +  car2.getYear() + " " + car2.getMake() + ". It is $" + car2.getPrice());
        car1.setColor("Brown");
        System.out.println(car1.getColor());

    }

    
}
