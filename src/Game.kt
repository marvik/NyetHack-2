import kotlin.math.min
import kotlin.math.max

fun main(args: Array<String>) {
    val name = "Madrigal"
    val healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Player status
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    val inebriation = castFireball()
    when(inebriation) {
        in 1..10 -> println("tipsy")
        in 11..20 -> println("sloshed")
        in 21..30 -> println("soused")
        in 31..40 -> println("stewed")
        in 41..50 -> println("..t0aSt3d")
    }
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickley!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

private fun castFireball(numFireballs: Int = 2): Int {
    println("A glass of Fireball springs into existence. (x$numFireballs)")
    return max(min(numFireballs, 50), 1)
}