import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Введіть номер завдання від 1 до 5 : ");
        Scanner scan = new Scanner(System.in);

        Ex Extern = new Ex();
        Ex_CODE code = new Ex_CODE();

        do {
            code.NumberPoint();
            int Ex_Num = code.getEx_Number();

            /*---------------------- Завдання 1 ------------------------*/
            if (Ex_Num == 1) Extern.Ex_1();
            /*---------------------- Завдання 2 ------------------------*/
            else if (Ex_Num == 2) Extern.Ex_2();
            /*---------------------- Завдання 3 ------------------------*/
            else if (Ex_Num == 3) Extern.Ex_3();
            /*---------------------- Завдання 4 ------------------------*/
            else if (Ex_Num == 4) Extern.Ex_4();
            /*---------------------- Завдання 5 ------------------------*/
            else if (Ex_Num == 5) Extern.Ex_5();
            /*---------------------- Неіснуюче ------------------------*/
            else
            if (Ex_Num == 0) break;
            System.out.println("Щоб завершити програму натисніть (0).Щоб продовжити виберіть завдання від 1 по 5");
        }while(true);
        scan.close();
    }
}