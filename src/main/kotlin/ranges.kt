fun main() {

    //ranges
    //number range (1-5)
    println("========== number range=====================")
    val numsRange = 1..5
    for (n in numsRange)
        print("$n - ")
    println(" ")
    //chars range(a-z)
    println("============ chars range ===================")
    val atozRange = 'a'..'z'
    for ( c in atozRange)
        print("$c,")
    println(" ")
    //rangeTo() is same like operator ..
    println("==========rangeTo()=====================")
    val oneToFive = 1.rangeTo(5)
    for (n in oneToFive)
        println("number $n")

    //downTo()
    println("==========downTo =====================")
    val fiveToOne = 5 downTo 1
    for (n in fiveToOne)
        println("downto $n")

    //step function
    println("==========step =====================")
   val oneToTen = 1..10 step 4
    for (n in oneToTen)
        println("step $n")
}