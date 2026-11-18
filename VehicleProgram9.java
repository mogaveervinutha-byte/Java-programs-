class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Parent brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand;

    Car(String vehicleBrand, String carBrand) {
        super(vehicleBrand);
        this.brand = carBrand;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Child brand: " + brand);
    }
}

public class VehicleProgram9 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Fortuner");
        car.display();
    }
}
