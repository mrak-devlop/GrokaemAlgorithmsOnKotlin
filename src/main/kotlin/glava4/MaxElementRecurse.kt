package glava4

fun main(){
    val testList = mutableListOf(2,7,6,4)
    println(maxElement(testList))
}

fun maxElement(list: MutableList<Int>):Int{
    if (list.size == 1) {
        return list[0]
    }
    return if (list[0] > list[1]) {
        list.removeAt(1)
        maxElement(list)
    } else {
        list.removeAt(0)
        maxElement(list)
    }

}