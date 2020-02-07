public class labs1
{
    public static String ACSLLand(String list)
    {
        int apos = 0;
        int bpos = 0;
        int turn = 0;
        int rol = 0;
        System.out.println(list);
        for (int i = 0; i < list.length(); i += 2)
           {
            rol = Character.getNumericValue(list.charAt(i));
            if (rol == 0 || apos > 39 || bpos > 39)
               break;
            if (turn == 0)
               {
               if (rol == 4 || rol == 6)
                   apos += rol*(-1);
                   if (apos < 0)
                       apos = 0;
                else
                    apos += rol;
                if (apos == bpos)
                    bpos = 0;
                turn = 1;
                }
            else
               {if (rol == 4 || rol == 6)
                   bpos += rol*(-1);
                   if (bpos < 0)
                       bpos = 0;
                else
                    bpos += rol;
                if (apos == bpos)
                    apos = 0;
                turn = 0;
            }
            System.out.println(apos + ", " + bpos);
        }
        if (apos >= 40)
            return ("A-END, B-" + bpos);
        if (bpos >= 40)
            return ("A-" + apos + ", B-END");
        else
            return "A-" + apos + ", B-" + bpos;
    }
public static void main(String[] args)
   {String rolls = "5,7,4,1,3,8,7,6,4,6,0";
    System.out.println (ACSLLand(rolls));
    for (int j = 0; j < rolls.length(); j += 2)
       {System.out.println(rolls.charAt(j));
    }
    }
}
