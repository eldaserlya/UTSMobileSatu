package com.example.utsmobilesatu

//soal No.1 dan 2
class Club(
    val name: String,
    val TrophyLigaPrimerInggris: Int,
    val TrophyFA: Int,
    val TrophyEFL: Int,
    val TrophyLigaChampEropa: Int,
    val TrophyLigaEropaUEFA: Int
) {
    // soal No.3
    val totalTrophy: Int
        get() = TrophyLigaPrimerInggris + TrophyFA + TrophyEFL + TrophyLigaChampEropa + TrophyLigaEropaUEFA

    fun recap(): String {
        return "Klub $name berhasil meraih $TrophyLigaPrimerInggris trofi Liga Primer Inggris, " +
                "$TrophyFA trofi FA, " +
                "$TrophyEFL trofi EFL, " +
                "$TrophyLigaChampEropa trofi Liga Champions Eropa, dan " +
                "$TrophyLigaEropaUEFA trofi Liga Eropa UEFA, dengan total perolehan trofi yaitu $totalTrophy trofi."
    }
}
