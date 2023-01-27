class Kuh(name: String, gewicht: Double, alter: Double, geschlecht: String)
        : Tier(name, gewicht, alter, geschlecht) {

    fun melken(besucher: Besucher) {
        if (alter >= 3 && geschlecht == "weiblich") {
            println("Die Kuh $name wird von ${besucher.nameBesucher} gemolken.")

        } else println("Die Kuh ist zu jung oder männlich sie kann  nicht gemolken werden.")
    }

    override fun geraeusche() {
        println("Muhhhhh")
    }

}


