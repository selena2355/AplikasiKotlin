package com.example.aplikasikotlin2

fun biodt(): Array<String>{
    val nm = "Hanifah Alya Nuraini"
    val ttl= "Ponorogo, 23 Mei 2005"
    val almt= "Sukosari, Babadan, Ponorogo"
    return arrayOf(nm,ttl,almt)
}

fun hb(): Array<String>{
    val bc = """
        Membaca
                             Ketika saya membaca novel atau komik,
                             saya merasa sedang berada di dunia itu. Otak saya memvisualisasikannya.
    """.trimIndent()
    val tls = """
        Menulis
                             Menulis membantu saya mencurahkan imajinasi saya,
                             menuliskan ide-ide yang muncul seketika.
    """.trimIndent()
    val gbr = """
        Menggambar
                             Menggambar juga membantu saya mencurahkan imajinasi saya,
                             memvisualisasikannya di atas kertas. Bukan lagi di otak.
    """.trimIndent()
    return arrayOf(bc, tls, gbr)
}

fun cetak(){
    println("=============================")
    println("------*(Biodata Saya)*-------")
    println("=============================")
    println("Nama   : ${biodt()[0]}")
    println("Usia   : ${biodt()[1]}")
    println("Alamat : ${biodt()[2]}")
    println("""
    Hobi   : ${hb()[0]}
             ${hb()[1]}
             ${hb()[2]}
    """.trimIndent())
}

fun main(){
    cetak()
}
