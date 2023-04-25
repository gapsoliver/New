fun main(args: Array<String>) {
    Multiply()
    Multiplynums(Num1 = 250, Num2 = 10)

}
fun Multiply() {
    println("Enter num1___")
    var num1 = readln()!!.toInt()
    println("Enter num2___")
    var num2 = readln()!!.toInt()
    println("Mult = num1 * num2")
    var Mult = num1 * num2
    println(Mult)
}
fun Multiplynums(Num1:Int, Num2:Int){
    var resut = Num1 * Num2
    println(resut)
}