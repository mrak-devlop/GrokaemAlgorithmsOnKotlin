package glava4

fun main(){
    val arr = arrayOf(2,4,6)
    val length = arr.size-1
    print(sum(arr,length))
}


    fun sum(array: Array<Int>, length: Int): Int {
        if (length < 0){
            return 0
        } else {
            val lists = array
            return array[length] + sum(lists, length - 1)
        }

    }


