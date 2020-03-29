package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var total = 0
        var correct = 0
        for(i in 0 until bill.size) {
            if(i != k) {
                correct += bill[i]
            }
            total += bill[i]
        }
        if(correct/2 == b) return "Bon Appetit"
        else return (b - correct / 2).toString()
    }
}
