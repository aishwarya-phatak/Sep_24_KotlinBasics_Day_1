//Arrays

fun basics2(){
    //lambda expressions
   var marks = Array<Int>(5) { index -> index + 10 }
    for (m in marks){
        println("m is $m")
    }

    var arr = DoubleArray(5){index -> index + 10.0}
    for (a in arr){
        println("a is -- $a")
    }

    //ranges
    var a = 1..10
}

fun basics3(){
    var n1 : Int = 100
    var n2 : Int = 20
    var max : Int = if(n1 > n2){
            n1
//        n1 + 10
    } else {
        n2
    }

    println("max is : $max")
}

fun main(){
    basics3()
    basics2()
}