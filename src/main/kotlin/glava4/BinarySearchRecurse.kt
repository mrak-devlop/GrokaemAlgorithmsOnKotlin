package glava4

fun main(){
    val testList = mutableListOf(2,4,6,7,12,20)
    testList.forEach {
        println(binarySearchRecurse(testList, it))
    }
        println(binarySearchRecurse(testList, 13))

}

fun binarySearchRecurse(testList: MutableList<Int>, findNumber: Int) : String {
    val highElement = testList.size-1
    val midElement = highElement / 2

    if (testList[midElement] == findNumber || testList[highElement] == findNumber) {
        return "found"
    }

    if (highElement == 1 && testList[highElement] != findNumber){
        return "NONE"
    }

    return if (testList[midElement] < findNumber) {
        val tempList = mutableListOf<Int>()
        for (index in midElement..highElement) {
            tempList.add(testList[index])

        }
        binarySearchRecurse(tempList, findNumber)
    } else {
        val tempList = mutableListOf<Int>()
        for (index in 0..midElement) {
            tempList.add(testList[index])
        }
        binarySearchRecurse(tempList, findNumber)
    }


}