public class BankAccount {
    private final String ownerName;
    private final String accountNumber;
    private double balance;

    // Конструктор класу BankAccount
    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Метод для покладання грошей на рахунок
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " грн успішно покладено на рахунок.");
    }

    // Метод для зняття грошей з рахунку
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " грн успішно знято з рахунку.");
        } else {
            System.out.println("Недостатньо коштів на рахунку.");
        }
    }

    // Метод для виведення даних про рахунок
    public void display() {
        System.out.println("Ім'я власника: " + ownerName);
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Поточний баланс: " + balance + " грн");
    }
}