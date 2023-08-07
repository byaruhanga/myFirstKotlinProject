fun main(){


    val newArray = Array<Double>(6, { 3.0 })
    newArray[0] = 9.2
    newArray[1] = 10.1
    newArray[2] = 9.5
    newArray[3] = 10.4
    newArray[4] = 9.3
    newArray[5] = 91.4

    for (x in newArray) {
        println(x)
    }
}