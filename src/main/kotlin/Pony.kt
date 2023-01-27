open class Pony(name: String, gewicht: Double, alter: Double, geschlecht: String, var geschwindigkeit: Double)
    : Tier(name, gewicht, alter, geschlecht) {

    override fun geraeusche() {
        println("Wiehiehie")
    }

    open fun reiten(besucher: Besucher) {

        if (alter >= 1 && besucher.alterBesucher >=6)
            println("$name wird jetzt von ${besucher.nameBesucher} geritten.")
        else println("Das Pony oder der Besucher ist zu jung zum Reiten.")
    }
}



