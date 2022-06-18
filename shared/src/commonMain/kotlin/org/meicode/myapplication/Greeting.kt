package org.meicode.myapplication

class Greeting {
    fun greeting(): String {
        return "Guess what it is!, > ${Platform().platform.reversed()}!"
    }
}