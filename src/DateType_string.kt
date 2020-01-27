
fun main() {
    val stringValue = "hello"
    println("$stringValue kotlin")

    println("따옴표안에 $stringValue ${test()}")
}

fun test(): String {
    return "kotlin"
}