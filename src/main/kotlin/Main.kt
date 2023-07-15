import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    val input1 = scanner.nextLine().toInt()
    val input2 = scanner.nextLine().toInt()
    val input3 = scanner.nextLine().toInt()
    val age = (input1 * 70 + input2 * 21 + input3 * 15) % 105


    println("Your age is $age; that's a good time to start programming!")
    val number1 = readln().toInt()
    if (number1 > 1){
        println("True")
    } else{
        println("false")
    }

    
}