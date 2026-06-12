package org.example.app

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
        fun fecha(){
            val hoy = Fecha(29, 5, 2026)
            println(hoy)
        }
}