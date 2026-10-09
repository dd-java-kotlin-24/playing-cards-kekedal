package edu.cnm.deepdive.cards.model;

/**
 * Encapsulates the attributes and basic operation of a standard playing card.
 *
 * @param rank One of Ace through King.
 * @param suit One of the four suits (Clubs, Diamonds, Hearts or Spades).
 */
public record Card(Rank rank, Suit suit) {

  // TODO: 2026-10-09 Implement Comparable<Card> to support sorting back into shrinkwrap order.

}
