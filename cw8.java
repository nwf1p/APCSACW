
import java.util.Scanner;
public class cw8
{
  public static boolean raceToday(int size, boolean isFriday)
  {
       if (size >= 150 && size <= 800 && isFriday == true)
        return true;
       return false;
  }
  public static int numValue(int number)
  {
  if (number%2 == 0)
    return 5*number;
  if (number%5 == 0)
    return number/5;
  return number*3;
  }
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println ("Height?");
       double height = scan.nextDouble();
       System.out.println ("Width?");
       double width = scan.nextDouble();
       System.out.println ("The area of your triangle is " + height*width*.5);
       
       System.out.println (raceToday(30, true));
       System.out.println (raceToday(450, false));
       System.out.println (raceToday(700, true));
       System.out.println (raceToday(850, true));

       
       System.out.println (numValue(10));
       System.out.println (numValue(9));
       System.out.println (numValue(15));
    }
}
