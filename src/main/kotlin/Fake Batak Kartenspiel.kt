fun main(){
      println("\u001B[7m\u001B[32m---------------\u001B[1mHerzlich Willkomen------------------\u001B[0m")
      println("\n\t\t\t\t\u001B[7m\u001B[31m\u001B[1m`Fake Batak`\u001B[0m\n\ndas Kartenspiel für Groß und klein!")
      println("\n\u001B[7mGib deinen Namen ein :\u001B[0m")
      var name = readln()
      println("\nHallo \u001B[32m$name\u001B[0m")

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
    var ersteKarte = kartenStappel[0]
    kartenStappel.removeAt(0)
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
    println("\nWillkommen in unserem Karten Spiel `\u001B[7m\u001B[31mFake Batak`\u001B[0m\n")
    println("Drücke Enter um die Regeln zu sehen")
    var enter0= readln()
    println("Die Regeln sind einfach:\n\n\u001B[7m\u001B[1m1.Es gibt 16 Karten im Deck\u001B[0m\n\u001B[7m\u001B[1m2.Jeder zieht 3 Karten aus dem Deck\u001B[0m\n\u001B[7m\u001B[1m3.Es wird abwechselt eine Karte Abgeworfen\u001B[0m\n\u001B[7m\u001B[1m4.Die niedrigste Karte gewinnt\u001B[0m\n\u001B[7m\u001B[1m5. Am ende werden die Gesamtpunkte der Karten zusammengezählt\u001B[0m\n\u001B[7m\u001B[1m6.Der mit den niedrigsten Punkten Gewinnt\u001B[0m")
    println("Let`s Go , Bist du Bereit ?")
    val bereit = readln()
    println("Dann schau dir das Deck mit den zugehörigen wert an\n ")
      val kartenDeckShow= StringBuilder()   // StringBuilder verwende ich um die Zeichenketten Zusammen zu setzten
      for((karte, punkte) in karteZuWert)   // das ist eine Schleife
      kartenDeckShow.append("$karte: $punkte\n")
      println(kartenDeckShow.toString())
      println("Jetzt hast du das Deck gesehen, drücke erneut Enter! ")
      var enter7= readln()
      println("Nachdem du jetzt die Regeln kennst und dir ein einblick ins Deck verschaft hast,\nlass uns eine runde spielen 🥳🥳")
      println("\nBitte Drücke Enter um eine Karte zu ziehen")
      var enter = readln()
    var pikAssWert = karteZuWert[kartenStappel.min()]
    var spieler1 = mutableListOf<String>()
    spieler1.add(kartenStappel[0])
    kartenStappel.removeFirst()
    println("$name:\u001B[7m\u001B[32m$spieler1\u001B[0m")
    println("\nJetzt bin ich dran!")
    var spieler2 = mutableListOf<String>()
    spieler2.add(kartenStappel[0])
    kartenStappel.removeFirst()
    println("\nCPU:\u001B[7m\u001B[31m$spieler2\u001B[0m")
    var enter2 = readln()
    spieler1.add(kartenStappel[0])
    kartenStappel.removeFirst()
    println("\nZiehe mit Enter wieder eine Karte")
    println("\n$name:\u001B[7m\u001B[32m$spieler1\u001B[0m")
    spieler2.add(kartenStappel[0])
    kartenStappel.removeFirst()
    println("\nJetzt bin ich wieder an der Reihe")
    println("\nCPU:\u001B[7m\u001B[31m$spieler2\u001B[0m")
    println("\nZiehe mit Enter wieder eine Karte")
    var enter3 = readln()
    spieler1.add(kartenStappel[0])
    kartenStappel.removeFirst()
    println("\n$name:\u001B[7m\u001B[32m$spieler1\u001B[0m")
    println("\nJetzt bin ich wieder an der Reihe")
    spieler2.add(kartenStappel[0])
    kartenStappel.removeFirst()
    println("\nCPU:\u001B[7m\u001B[31m$spieler2\u001B[0m")
    var kartenStappel2 = kartenStappel-spieler1-spieler2


    var spieler1Punkte: Int? = (karteZuWert[spieler1[0]]?:0) + (karteZuWert[spieler1[1]]?:0)+(karteZuWert[spieler1[2]]?:0)
    var spieler2Punkte: Int? = (karteZuWert[spieler2[0]]?:0) + (karteZuWert[spieler2[1]]?:0)+(karteZuWert[spieler2[2]]?:0)
    println("\nDie Punkte von der Hand  $name sind $spieler1Punkte Punkte")
    println("\nDie Punkte von der Hand  CPU sind $spieler2Punkte Punkte")
    println("\nLege jetzt die Niedrigste Karte aus deiner Hand, Drücke dafür Enter!")
    var enter5 = readln()

    var spieler1Werte = spieler1.mapNotNull{karteZuWert[it]}
    var spieler2Werte = spieler2.mapNotNull{karteZuWert[it]}
    val niedrigsterWertSpieler1 = spieler1Werte.minOrNull()
    val niedrigsterKarteSpieler1= spieler1[spieler1Werte.indexOf(niedrigsterWertSpieler1)]
    val niedrigsterWertSpieler2 = spieler2Werte.minOrNull()
    val niedrigsterKarteSpieler2= spieler2[spieler2Werte.indexOf(niedrigsterWertSpieler2)]
    println("\n$name:\u001B[7m\u001B[32m$niedrigsterKarteSpieler1:$niedrigsterWertSpieler1\u001B[0m")
    println("\nJetzt bin ich Dran!😀")
    println("\nCPU:\u001B[7m\u001B[31m$niedrigsterKarteSpieler2:$niedrigsterWertSpieler2\u001B[0m")
    println("\n.........Loading\n.........Loading")
    when {
        niedrigsterWertSpieler1 != null && niedrigsterWertSpieler2 != null -> {
            when {
                niedrigsterWertSpieler1 < niedrigsterWertSpieler2 -> {
                    println("\n\u001B[7m\u001B[32m$name\u001B[0m gewinnt die Runde!")
                    kartenStappel2 = kartenStappel2 - spieler1 - spieler2
                }
                niedrigsterWertSpieler1 > niedrigsterWertSpieler2 -> println("\n\u001B[7m\u001B[31mCPU\u001B[0m gewinnt die Runde!")
                else -> println("\n\t\t\t\u001B[7m\u001B[32m\u001B[1mUnentschieden\u001B[0m!\n\nDie Karten bleiben auf dem Tisch.")
            }
        }
    }
    println("\nNun zieht jeder von uns beiden Abwechselt wieder eine Karte ")
    val indexSpieler1 = spieler1Werte.indexOf(niedrigsterWertSpieler1)
    spieler1.removeAt(indexSpieler1)
    val indexSpieler2 = spieler2Werte.indexOf(niedrigsterWertSpieler2)
    spieler2.removeAt(indexSpieler2)

    spieler1.add(kartenStappel[0])
    println("\n$name : \u001B[7m\u001B[32m$spieler1\u001B[0m")
    kartenStappel.remove(spieler1.min())
    spieler2.add(kartenStappel[0])
    println("\nCPU : \u001B[7m\u001B[31m$spieler1\u001B[0m")
    kartenStappel.remove(spieler2.min())

    var spieler1PunkteNeu: Int? = (karteZuWert[spieler1[0]]?:0) + (karteZuWert[spieler1[1]]?:0)+(karteZuWert[spieler1[2]]?:0)
    var spieler2PunkteNeu: Int? = (karteZuWert[spieler2[0]]?:0) + (karteZuWert[spieler2[1]]?:0)+(karteZuWert[spieler2[2]]?:0)
    println("\nDie Punkte von der Hand  $name sind $spieler1PunkteNeu Punkte")
    println("\nDie Punkte von der Hand  CPU sind $spieler2PunkteNeu Punkte")
    println("\nLege jetzt die Niedrigste Karte aus deiner Hand, Drücke dafür Enter!")
    var enter6 = readln()

    var spieler1WerteNeu = spieler1.mapNotNull{karteZuWert[it]}
    var spieler2WerteNeu = spieler2.mapNotNull{karteZuWert[it]}
    val niedrigsterWertSpieler1Neu = spieler1Werte.minOrNull()
    val niedrigsterKarteSpieler1Neu= spieler1[spieler1Werte.indexOf(niedrigsterWertSpieler1Neu)]
    val niedrigsterWertSpieler2Neu = spieler2Werte.minOrNull()
    val niedrigsterKarteSpieler2Neu= spieler2[spieler2Werte.indexOf(niedrigsterWertSpieler2Neu)]
    println("\n$name:\u001B[7m\u001B[32m$niedrigsterKarteSpieler1Neu:$niedrigsterWertSpieler1Neu\u001B[0m")
    println("\nJetzt bin ich Dran!😀")
    println("\nCPU:\u001B[7m\u001B[31m$niedrigsterKarteSpieler2Neu:$niedrigsterWertSpieler2Neu\u001B[0m")
    println("\n.........Loading\n.........Loading")
    when {
        niedrigsterWertSpieler1 != null && niedrigsterWertSpieler2 != null -> {
            when {
                niedrigsterWertSpieler1 < niedrigsterWertSpieler2 -> {
                    println("\n\u001B[7m\u001B[32m$name\u001B[0m gewinnt die Runde!")
                    kartenStappel2 = kartenStappel2 - spieler1 - spieler2
                }
                niedrigsterWertSpieler1 > niedrigsterWertSpieler2 -> println("\n\u001B[7m\u001B[31mCPU:\u001B[0m gewinnt die Runde!")
                else -> println("\n\t\t\t\u001B[7m\u001B[32m\u001B[1mUnentschieden\u001B[0m!\n\nDie Karten bleiben auf dem Tisch.")
            }
        }
    }
    println("🥳🥳 Finish ! Es hat hoffentlich Spass gemacht")
    println("Wenn du denkst das das Spiel weiter geht ? Hast du nicht verstanden das es ein Fake Spiel namens Batak ist ")

                 }

