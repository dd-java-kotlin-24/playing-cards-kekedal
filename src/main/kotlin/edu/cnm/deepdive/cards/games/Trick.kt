package edu.cnm.deepdive.cards.games

import edu.cnm.deepdive.cards.model.Card
import edu.cnm.deepdive.cards.model.Deck
import edu.cnm.deepdive.cards.model.Suit
import java.util.Collections
import java.util.random.RandomGenerator
import kotlin.math.min

class Trick(val rng: RandomGenerator? = null) {

    private val _redPile: MutableList<Card> = mutableListOf()
    val redPile: List<Card>
        get() = Collections.unmodifiableList(_redPile)
    private val _blackPile: MutableList<Card> = mutableListOf()
    val blackPile: List<Card>
        get() = Collections.unmodifiableList(_blackPile)

    fun performMagic(deck: Deck) {
        _blackPile.clear()
        _redPile.clear()
        if (rng != null) {
            deck.shuffle(rng)
        }
        while (!deck.isEmpty) {
            val selector = deck.draw()
            val target = if (selector.suit().color() == Suit.Color.BLACK) _blackPile else _redPile
            target.add(deck.draw())
        }
        if (rng != null) {
            val swapCount = rng.nextInt(1 + min(_blackPile.size, _redPile.size))
            (1..swapCount).forEach { _ ->
                _blackPile.addLast(_redPile.removeFirst())
                _redPile.addLast(_blackPile.removeFirst())
            }
        }
    }
}