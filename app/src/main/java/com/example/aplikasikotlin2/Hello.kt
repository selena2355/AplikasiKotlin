package com.example.aplikasikotlin2

fun biodata(): Array<String> {
    val nama = "Hanifah Alya Nuraini"
    val ttl = "Ponorogo, 23 Mei 2005"
    val alamat = "Sukosari, Babadan, Ponorogo"
    return arrayOf(nama, ttl, alamat)
}

fun hobi(): List<String> {
    return listOf("Membaca", "Menulis", "Menggambar")
}

fun hobiDeskripsi(): Array<Pair<String, String>> {
    return arrayOf(
        Pair("Membaca", """
                Ketika saya membaca novel atau komik,
                saya merasa sedang berada di dunia itu. Otak saya memvisualisasikannya.
            """
        ),
        Pair("Menulis", """
                Menulis membantu saya mencurahkan imajinasi saya,
                menuliskan ide-ide yang muncul seketika.
            """
        ),
        Pair("Menggambar", """
                Menggambar juga membantu saya mencurahkan imajinasi saya,
                memvisualisasikannya di atas kertas. Bukan lagi di otak.
            """
        )
    )
}

fun cetakBiodata(biodata: Array<String>, hobi: List<String>) {
    println("==================")
    println("===Biodata Saya===")
    println("==================")
    println("Nama   : ${biodata[0]}")
    println("Usia   : ${biodata[1]}")
    println("Alamat : ${biodata[2]}")
    println("Hobi:")
    val dataHobiDeskripsi = hobiDeskripsi()
    for ((hobi, deskripsi) in dataHobiDeskripsi) {
        println("""
            ${hobi}
              ${deskripsi}
        """.trimIndent())
    }
}



fun main() {
    val dataBiodata = biodata()
    val dataHobi = hobi()
    cetakBiodata(dataBiodata, dataHobi)
}
