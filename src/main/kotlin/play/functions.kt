package play

import checkUserStatus
import toUpper
import kotlin.math.pow

fun main() {
    //example: top level function
    if (checkUserStatus() == "online")
        println("user status : Online")
    else
        println(" user status : offline")

    //example2 : lambda expression
    //reduce the boilerplate code
    // it is a block for instructions
    val message = { myString: String -> println(myString) }
    val addNumbers = { num1: Int, num2: Int -> println(num1 + num2) }
    message("I like kotlin")
    message("Java is a good one")
    addNumbers(1, 2)
    addNumbers(4, 5)

    //example3: high order functions
    //function takes lambda as input
    val strList = listOf("in", "the", "club")
    println(strList.last())
    println(strList.last { it.length == 3 })

    // return  will happen from containing function
    // if you want to print "end of function statement" add @forEach label statement
    surroundingFun()

    //example4: member function
    val circle = Circle()
    println(circle.calcArea(3.4))

    //example5: local function
    localfun()

    //example6: infix function
    val pair = 1 to "Ramadan"
    val data = mapOf(1 to "Ramadan", 2 to "Ali", 3 to "Omar")

    //example7: extension function
    // extend the functionality of a class without inherit it
    //it is kind of top level function
    //you can not override the member functions with extension function
    // and if you did the compiler will choose the member function
    // you can also define extension function inside the class
    println("output is".toUpper())
    println("ramadan".toUpper())
    //========== scoping functions ====================//
    // scoping functions are functions execute block of code on object
    //the play.main difference is how this object will be available inside this block
    // and the result of whole expression
    // let , Run, with ,apply,also

    //let
    Person("ramadan", 12, "cairo").let {
        println(it)
        it.moveTo("london")
        println(it)
    }
    //use let with chain call
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.map {
        it.length
    }.filter {
        it > 3
    }.let {
        println(it)
    }

    //run is similar to let but it uses this instead of this
    //use it to initialize object and thern return it
    Person("hash", 12, "awish").run {
         println("det person ${this.name}")
    }

    //with
    //similar to run uses this also but run has easy manipulation for null check than
    // with
   val person = with(Person("jack", 23, "austria")){
       return@with "name is $name"
   }
    println(person)

    var newPerson: Person? =  null
    with(newPerson){
        this?.name = "uuu"
        this?.age = 30
        this?.city = "mexico"
    }

    newPerson?.run {
        name = "uuu"
        age = 30
        city = "mexico"

    }

    //apply is similar to run when using this instead of it and for null check
     // apply does not accept return statement


    //also is similar to let for referring to context with it instead of this

}

data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(city: String) {
        this.city = city
    }

    fun incrementAge() {
        this.age++
    }

}


infix fun <A, B> A.to(that: B) = Pair(this, that)

fun localfun() {
    fun add(x: Int, y: Int) = x + y
    println("result is :${add(3, 3)}")
}

class Circle {
    fun calcArea(radius: Double): Double {
        // check if the value is greater than 0 otherwise it throws exception
        require(radius > 0) { "Radius must be greater than 0" }
        return Math.PI * radius.pow(2.0)
    }
}

fun surroundingFun() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    numbers.forEach {
        if (it % 2 == 0) return@forEach
    }
    println("end of the function")
}