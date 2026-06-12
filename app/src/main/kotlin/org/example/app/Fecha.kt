package org.example.app

class Fecha(private val dia: Int, private val mes: Int, private val año: Int) 
{
    override fun toString(): String {
        return "$dia/$mes/$año"
    }
}