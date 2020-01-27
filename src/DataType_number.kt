fun main() {
    /*
    * 크기가 큰 순
    * Double
    * Float
    * Long
    * Int
    * Short
    * Byte
    *
    * */
    var intValue : Int = 5
    var doubleValue : Double = 10.111
    //결론 : 숫자는 Int , 소수점은 Double

    intValue = doubleValue.toInt()
    doubleValue = intValue.toDouble()
    println(intValue)
    println(doubleValue)



}