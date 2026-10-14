package edu.cnm.deepdive.cards.games

import edu.cnm.deepdive.cards.model.Card
import edu.cnm.deepdive.cards.model.Deck
import java.util.random.RandomGenerator

class Trick(val rng: RandomGenerator? = null) {

    val redPile:MutableList<Card> = mutableListOf()
    val blackPile:MutableList<Card> = mutableListOf()

    fun performMagic(deck: Deck) {
        blackPile.clear()
        redPile.clear()
        if (rng != null) {
            deck.shuffle(rng)
        }
        while (!deck.isEmpty) {
            val selector = deck.draw()
            val = deck.draw()
        }
        // TODO: If rng is not null, shuffle.
        // TODO: While cards remain in deck:
        //   1. Draw a selector card.
        //   2. If selector is black:
        //        -Draw next card and add it to black pile.
        //     Otherwise:
        //        -Draw next card and add it to red pile.
        // TODO: If rng is not null, swap an equal random number
        //  (between 0 and the size of the smaller of the two piles,
        //  inclusive) of cards between the black and red piles.



    }

}