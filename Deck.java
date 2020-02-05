import java.util.*;
public class Deck
{
    private ArrayList<Card> deck;
    public Deck()
    {
        deck = newArrayList<Card>();
        for (int i = 1; i < 4; i++)
        {
            for (int j = 1; j < 14; j++)
                {
                    deck.add(j, i);
                }
        }
    }
    public void shuffle()
    {
        int randomIndex = (int)(Math.random()*deck.size());
        deck.add(0, deck.remove(randomIndex));
        
    }
    public String toString()
    {
        String deckDescription = "";
        for (int i = 0; i < deck.size(); i++)
           {Card currentCard = deck.get(i);
            deckDescription += currentCard.toString() + "\n";}
        return deckDescription;
    }
}
