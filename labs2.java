public class labs2
{
    public static String sumOfPairs(String n)
    {
        String sol = "";
        int val = 0;
        for (int i = 2; i < 2*Character.getNumericValue(n.charAt(0)) + 1; i+=2)
            {
               val = Character.getNumericValue(n.charAt(i));
               sol += "Pairs for " + val + ":";
               if (val < 3)
                   sol += " NONE ";
               else
               {
                   for (int j = 1; j < (val-1)/2 + 1; j++)
                   {
                       sol += " " + j + " " + (val-j) + ",";
                   }
               }
               sol = sol.substring(0, sol.length()-1);
               sol += "\n";
            }
        return sol;
    }
    public static void main (String[] args)
    {
        String inp = "4 2 3 4 5";
        System.out.println(sumOfPairs(inp));
    }
}
