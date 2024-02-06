package academy.learnprogramming.challenge

fun main(args: Array<String>) {

    // Data types
    val double = -3847.348
    val float1: Float? = -3847.348f
    val float2: Float? = (-3847.348).toFloat()
    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)
    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }

    // Calling sad Java class method
    Challenge().doStuff(charArrayOf('a', 'b', 'c'))

    val x: String? = "I AM IN UPPERCASE"

    printLowerCase(x)
    printLowerCase(null)

    x?.let { println(it.lowercase().replace("am", "am not")) }

    // forcing null excepiton
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}

fun printLowerCase(str: String?) {
    val y = str?.lowercase() ?: "I give up! : * ((( "
    println(y)
}