import java.util.Scanner;
public class Ex
{
    Scanner scan = new Scanner(System.in);
    public void Ex_1()
    {
        Person person1 = new Person("Taras ", 18);
        person1.move();
        person1.talk();

        Person person2 = new Person();
        person2.move();
        person2.talk();

        System.out.println();
    }

    public void Ex_2() {
        Phone phone1 = new Phone("+380 50 786 12 32", "Iphone14 Pro", 170);
        Phone phone2 = new Phone("+380 99 800 45 32", "Iphone12",     160);
        Phone phone3 = new Phone("+380 64 666 72 42", "Iphone11" );

        // -------------------- 1 -----
        System.out.println();
        System.out.println("Інформація про перший телефон ");
        phone1.Sout();

        System.out.println("Введіть своє імя ");
        phone1.receiveCall(scan.next() , phone1.getNumber()+"\n");

        phone3.sendMessage("111-222-333", "444-555-666");
        // -------------------- 2 -----
        System.out.println("Інформація про другий телефон ");
        phone2.Sout();
        System.out.println();

        System.out.println("Введіть своє імя ");
        phone2.receiveCall(scan.next());
        System.out.println(phone2.getNumber()+"\n");

        phone3.sendMessage("111-222-333", "444-555-666");
        // -------------------- 3 -----
        System.out.println("Інформація про третій телефон ");
        phone3.Sout();
        System.out.println();

        System.out.println("Введіть своє імя ");
        phone3.receiveCall(scan.next());
        System.out.println(phone3.getNumber()+"\n");

        phone3.sendMessage("111-222-333", "444-555-666");
    }

    public void Ex_3 ()
    {
        System.out.println("Введи Радіус і Висоту циліндра ");
        Cylinder cylinder = new Cylinder(scan.nextInt(), scan.nextInt());
        System.out.println("Введи площу піраміди і Висоту ");
        Pyramid pyramid = new Pyramid(scan.nextInt(), scan.nextInt());
        System.out.println("Введи Радіус кулі ");
        Ball ball = new Ball(scan.nextInt());

        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());
        System.out.println("Об'єм кулі: " + ball.getVolume());
    }
    public void Ex_4 ()
    {
        Sedan sedan = new Sedan("Toyota Camry", "Чорний", 220);
        System.out.println("Інформація про седан:");
        System.out.println("Модель: " + sedan.model);
        System.out.println("Колір: " + sedan.color);
        System.out.println("Максимальна швидкість: " + sedan.maxSpeed);
        sedan.gas(); // Виклик методу для руху вперед
        sedan.brake(); // Виклик абстрактного методу для гальмування

        System.out.println();

        // Створення об'єкту класу Truck
        Truck truck = new Truck("Volvo FH", "Синій", 180);
        System.out.println("Інформація про грузовик:");
        System.out.println("Модель: " + truck.model);
        System.out.println("Колір: " + truck.color);
        System.out.println("Максимальна швидкість: " + truck.maxSpeed);
        truck.gas(); // Виклик методу для руху вперед
        truck.brake(); // Виклик абстрактного методу для гальмування
    }
    public void Ex_5 ()
    {
        // Створення об'єкта банківського рахунку
        BankAccount account = new BankAccount("Іван Петров", "1234567890", 1000.0);

        // Використання методів об'єкта
        account.display(); // Виведення даних про рахунок
        account.deposit(500.0); // Покласти 500 грн на рахунок
        account.withdraw(200.0); // Зняти 200 грн з рахунку
        account.display(); // Виведення оновлених даних про рахунок
    }
}