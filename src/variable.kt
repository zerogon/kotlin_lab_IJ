fun main() {
    varTest()
    valTest()
    //결론 : 선언과 동시에 초기화 할 시 메모리에 지워질때까지 그 크기에 변수로 존재
}

fun varTest() {
    var num : Int = 1
    var number = 1
    //number = "aa"  ->오류
}

fun valTest() {
    val num = 1
    val name : String = ""
}

