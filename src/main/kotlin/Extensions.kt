// extension function
fun  List<Int>.midElement(): Int{
    if (isEmpty())
        throw NoSuchElementException("List is empty.")
    return this[size / 2]
}

//extension properties
val List<Int>.middleItem : Int
    get() = if(size>0) this[size/2] else 0

fun main() {
    //to call this method
    var list = listOf(1, 2, 3, 4, 5)
    var mid = list.midElement()
}



