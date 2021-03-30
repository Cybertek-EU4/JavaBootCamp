package day02;


class Car{
    public String brand, model, color;
    public double price;

    public Car(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }

}

class Toyota extends Car{

    public Toyota(String model, String color, double price){
        super("Toyota", model, color, price );
    }

}

class Mercedes extends Car{

    public Mercedes( String model, String color, double price) {
        super("Mercedes", model, color, price);
    }

}

class BMW extends Car{

    public BMW( String model, String color, double price) {
        super("BMW", model, color, price);
    }
}

public class InheritancePractice {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "White", 15000);
        Mercedes mercedes = new Mercedes("AMG", "Black", 60000);
        BMW bmw = new BMW("X7", "Red", 75000);

        System.out.println(toyota);
        System.out.println(mercedes);
        System.out.println(bmw);
    }
}
