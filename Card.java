public class Card
{
 
    private int num;
    private int suit;
    
    public Card(int nu, int su)
    {
        num = nu;
        suit = su;
    }
    public void setCard(int newNum)
    {
        num = newNum;
    }
    public void setSuit(int newSuit)
    {
        suit = newSuit;
    }
    public int getSuit()
    {
        return suit;
    }
    public int getNum()
    {
        return num;
    }
    public String toString()
    {
        String s = "";
        String n = "";
        if (suit == 1)
            s = "Clubs";
        if (suit == 2)
            s = "Hearts";
        if (suit == 3)
            s = "Diamonds";
        if (suit == 4)
            s = "Spades";
        if (num > 10 || num == 1)
           {if (num == 11)
                n = "Jack";
            if (num == 12)
                n = "Queen";
            if (num == 13)
                n = "King";
            if (num == 14 || num == 1)
                n = "Ace";}
        else
            n = String.valueOf(num);
        return n + " of " + s;
    }
    public boolean sameSuit(Card c)
    {
        return this.suit == c.getSuit();
    }
    public boolean sameNum(Card c)
    {
        return this.num == c.getNum();
    }
}
