package edu.cnm.deepdive.cards

import edu.cnm.deepdive.cards.games.Trick
import edu.cnm.deepdive.cards.model.Card
import edu.cnm.deepdive.cards.model.Deck
import edu.cnm.deepdive.cards.model.Suit
import java.util.random.RandomGenerator

fun main(args: Array<String>) {
    val deck = Deck()
    val rng = RandomGenerator.getDefault()
    val trick = Trick(rng)
    trick.performMagic(deck)
    println(trick.blackPile.sortedWith(blackFirstComparator))
    println(trick.redPile.sortedWith(redFirstComparator))

}

private val colorComparator: Comparator<Card> =
    Comparator.comparing(Card::suit, Comparator.comparing(Suit::color))

private val blackFirstComparator =
    colorComparator.thenComparing(Comparator.naturalOrder())

private val redFirstComparator =
    colorComparator.reversed().thenComparing(Comparator.naturalOrder())