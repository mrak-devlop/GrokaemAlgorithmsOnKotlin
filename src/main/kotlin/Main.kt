import glava1.BinarySearch
import glava2.SelectionSort

fun main(args: Array<String>) {
// Бинарный поиск
    val myList = arrayOf(1, 3, 5, 7, 9)
    val binarySearch = BinarySearch(myList, 9).execute()
    println(binarySearch)


// Сортировка выбором
    val sortArray = SelectionSort(array = arrayOf(5, 3, 6, 2, 10)).execute()
    sortArray.forEach {
        print(it)
        print(" ")
    }

}