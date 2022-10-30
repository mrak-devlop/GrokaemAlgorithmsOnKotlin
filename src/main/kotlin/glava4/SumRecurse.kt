package glava4

fun main(){
    val arr = mutableListOf(2,4,6)
    print(sum(arr))
}

fun sum(array: MutableList<Int>, ): Int {
    if (array.isEmpty()){
        return 0
    } else {
        val number = array[0]
        array.removeAt(0)
        return number + sum(array)
    }

}


