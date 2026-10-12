package edu.cnm.deepdive.cards

import edu.cnm.deepdive.cards.model.Deck
import edu.cnm.deepdive.cards.model.Rank

class GoFish {

    fun play() {
        println("Accept this final Bubble...Go Fish!")
        val deck = Deck()
        deck.shuffle()
        val playerHand = deck.deal( 7)
        val computerHand = deck.deal(7)
        println("Cards have been dealt")
        println("Human, Behold your cards and name your claim!")
        println(playerHand)
        println("Which card or cards would you like?")
        do {
            val input = readln()
            val rank = Rank.fromAbbreviation(input)
            if (rank == null) {
                println("You have chosen poorly...INVALID! Try again!")
            }
        } while (rank == null)
    }
}

fun main() {
    GoFish().play()
}