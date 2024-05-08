public class Person
{
   public String fullName ;
   public int age ;

   public Person ()
   {
       fullName = "Поки не відомий " ;
       age = 0 ;
   }
   public Person (String fullName , int age)
   {
        this.fullName = fullName ;
        this.age = age ;
   }
   public void move ()
   {
       System.out.println(fullName + "рухається ");
   }
   public void talk() { System.out.println(fullName +"говорить "); }
}
