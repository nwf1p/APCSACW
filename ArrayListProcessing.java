import java.util.*;
public class ArrayListProcessing
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        
        System.out.println(returnElement(sports, 3));
        printElements(sports);
        System.out.println(searchForElement(sports, "Soccer"));
        System.out.println(searchAndCountElement(sports, "Soccer"));
        System.out.println(copyAndReturnList(sports));
        reverseElements(sports);
        shuffleElements(sports);
        insertElement(sports, "Football");
        removeThirdElement(sports);
    }
    
    //Number 3
    public static String returnElement (ArrayList<String> inList, int n)
    {
        return inList.get(n);
    }
    
    //Number 4
    public static void removeThirdElement(ArrayList<String> inList)
    {
        inList.remove(2);
        for(int i = 0; i < inList.size(); i++)
            System.out.println(inList.get(i));
    }
    
    //Number 1
    public static void printElements(ArrayList<String> inList)
    {
        for (int i = 0; i < inList.size(); i++)
            System.out.println(inList.get(i));
    }
    
    //Number 2
    public static void insertElement(ArrayList<String> inList, String newSport)
    {
        inList.add(0, newSport);
        for (int i = 0; i < inList.size(); i++)
            System.out.println(inList.get(i));
    }
    
    //Number 5
    public static int searchForElement(ArrayList<String> inList, String search)
    {
        for (int i = 0; i < inList.size(); i++)
            if (inList.get(i).equals(search))
                return i;
        return -1;
    }
    
    //Number 6
    public static int searchAndCountElement(ArrayList<String> inList, String search)
    {
        int count = 0;
        for (int i = 0; i < inList.size(); i++)
            if (inList.get(i).equals(search))
                count++;
        return count;
    }
    
    //Number 7
    public static List<String> copyAndReturnList(ArrayList<String> inList)
    {
        ArrayList<String> sportsCopy = new ArrayList<String>();
        for (int i = 0; i < inList.size(); i++)
            sportsCopy.add(inList.get(i));
        return sportsCopy;
    }
    
    //Number 8
    public static void shuffleElements(ArrayList<String> inList)
    {
        int spot = 0;
        String valSto = "";
        for (int i = 0; i < 10*inList.size(); i++)
            spot = (int)Math.ceil(Math.random()*inList.size());
            valSto = inList.get(spot);
            inList.remove(spot);
            inList.add((int)Math.ceil(Math.random()*inList.size()),valSto);
        for (int j = 0; j < inList.size(); j++)
            System.out.println(inList.get(j));
    }
    
    //Number 9
    public static void reverseElements(ArrayList<String> inList)
    {
        String valueSto = "";
        for (int i = 0; i < inList.size(); i++)
        {
            valueSto = inList.get(i);
            inList.remove(i);
            inList.add(0, valueSto);
        }
        for (int j = 0; j < inList.size(); j++)
            System.out.println(inList.get(j));
    }
}