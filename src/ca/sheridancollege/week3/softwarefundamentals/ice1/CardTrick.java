/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Jorawar - 991645645
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Random rn = new Random();
            int number = rn.nextInt(13) + 1;
            Card c = new Card();
            c.setValue(number);
            int newNumber = rn.nextInt(4);
            c.setSuit(Card.SUITS[newNumber]);
            magicHand[i] = c;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Hearts");
        boolean cardFound = false;
        for(int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit)) {
                System.out.println("Card found!");
                System.out.println("Card Suit: "+ magicHand[i].getSuit());
                System.out.println("Card Value: "+ magicHand[i].getValue());
                cardFound = true;
            }
        }
        if(!cardFound) {
            System.out.println("Card not found!");
        }
    }
}
