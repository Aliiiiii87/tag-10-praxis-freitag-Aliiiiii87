

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

        var kleinsterWert = karteZuWert[kartenStappel.min()]
        print(kleinsterWert)

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



    var wertSpieler1Karte1: Int? = karteZuWert[spieler1[0]]
    var wertSpieler1Karte2: Int? = karteZuWert[spieler1[1]]
    var wertSpieler1Karte3: Int? = karteZuWert[spieler1[2]]

    var wertSpieler2Karte1: Int? = karteZuWert[spieler2[0]]
    var wertSpieler2Karte2: Int? = karteZuWert[spieler2[1]]
    var wertSpieler2Karte3: Int? = karteZuWert[spieler2[2]]

    var spieler1PunkteNeu = wertSpieler1Karte1!! + wertSpieler1Karte2!! + wertSpieler1Karte3!!
    var spieler2PunkteNeu = wertSpieler2Karte1!! + wertSpieler2Karte2!! + wertSpieler2Karte3!!
    println("Spieler 1 Punkte: $spieler1Punkte")
    println("Spieler 2 Punkte: $spieler2Punkte")


    var spieler1Min: List<Int> = listOf(wertSpieler1Karte1, wertSpieler1Karte2, wertSpieler1Karte3)
    var spieler2Min: List<Int> = listOf(wertSpieler2Karte1, wertSpieler2Karte2, wertSpieler2Karte3)
    var minWertSpieler1= spieler1Min.min()
        var minWertSpieler2=spieler2Min.min()
     var minKarteSpieler1=spieler1 [spieler1Min.indexOf(minWertSpieler1)]
        var minKarteSpieler2=spieler2 [spieler2Min.indexOf(minWertSpieler2)]
        println("das min von Spieler 1 ist: $minWertSpieler1 und gehört zur Karte: $minKarteSpieler1")
        println("das min von Spieler 2 ist: $minWertSpieler2 und gehört zur Karte: $minKarteSpieler2")
        var minIndexSpieler1 = spieler1Min.indexOf(minWertSpieler1)
        var minIndexSpieler2 = spieler2Min.indexOf(minWertSpieler2)

        spieler1.removeAt(minIndexSpieler1)
        spieler2.removeAt(minIndexSpieler2)

        println("Spieler 1: $spieler1")
        println("Spieler 2: $spieler2")
        spieler1.add(kartenStappel[0])
        spieler2.add(kartenStappel[0])
        println(spieler1)
        println(spieler2)
        var spieler1PunkteNeuNeu: Int? = (karteZuWert[spieler1[0]]?:0) + (karteZuWert[spieler1[1]]?:0)+(karteZuWert[spieler1[2]]?:0)
        var spieler2PunkteNeuNeu: Int? = (karteZuWert[spieler2[0]]?:0) + (karteZuWert[spieler2[1]]?:0)+(karteZuWert[spieler2[2]]?:0)
        println("Spieler 1 Punkte: $spieler1PunkteNeuNeu")
        println("Spieler 2 Punkte: $spieler2PunkteNeuNeu")



    }