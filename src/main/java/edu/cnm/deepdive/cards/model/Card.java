package edu.cnm.deepdive.cards.model;

import java.util.Comparator;
import org.jspecify.annotations.NonNull;


/**
 * Encapsulates the attributes and basic operation of a standard playing card.
 *
 * @param rank One of Ace through King.
 * @param suit One of the four suits (Clubs, Diamonds, Hearts or Spades).
 */
public record Card(Rank rank, Suit suit) implements Comparable<Card> {

  private static final Comparator<Card> SHRINK_WRAP_COMPARATOR =
      Comparator.comparing(Card::suit)
          .thenComparing(Card::rank);

  @Override
  public @NonNull String toString() {

    return "%s %s".formatted(rank(), suit());
  }

  @Override
  public int compareTo(@NonNull Card otherCard) {
    return SHRINK_WRAP_COMPARATOR.compare(this, otherCard);
  }


  static class CardValueGroupsComparator implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
      if (card1.rank == card2.rank) {
        return card1.suit.compareTo(card2.suit);
      } else {
        return card1.rank.compareTo(card2.rank);
      }
    }
  }
}
