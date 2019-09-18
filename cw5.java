import java.util.Scanner;
public class cw5
{
public static void main(String[] args)
{
    double roll = Math.floor(Math.random()*(6))+1;
    System.out.println ("You rolled a " + roll);
    //for (int trial = 0; trial <=10; trial ++)
    //{
    //    System.out.println (Math.random());
    //}
    int rollone = (int)(Math.random()*(6))+1;
     int rolltwo = (int)(Math.random()*(6))+1;
     if (rollone + rolltwo == 7 || rollone + rolltwo == 11)
     {System.out.println ("The dice were a " + rollone + " and a " + rolltwo + "! You win!");
        }
     else
      System.out.println ("The dice were a " + rollone + " and a " + rolltwo + ". You lose.");
    
    Scanner sc = new Scanner (System.in);
     System.out.println ("Ask me a question:");
     String useless = sc.nextLine();
     double ranos = Math.floor(Math.random()*(7))+1;
     if (ranos == 1)
        System.out.println ("It is certain.");
     if (ranos == 2)
        System.out.println ("Without a doubt.");
     if (ranos == 3)
        System.out.println ("Reply hazy, try again.");
     if (ranos == 4)
        System.out.println ("Better not tell you now.");
     if (ranos == 5)
        System.out.println ("Concentrate and ask again.");
     if (ranos == 6)
        System.out.println ("Don't count on it.");
     if (ranos == 7)
        System.out.println ("Very doubtful.");
    
    
     System.out.println ("How many sides do you want your dice to have?");
     int sides = sc.nextInt();
     if (sides <= 0)
     {System.out.println ("Invalid entry!");
        }
     else
     //for (int i=0; i<=10; i++)
     //{
         System.out.println ("You rolled a " + (int)(Math.random()*(sides)+1));    
        //}
     int numAttempt = 0;
     int rone = 0;
     int rtwo = 0;
    while (rone + rtwo != 7 && rone + rtwo != 11 && numAttempt <= 30)
    {rone = (int)(Math.random()*(6))+1;
     rtwo = (int)(Math.random()*(6))+1;
     numAttempt ++;
     //System.out.println (rone);
     //System.out.println (rtwo);
     //System.out.println (numAttempt);
    }
    if (numAttempt > 30)
    {System.out.println ("You didn't win. Wow you have bad luck.");
    }
    else
    System.out.println ("You won after " + numAttempt + " attempts with rolls of " + rone + " and " + rtwo);
}
}

