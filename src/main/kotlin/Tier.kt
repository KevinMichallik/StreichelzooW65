open class Tier(
        var name: String,
        var gewicht: Double,
        var alter: Double,
        var geschlecht: String) {

    fun bewegen(){
        println("$name hat sich bewegt.")
    }
    open fun geraeusche(){
        println("Tiergeräusch")
    }
    fun streicheln(besucher: Besucher){
        println("$name wird gerade von ${besucher.nameBesucher} gestreichelt.")
    }
    fun fuettern(besucher: Besucher){
        println("$name wird gerade von ${besucher.nameBesucher} gefüttert.")
        gewicht = gewicht * 1.02
    }

}



