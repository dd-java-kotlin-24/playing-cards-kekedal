@file:Suppress("ReplaceJavaStaticMethodWithKotlinAnalog")

package edu.cnm.deepdive.cards.model

import java.util.Collections
import java.util.random.RandomGenerator

class Deck {

    private val cards: MutableList<Card>

    val isEmpty: Boolean
        get() = cards.isEmpty()

    init{
        cards = mutableListOf()
        for (suit in Suit.entries) {
            for (rank in Rank.entries) {
                cards.add(Card(rank, suit))
            }
        }
    }

    fun shuffle(rng: RandomGenerator? = null) {
        Collections.shuffle(cards, rng)
    }

    fun deal(number: Int) : Hand {
        val taken = cards.take(number)
        cards.removeAll(taken)
        return Hand(taken.toMutableList())
    }

    fun draw(): Card {
        return cards.removeFirst()
    }


}