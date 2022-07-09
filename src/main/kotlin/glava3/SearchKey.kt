package glava3

class SearchKey() {

    fun lookForKey(item: String){
        var items = item
      while (items == "key"){
          if (items == "box" ){
              lookForKey(items)
          } else
              items = "key"
      }
    }
}