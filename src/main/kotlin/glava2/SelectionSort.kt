package glava2

class SelectionSort(private val array: Array<Int>) {

    fun execute(): Array<Int> {
        val bufferArray = array.toMutableList()
        val completeArray = mutableListOf<Int>()

        for (index in array){
            val minElement = bufferArray.min()
            completeArray.add(minElement)
            bufferArray.remove(minElement)
        }

        return completeArray.toTypedArray()
    }
}