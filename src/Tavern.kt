fun main(args: Array<String>) {
    var beverage = readLine()

    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - bevarage was null!")
    }

    val bevarageServed: String = beverage ?: "Buttered Ale"
    println(bevarageServed)
}