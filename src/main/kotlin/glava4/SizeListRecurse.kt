package glava4

fun main(){
    val testList = mutableListOf(2,4,6)
    println(sizeListRecurse(testList))

}

fun sizeListRecurse(list: MutableList<Int>): Int{
    if (list.isEmpty()){
        return 0
    }else{
        list.removeAt(0)
        return 1 + sizeListRecurse(list)
    }

}