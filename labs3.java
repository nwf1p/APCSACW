import java.util.*;
public class labs3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String vals = "7, 3, 5, 8, 0, 2, 5, 4";
        for (int j = 0; j < vals.length(); j+=2)
        {
            nums.add(Character.getNumericValue(vals.charAt(j)));
        }
        System.out.println(deletionsE(nums));
    }
    public static int deletionsE(ArrayList<Integer> inList)
    {
        int c = 0;
        int pos = 0;
        while (inList.isEmpty() != true)
        {
            int max = -99999999;
            if (inList.indexOf(0) == -1)
            {
            }
            else
            {
                pos = inList.indexOf(0);
                inList.remove(pos);
                if (pos != 0)
                {
                    inList.remove(pos - 1);
                }
            }
            for (int i = 0; i < inList.size(); i++)
            {
                if (inList.get(i) >= max)
                {
                    max = inList.get(i);
                    pos = i;
                }
            }
            inList.set(pos, (max-2));
            c++;
        }
        return c;
    }
}