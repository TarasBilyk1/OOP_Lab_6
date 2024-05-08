public class Phone
{

    public int Weight ;
    public String Number ;
    public String Model ;

    public Phone (String number, String model, int weight) {
        this.Number = number;
        this.Model = model;
        this.Weight = weight;
    }
    public Phone(String number, String model) {
        this.Number = number;
        this.Model = model;
    }
    String getNumber () {
        return Number ;
    }
    void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }
    void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " з номера " + callerNumber);
    }

    // Метод для відправлення повідомлення
    void sendMessage(String... numbers) {
        System.out.println("Надсилаю повідомлення на наступні номери:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
    public void Sout () {
        System.out.println("Інформація про номер " + Number);
        System.out.println("Інформація про мдель " + Model );
        System.out.println("Інформація про вашгу " + Weight + "г");

    }
}
