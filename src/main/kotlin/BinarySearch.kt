class BinarySearch(private val list: Array<Int>, private val item: Int) {
    fun execute(): String {
        var lowElement = 0
        var highElement = list.size
        while (lowElement <= highElement) {

            val midElement = (lowElement + highElement) / 2
            val guessElement = list[midElement]

            if (guessElement == item) {
                return midElement.toString()
            }

            if (guessElement > item) {
                highElement = midElement - 1
            } else {
                lowElement = midElement + 1
            }
        }
        return "None"
    }
}