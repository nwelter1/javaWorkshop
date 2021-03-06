public class Car {
    private String make;
    private int price;
    private int year;
    private String color;

    public Car(String make, int price, int year, String color){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    // Getters
    public String getMake(){
        return this.make;
    }
    public int getPrice(){
        return this.price;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    
    //Setters
    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
}
