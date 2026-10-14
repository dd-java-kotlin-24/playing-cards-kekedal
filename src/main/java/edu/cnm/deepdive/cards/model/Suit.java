package edu.cnm.deepdive.cards.model;

/**
 * Encapsulates the four standard suits of a French-suited deck of playing cards.
 */
public enum Suit {
  CLUBS("♣", Color.BLACK),// public static final Suit clubs = new suit
  DIAMONDS("♢", Color.RED),
  HEARTS("♡", Color.RED),
  SPADES("♠",Color.BLACK);

  private final String abbreviation;

  private final Color color;


  Suit(String abbreviation, Color color) {
    this.abbreviation = abbreviation;
    this.color = color;
  }

  @Override
  public String toString() {
    return abbreviation;
  }

  public Color color() {
    return color;
  }

  public String abbreviation() {
    return abbreviation;
  }

  public enum Color {
    BLACK, RED
  }

}

