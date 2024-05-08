import java.util.Scanner;
public class Ex_CODE
{
    Scanner scan = new Scanner(System.in);
    private int Ex_Number ;
    public int getEx_Number() {
        return Ex_Number ;
    }
    public void setEx_Number(int ex_Number)
    {
        if (ex_Number > 4 )
            System.out.println("Такого звадання не існує ! ");
        else
            this.Ex_Number = ex_Number ;
    }
    public void NumberPoint ()
    {
        int Error ;
        do
        {
            try {
                setEx_Number(scan.nextInt());
                Error = 0 ;
            } catch (Exception exception) {
                System.out.println(" Ви ввели не число ! ");
                Error = 1 ;
                scan.nextLine();
            }
        } while (Error == 1);
        scan.nextLine();
    }
}