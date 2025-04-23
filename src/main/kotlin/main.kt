fun main() {
    // Making it easy to chang e the text if necessary
    val message = "Welcome to your Unit Converter"
    val ruleHeading = "Choose Conversion type:"
    val rule1 = "1. Meters -> feet"
    val rule2 = "2. Kg -> pounds"
    val rule3 = "3 °C -> °F"
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
        // Do something...I'm too tired
    } else if (choice == "2") {
        // Do something I'm too tired
    } else if (choice == "3") {
        // Just do something
    } else {
        // Effing....do...something...don't expect me to do it for you
    }
}