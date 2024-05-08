abstract class Car {
    String model;
    String color;
    int maxSpeed;

    // Конструктор класу Car
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // Метод для руху вперед
    public void gas() {
        System.out.println("Газуємо!");
    }

    // Абстрактний метод для гальмування
    public abstract void brake();
}

// Похідний клас Sedan
class Sedan extends Car {
    // Конструктор класу Sedan
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    // Реалізація абстрактного методу для гальмування
    @Override
    public void brake() {
        System.out.println("Седан гальмує.");
    }
}

// Похідний клас Truck
class Truck extends Car {
    // Конструктор класу Truck
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    // Реалізація абстрактного методу для гальмування
    @Override
    public void brake() {
        System.out.println("Грузовик гальмує.");
    }
}
