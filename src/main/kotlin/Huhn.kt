class Huhn (name: String, gewicht:Double, alter:Double, geschlecht:String, var eierProTag:Int)
            : Tier(name, gewicht, alter, geschlecht){

    override fun geraeusche() {
        println("gak, gak")
    }

}
