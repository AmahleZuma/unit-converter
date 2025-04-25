fun main() {
    // Making it easy to chang e the text if necessary
    val message = "Welcome to your Unit Converter"
    val ruleHeading = "Choose Conversion type:"
    val rule1 = "1. Meters -> feet"
    val rule2 = "2. Kg -> pounds"
    val rule3 = "3 °C -> °F"
    val unitHeading = "Input the number you wish to convert: "
    println(message)
    println(ruleHeading)
    println(rule1)
    println(rule2)
    println(rule3)
    println()

    // Taking in user input
    val choice = readln()

    // User Input being checked + actual app logic
    if (choice == "1") {
        println(unitHeading)
        val conversion = readln()
        // used toFloatOrNull and ended up on a wikipedia page about the Billion dollar mistake
        val finalAnswer = conversion.toFloat() * 3.28084
        println("$conversion meters -> $finalAnswer feet")
    } else if (choice == "2") {
        println(unitHeading)
        val conversion = readln()
        val finalAnswer = conversion.toFloat() * 2.20462262185
        println("$conversion Kg -> $finalAnswer pounds")
    } else if (choice == "3") {
        println(unitHeading)
        val conversion = readln()
        val finalAnswer = (conversion.toFloat() * 1.8) + 32
        println("$conversion °C -> $finalAnswer °F")
    } else {
        println("Nahhh bro this ain't gon' work")
    }
}