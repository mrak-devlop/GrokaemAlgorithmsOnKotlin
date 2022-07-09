class SelectionSort(private val array: Array<Int>) {

    fun execute(): Array<Int> {
        val buferArray = array.toMutableList()
        val completeArray = mutableListOf<Int>()

        for (index in array){
            val minElement = buferArray.min()
            completeArray.add(minElement)
            buferArray.remove(minElement)
        }

        return completeArray.toTypedArray()
    }
}