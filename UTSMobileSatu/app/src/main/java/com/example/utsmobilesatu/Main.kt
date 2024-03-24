package com.example.utsmobilesatu


// Fungsi main
fun main() { //Main Function No. 4a
    //soal No.2
    val clubs = mutableListOf(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 6, 3, 1),
        Club("Chelsea", 6, 6, 5, 2, 2),
        Club("Manchester City", 8, 8, 8, 0, 0),
        Club("Arsenal", 13, 14, 2, 0, 0)
    )

    //Soal No.3
    println("* Total Trofi untuk data class No.2 (Manchester United) = ${clubs[1].totalTrophy} trofi")

    //Soal No.4b
    val highTrophyClubs = higherOrderFunction(clubs) { clubs ->
        val filteredClubs = clubs.filter { it.totalTrophy < 25 }
        println("* Klub dengan total trofi kurang dari 25:")
        for (club in filteredClubs) {
            println(club.name)
        }
        filteredClubs // Mengembalikan nilai dari filter agar bisa di run
    }

    //soal No.4c
    val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
    println("* Urutan klub berdasarkan jumlah total trofi: ")
    for (club in sortedClubs) {
        println(club.name)
    }

    //Soal No.4d
    val filteredClubs = filterAndSort(clubs, ::filterByEuropeanTrophy)
    println("* Klub yang belum pernah memenangkan UCL dan UEL yaitu:")
    for (club in filteredClubs) {
        println(club.name)
    }

    //Soal No.5
    println("* Recap klub:")
    for (club in clubs) {
        println(club.recap())
    }
}

fun higherOrderFunction(clubs: List<Club>, criteria: (List<Club>) -> List<Club>): List<Club> {
    return criteria(clubs)
}

fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    return clubs.sortedByDescending { it.totalTrophy }
}

fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    return clubs.filter { it.TrophyLigaChampEropa == 0 && it.TrophyLigaEropaUEFA == 0 }
}