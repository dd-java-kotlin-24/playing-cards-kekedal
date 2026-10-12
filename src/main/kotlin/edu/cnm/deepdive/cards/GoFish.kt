package edu.cnm.deepdive.cards

import edu.cnm.deepdive.cards.model.Deck

class GoFish {

    fun play() {
        println("Accept this final Bubble...Go Fish!")
        val deck = Deck()
        deck.shuffle()
        val playerHand = deck.deal( 7)
        val computerHand = deck.deal(7)
        println("Cards have been dealt")
        println("Human, examine your hand and name your claim on my cards")
        println(playerHand)
    }
}

fun main() {
    GoFish().play()
}