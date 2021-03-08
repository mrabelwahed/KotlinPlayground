package play

fun main() {
    //collections in kotlin is a layer(Kotlin Std) on the top of Java collections
    //the only difference is you have mutable and immutable data structures

    // immutable list
    println("=================List===============")
    // numbers list
    val numList = listOf(1,2,3,4)
    for (n in numList)
        println(n);
    // string list
    val strList = listOf("hanna","Ramadan","Reem")
    for (str in strList)
        println(str)
    println(strList.size)
    println(strList.contains("Reem"))
    println(strList.indexOf("Reem"))
    //mixed list
    val mixed = listOf(1,"ramadan",90.0)
    for (m in mixed)
        println(m)

    // list of not null
    val listOfNotNull = listOfNotNull(1,2,null,7,null)
    for (n in listOfNotNull)
        println("$n")
    // immutable empty list
    val emptyList = emptyList<Int>()

}