public class cw7
{
public static void main(String[] args)
{   
    System.out.print(findSum(2,3));
    System.out.print(canIVote(17));
    System.out.print(isPrime (3));
}   
public static double findSum (int a, int b)
{
    return a + b;
}
public static String canIVote(int age)
{
    if (age >=18)
        return ("You can vote.");
    else
        return ("You can't vote.");
}
public static String isPrime(double num)
{
    double test = 1;
    while (test < java.lang.Math.floor(java.lang.Math.sqrt(num)))
        {if (num%test == 0)
            return ("No");
         test++;}
    return ("Yes");
}
}