fun main() {
    demoBoolean()
//   demoChar()
}

private fun demoBoolean() {
    var willExercise = false
    val bigNumber = 1_000_000
    val smallNumber = 2
    println("is big bigger = ${bigNumber > smallNumber}")
}

private fun demoChar() {
    val letter: Char = 'A'
    val tab = '\t'
    val infinity = '\u221E'

    println("letter = $letter")
    println("tab $tab over")
    println("infinity $infinity")

    val linefeed = 10.toChar()
    println("line feed = $linefeed next line")
}