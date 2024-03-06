package com.example.aplikasikotlin2

class Bike(var wheelCount:Int=0, var color:String="", var height:Int=0){

    fun wheelsUpdate(newWheels:Int){
        this.wheelCount=newWheels
    }
    fun heigtUpdate(newHeigth:Int){
        this.height=newHeigth
    }
}

fun main(){
    val bike1 = Bike(wheelCount = 4, color ="merah", height = 50)
    println("""
        adikku mempunyai sepeda, warnanya ${bike1.color}. Saat masih kecil ayah membuat sepeda itu beroda ${bike1.wheelCount},
        dan menyetel tingginya ${bike1.height}cm.
        Saat sudah beranjak besar, ayah melepas kedua roda sepeda adikku dan mengatur ulang ketinggian sepeda.
    """.trimIndent())
    bike1.wheelsUpdate(2)
    bike1.heigtUpdate(75)
    println("""
        Sekarang, sepeda adikku hanya mempunyai ${bike1.wheelCount} roda dan tingginya ${bike1.height}cm.
    """.trimIndent())
}