package ps0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class MyHand {
    static LinkedList<Card> hand;

    MyHand() {
	hand = new LinkedList<Card>();

	hand.add(new Card(CardValue.EIGHT, CardSuit.CLUBS));
	hand.add(new Card(CardValue.TWO, CardSuit.CLUBS));
	hand.add(new Card(CardValue.QUEEN, CardSuit.CLUBS));
	hand.add(new Card(CardValue.NINE, CardSuit.SPADES));
	hand.add(new Card(CardValue.KING, CardSuit.HEARTS));
	hand.add(new Card(CardValue.QUEEN, CardSuit.HEARTS));
	hand.add(new Card(CardValue.SEVEN, CardSuit.HEARTS));
    }

    public static void main(String[] args) {
	MyHand myhand = new MyHand();
	myhand.printHand(hand);
	myhand.sortSmallestToLargest();
	System.out.println("\nAfter sorting from smallest to largest:");
	myhand.printHand(hand);
	myhand.sortLargesttoSmallest();
	System.out.println("\nAfter sorting from largest to smallest:");
	myhand.printHand(hand);
	System.out.println("\nHearts in hand:");
	myhand.printHand_OnlyHearts(hand);
	System.out.println("\nHand after removing faces:");
	myhand.printHand_RemoveFaceCards(hand);
    }

    /**
     * Print the contents of a hand of cards to the screen. [Note:
     * one can also System.out.println to print the contents of
     * arrays]
     */
    public void printHand(Collection<Card> hand) {
    	System.out.println(hand);;
    }

    /**
     * Sorts the cards so that any subsequent calls to printHand
     * will print the Hand from the smallest to the largest.
     */
    public void sortSmallestToLargest() {
    	hand.sort((card1, card2) -> card1.compareTo(card2));	
    }

    /**
     * Sorts the cards so that any subsequent calls to printHand
     * will print the Hand from the largest to the smallest.
     */
    public void sortLargesttoSmallest() {
    	hand.sort((card1, card2) -> (-1)*card1.compareTo(card2));
    }

    /**
     * Print only the cards in hand that are hearts
     */
    public void printHand_OnlyHearts(Collection<Card> hand) {
    	System.out.println(hand.stream().
    			filter(c -> c.getSuit() == CardSuit.HEARTS).
    			collect(Collectors.toList()));
    }

    /**
     * Print only the cards in hand that are number cards AND remove face cards
     * from hand
     */
    public void printHand_RemoveFaceCards(Collection<Card> hand) {
    	hand = hand.stream().
    			filter(c -> c.getValue().ordinal() <= 8).
    			collect(Collectors.toList());
    	System.out.println(hand);
    }
}

