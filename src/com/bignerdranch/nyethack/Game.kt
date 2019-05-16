package com.bignerdranch.nyethack

fun main(args: Array<String>) {
    Game.play()
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: ${player.auraColor()}) (Blessed: ${if (player.isBlessed) "YES" else "NO"})")
    println("${player.name} ${player.formatHealthStatus()}")
}

object Game {
    private val player = Player("Madrigal")
    private var currentRoom: Room = TownSquare()

    init {
        println("Welcome, adventure.")
        player.castFireball()
    }

    fun play() {
        while (true) {
            println(currentRoom.description())
            println(currentRoom.load())

            // Player status
            printPlayerStatus(player)
        }
    }

    private fun printPlayerStatus(player: Player) {
        println("(Aura: ${player.auraColor()})" +
                "(Bressed: ${if (player.isBlessed) "YES" else "NO"})")
        println("${player.name} ${player.formatHealthStatus()}")
    }
}