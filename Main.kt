fun addition(){
    var n1 : Int = 10
    n1 = 225
    var n2 : Int = 24
    println("addition of two numbers -- " + (n1 + n2))
}

//returning from a function in kotlin
fun add(a : Int, b : Int):Int{
    return a + b
}

fun basics1(){
    var j = 100
    val k = 100
    j++
//    k++           //val is immutable
    println("j = $j")
}

fun addSingleLine(num1 : Int, num2 : Int) : Int = num1 + num2

fun multiply(n : Int, m : Int) = n * m

fun main(){

    var array = arrayOf(1,2,3,56,33,78,90,23)
    for (eachElement in array){
        println("Element is -- $eachElement")
    }

    var n = 190.toLong()

    var number : Float = 19.toFloat()

    println("number is $number    number + 1 is ${number + 12}")

    var r = multiply(12, 10)
    println("r is $r")
    var result1 = addSingleLine(15,15)
    println("Result is : $result1")

    basics1()
    println("Hello Kotlin!")
    addition()
    var result = add(10,10)
    println("Result is -- $result")
}