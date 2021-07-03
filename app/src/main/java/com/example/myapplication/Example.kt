package com.example.myapplication

const val PI = 3.14

class Calculator() {

    fun plus(first: Int, second: Int): Int {
        return first + second
    }

    fun div(first: Double, second: Double): Double {
        return if (second != 0.0) {
            first.div(second)

        } else if (first > 0) {
            Double.POSITIVE_INFINITY
        } else {
            Double.NEGATIVE_INFINITY
        }
    }
    fun bar(){
        val viewType = 0
    }
}

fun oleoleole(){
    val arrayList = listOf("foo", "bar", "oleoleole").toMutableList()
    arrayList.add("gogogo")

    arrayList.forEach{
        print(it)
    }
    for (string in arrayList){
        print(string)
    }
}


class AnotherExample {

}

fun foo() {

}
