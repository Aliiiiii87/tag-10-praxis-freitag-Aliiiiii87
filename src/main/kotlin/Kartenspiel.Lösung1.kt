fun main(){

    // Eine Liste mit Karten
    var kartenDeck: List<String> = listOf(
        "Herz Ass",
        "Herz König",
        "Herz Dame",
        "Herz Bube",
        "Karo Ass",
        "Karo König",
        "Karo Dame",
        "Karo Bube",
        "Pik Ass",
        "Pik König",
        "Pik Dame",
        "Pik Bube",
        "Kreuz Ass",
        "Kreuz König",
        "Kreuz Dame",
        "Kreuz Bube"

    )
        var kartenStappel = kartenDeck.toMutableList()
        kartenStappel.shuffle()
        println(kartenDeck)
        println(kartenStappel)
        var ersteKarte = kartenStappel[0]
        println(ersteKarte)
        kartenStappel.removeAt(0)
        println(kartenStappel)
        kartenStappel.min()


    // Eine Map die jeder Karte einen Wert zuordnet
    var karteZuWert: Map<String, Int> = mapOf(
        "Herz Ass" to 1,
        "Herz König" to 5,
        "Herz Dame" to 4,
        "Herz Bube" to 3,
        "Karo Ass" to 1,
        "Karo König" to 5,
        "Karo Dame" to 4,
        "Karo Bube" to 3,
        "Pik Ass" to 1,
        "Pik König" to 5,
        "Pik Dame" to 4,
        "Pik Bube" to 3,
        "Kreuz Ass" to 1,
        "Kreuz König" to 5,
        "Kreuz Dame" to 4,
        "Kreuz Bube" to 3
    )



    // TODO: Beginne hier deinen Code zu schreiben!

    var pikAssWert = karteZuWert[kartenStappel.min()]
    print(pikAssWert)

    var spieler1 = mutableListOf<String>()
    spieler1.add(kartenStappel[0])
     kartenStappel.removeFirst()

    var spieler2 = mutableListOf<String>()
    spieler2.add(kartenStappel[0])
    kartenStappel.removeFirst()

    spieler1.add(kartenStappel[0])
    kartenStappel.removeFirst()

    spieler2.add(kartenStappel[0])
    kartenStappel.removeFirst()

    spieler1.add(kartenStappel[0])
    kartenStappel.removeFirst()

    spieler2.add(kartenStappel[0])
    kartenStappel.removeFirst()

    var kartenStappel2 = kartenStappel-spieler1-spieler2
    println(kartenStappel2)

   var spieler1Punkte: Int? = (karteZuWert[spieler1[0]]?:0) + (karteZuWert[spieler1[1]]?:0)+(karteZuWert[spieler1[2]]?:0)
    var spieler2Punkte: Int? = (karteZuWert[spieler2[0]]?:0) + (karteZuWert[spieler2[1]]?:0)+(karteZuWert[spieler2[2]]?:0)
    println("$spieler2Punkte")
    println("$spieler1Punkte")


    var spieler1Werte = spieler1.mapNotNull{karteZuWert[it]}
    var spieler2Werte = spieler2.mapNotNull{karteZuWert[it]}
    println(spieler1Werte)
    println(spieler2Werte)
    val niedrigsterWertSpieler1 = spieler1Werte.minOrNull()
    val niedrigsterWertSpieler2 = spieler2Werte.minOrNull()
    println(niedrigsterWertSpieler1)
    println(niedrigsterWertSpieler2)

    val indexSpieler1 = spieler1Werte.indexOf(niedrigsterWertSpieler1)
    spieler1.removeAt(indexSpieler1)

    val indexSpieler2 = spieler2Werte.indexOf(niedrigsterWertSpieler2)
    spieler2.removeAt(indexSpieler2)

    spieler1.add(kartenStappel[0])
    kartenStappel.remove(spieler1.min())
    spieler2.add(kartenStappel[0])
    kartenStappel.remove(spieler2.min())
    println(spieler1)
    println(spieler2)

    var spieler1PunkteNeu: Int? = (karteZuWert[spieler1[0]]?:0) + (karteZuWert[spieler1[1]]?:0)+(karteZuWert[spieler1[2]]?:0)
    var spieler2PunkteNeu: Int? = (karteZuWert[spieler2[0]]?:0) + (karteZuWert[spieler2[1]]?:0)+(karteZuWert[spieler2[2]]?:0)
    println("$spieler2Punkte")
    println("$spieler1Punkte")



}



