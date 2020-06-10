enum class Suit {
    Club, Diamond, Heart, Spade
}

fun main() {
    val x = 1
    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3,4 -> println("x == 3 or 4")
    }

    val card = Suit.Spade
    val y = when(card) {
        Suit.Club, Suit.Spade -> println ("Black Card")
        Suit.Diamond, Suit.Heart -> println("Red Card")
    }

    val name = "Troy"
    val lastName = when(name) {
        "Hattan" -> "Shobokshi"
        "Todd" -> "Miller"
        "Troy" -> "Miles"
        else -> {
            "Unknown"
        }
    }
    println("$name $lastName")

    val ageType = when (x) {
        in 0..1 -> "baby"
        in 2..4 -> "toddler"
        in 5..12 -> "kid"
        in 13..19 -> "teen"
        in 20..64 -> "adult"
        else -> "senior"
    }
    println("You are a $ageType")
}