import java.util.*

fun main() {
//
//    val scanner = Scanner(System.`in`)
//
//    println("Hello! My name is Aid.")
//    println("I was created in 2020.")
//    println("Please, remind me your name.")
//
//    val name = scanner.nextLine()
//
//    println("What a great name you have, $name!")
//    println("Let me guess your age.")
//    println("Enter remainders of dividing your age by 3, 5 and 7.")
//
//    // reading all remainders
//    val input1 = scanner.nextLine().toInt()
//    val input2 = scanner.nextLine().toInt()
//    val input3 = scanner.nextLine().toInt()
//    val age = (input1 * 70 + input2 * 21 + input3 * 15) % 105
//
//
//    println("Your age is $age; that's a good time to start programming!")
//    val number1 = readln().toInt()
//    if (number1 > 1){
//        println("True")
//    } else{
//        println("false")
//    }
//    val a = readln().toInt()
//    val b = readln().toInt()
//    val h = readln().toInt()
//
//    if (a <= b && h < a){
//        println("Deficiency")
//    }else if (a <= b && h > b){
//        println("Excess")
//    }else {
//        println("Normal")
//    }

//   Size of parts
//    val n1 = readln().toInt()
//
//    if (n1 > -15 && n1 <= 12){
//        println("True")
//    }else if (n1 > 14 && n1 < 17){
//        println("True")
//    }else if(n1 >=19){
//        println("True")
//    }else{
//        println("False")
//    }
//    val n = readln().toInt()
//
//    repeat(n){
//        print(n)
//    }
//    val on = readln().toInt()
//    var large = 0
//    var small = 0
//    var perfect = 0
//
//    repeat(on){
//        val ln = readln().toInt()
//        if (ln == 1){
//            large++
//        }else if( ln == -1){
//            small++
//        }else if(ln == 0){
//            perfect++
//        }
//
//    }
//    print("$perfect $large $small")
    //Maximum element divisible by 4
//    val i1 = readln().toInt()
//    var eq = 0
//
//    repeat(i1){
//        val d1 = readln().toInt()
//        if (d1 % 4 == 0 && d1 > eq){
//           eq = d1
//        }
//    }
//    print(eq)
// Ranges
//    val age = readln().toInt()
//
//    if (age in 18..59){
//        println("true")
//    }else {
//        println("false")
//    }
//    val time = readln().toInt()
//    val workTime = 9..18
//    val lunchTime = 13..14
//    // do not change the code above
//    // put your code here
//    if (time in workTime && time !in lunchTime){
//        println("true")
//    }else {
//        println("false")
//    }
    // For loop and ranges
//    val a = readln().toInt()
//    val b = readln().toInt()
//    var sum = 0
//
//    for (i in a .. b){
//        sum += i
//    }
//    println(sum)

//    val a = readln().toInt()
//    val b = readln().toInt()
//    val c = readln().toInt()
//    val d = readln().toInt()
//
//    var x = 0..1000
//    for (i in x){
//
//        if (a * (i * i *i) + b *(i * i) + c * (i) + d == 0){
//            println(i)
//        }
//    }
//
    //fizz buzz
//    val n1 = readln().toInt()
//    val n2 = readln().toInt()
//    val n = n1 .. n2
//
//    for (i in n){
//        if (i % 3 == 0 && i % 5 == 0) {
//            println("FizzBuzz")
//        } else if (i % 3 == 0) {
//            println("Fizz")
//        } else if (i % 5 == 0) {
//            println("Buzz")
//        } else {
//            println(i)
//        }
//    }

    //The sum of N numbers
//    val rep = readln().toInt()
//    var result = 0
//
//    repeat(rep) {
//        val n1 = readln().toInt()
//        result += n1
//    }
//    println(result)

    //Check the order
//    var value = "YES"
//    var min = Int.MIN_VALUE
//    val n = readln().toInt()
//    for (i in 1..n){
//        val sc = readln().toInt()
//        if (min > sc){
//            value = "NO"
//            break
//        }
//        min = sc
//    }
//    println(value)

}

