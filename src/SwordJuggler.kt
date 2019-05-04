import java.lang.Exception
import java.lang.IllegalStateException

fun main(args: Array<String>) {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordsJuggling = 2
    }

    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e: UnskilledSwordJugglerException) {
        println(e)
    }

    println("You juggle $swordsJuggling swords!")
}

fun proficiencyCheck(swordsJuggling: Int?) {
    checkNotNull(swordsJuggling) { "`Player.kt` cannot juggle swords" }
}

class UnskilledSwordJugglerException():
    IllegalStateException("`Player.kt` cannot juggle swords")