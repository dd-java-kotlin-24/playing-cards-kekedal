package edu.cnm.deepdive.cards

import edu.cnm.deepdive.cards.games.Trick
import edu.cnm.deepdive.cards.model.Deck
import java.util.random.RandomGenerator

fun main(args: Array<String>) {
    val deck = Deck()
    val rng = RandomGenerator.getDefault()
    val trick = Trick(rng)
    trick.performMagic(deck)
    println(trick.blackPile)
    println(trick.redPile)

}
