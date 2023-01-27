open class Streichelzoo {

    open var tiereImZoo = mutableListOf<Tier>()

    constructor(){

        this.tiereImZoo.add(0, Schaf("Inge",16.0, 5.0, "weiblich"))
        this.tiereImZoo.add(1, Schaf("Suse",13.0, 3.0, "weiblich"))
        this.tiereImZoo.add(2, Huhn("Herta",1.4, 1.0, "weiblich", 3))
        this.tiereImZoo.add(3, Huhn("Rita",2.0, 4.0, "weiblich", 7))
        this.tiereImZoo.add(4, Kuh("Olga",350.0, 9.0, "weiblich"))
        this.tiereImZoo.add(5, Pony("Frida",160.0, 3.0, "weiblich", 22.0))
    }

    open fun freuen(besucher: Besucher){
        println("${besucher.nameBesucher} hat den Zoo betreten.")
        for (tiereImZoo in tiereImZoo){
            tiereImZoo.geraeusche()
        }
    }

    open fun fuetternAlleTiere(besucher: Besucher){
        for (tiereImZoo in tiereImZoo)
            println("${besucher.nameBesucher} füttert ${tiereImZoo.name}.")
    }
}



//3. Der Zoo bietet ein Rennen zwischen zwei Ponys an. Schreibe eine Methode, bei der
//zwei Ponys als Parameter übergeben werden und das schnellere der zwei in der Konsole
//als Gewinner ausgegeben wird.