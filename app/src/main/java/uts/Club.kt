package uts

// data class Club
data class Club(
    val name: String,
    val lpi: Int,
    val fa: Int,
    val efl: Int,
    val lce: Int,
    val leUefa: Int
) {
    val totalTrophy: Int
        get() = lpi+fa+efl+lce+leUefa
}

// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $lpi trofi Liga Primer Inggris, "+
            "$fa trofi FA, "+
            "\n$efl trofi EFL, "+
            "$lce trofi Liga Champion, dan "+
            "$leUefa trofi Liga Eropa UEFA"+
            "\n-------------------------------------------------------------"
}