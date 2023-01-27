fun main() {

    var seb = Besucher("Seb", 15)
    var boris = Besucher("Boris", 4)

    var zoo = Streichelzoo()



    seb.vorstellen()
    boris.vorstellen()
    zoo.tiereImZoo[2].geraeusche()
    zoo.tiereImZoo[1].fuettern(besucher = seb)
    zoo.tiereImZoo



}


//4. Boris will auf einem der Ponys reiten.
//5. Eines der Hühner läuft durchs Gehege.
//6. Seb streichelt eins der Ponys.
//7. Danach reitet Seb auf dem Pony.
//8. Jetzt versucht Boris auf dem Pony zu reiten.
//9. Boris versucht die Kuh zu melken.
//10. Alle Tiere machen zusammen ihre Geräusche.
//11. Fütterungszeit. Boris füttert alle Tiere.
//12. Zuletzt haben die beiden Ponys ein Rennen.