package uts

fun main() {
    // Inisialisasi mutableList dan tambah data List
    val clubs = mutableListOf<Club>()
    clubs.add(Club("Liverpool", 19,8, 9, 6, 3))
    clubs.add(Club("Manchester United", 20,12, 6, 3, 1))
    clubs.add(Club("Chelsea", 6,6, 5, 2, 2))
    clubs.add(Club("Manchester City", 8,8, 8, 0, 0))
    clubs.add(Club("Arsenal", 13,14, 2, 0, 0))

    // Passing a named function ::sortByNumberTrophyTotal
    val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
    // Hasil sorting total trofi
    println("======================================================================")
    println("              Urutan klub berdasarkan jumlah total trofi")
    println("======================================================================")
    for (club in sortedClubs) {
        println("${club.name} : ${club.totalTrophy} trofi")
    }

    // Passing a named function ::filterByEuropeanTrophy
    val filteredClubs = filterAndSort(clubs, ::filterByEuropeanTrophy)
    // Hasil sorting total trofi
    println("\n======================================================================")
    println("           Klub yang belum pernah memenangkan UCL dan UEL")
    println("======================================================================")

    for (club in filteredClubs) {
        println(club.name)
    }

    // Panggil extension function Club recap
    println("\n======================================================================")
    println("                            Rekap Trofi ")
    println("======================================================================")
    for(club in clubs){
        println(club.recap())
    }
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    return clubs.sortedByDescending { it.totalTrophy }
}

// Fungsi filter
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    return clubs.filter {it.lce==0 && it.leUefa==0}
}