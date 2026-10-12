package edu.cnm.deepdive.cards.model;

import org.jetbrains.annotations.NotNull;

/**
 * Encapsulates the attributes and basic operation of a standard playing card.
 *
 * @param rank One of Ace through King.
 * @param suit One of the four suits (Clubs, Diamonds, Hearts or Spades).
 */
public record Card(Rank rank, Suit suit) {

  @NotNull
  @Override
  public String toString() {
    return rank.toString() + suit.toString();
  }

  // TODO: 2026-10-09 Implement Comparable<Card> to support sorting back into shrinkwrap order.

}
