package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val finalListStrings = mutableListOf<String>()
        val listOpenKeys = listOf('(','[','<')
        val listCloseKeys = listOf(')',']','>')
        val listOpenSymbolIndexes  = mutableListOf<Int>()
        val listCloseSymbolIndexes = mutableListOf<Int>()
        var i = 0
        while (i < inputString.length){
            var indexFromList = 0
            if (listOpenKeys.contains(inputString[i])){
                indexFromList = listOpenKeys.indexOf(inputString[i])
                listOpenSymbolIndexes.add(i+1)
                var countMissing = 0
                for (j in i+1 until inputString.length){
                    if(inputString[j] === listOpenKeys[indexFromList]) countMissing++
                    if (inputString[j] === listCloseKeys[indexFromList]){
                        if (countMissing === 0){
                            listCloseSymbolIndexes.add(j)
                            break
                        }else {
                            countMissing--
                        }
                    }
                }
            }
            i++
        }
        for (i in listOpenSymbolIndexes.indices){
            finalListStrings.add(inputString.substring(listOpenSymbolIndexes[i],listCloseSymbolIndexes[i]))
        }
        return finalListStrings.toTypedArray()
    }
}
