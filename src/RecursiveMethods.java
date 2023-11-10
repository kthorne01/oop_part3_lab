// Part 1: Recursive Methods

public class RecursiveMethods {

    // Method 1: Factorial Calculation
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Method 2: Fibonacci Sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Method 3: Sum of Numbers
    public static int sum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }

    // Method 4: Counting Down
    public static void countDown(int n) {
        if (n <= 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    // Method 5: Power of a Number
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    // Main method to call the recursive functions
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci of 5: " + fibonacci(5));
        System.out.println("Sum of 5: " + sum(5));
        countDown(5);
        System.out.println("2^3: " + power(2, 3));
    }
}

// Part 2: Vehicle Class Hierarchy

// Base class
class Vehicle {
    private String brand; // Accessible only within this class

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to display vehicle's brand
    protected void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Car class extends Vehicle
class Car extends Vehicle {
    private String carType;

    public Car(String brand, String carType) {
        super(brand);
        this.carType = carType;
    }

    public void displayCarDetails() {
        super.displayBrand();
        System.out.println("Car Type: " + carType);
    }
}

// Bike class extends Vehicle
class Bike extends Vehicle {
    private boolean hasBasket;

    public Bike(String brand, boolean hasBasket) {
        super(brand);
        this.hasBasket = hasBasket;
    }

    public void displayBikeDetails() {
        super.displayBrand();
        System.out.println("Has Basket: " + hasBasket);
    }
}

// Truck class extends Vehicle
class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, int loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    public void displayTruckDetails() {
        super.displayBrand();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Bus class extends Vehicle
class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String brand, int passengerCapacity) {
        super(brand);
        this.passengerCapacity = passengerCapacity;
    }

    public void displayBusDetails() {
        super.displayBrand();
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }
}

