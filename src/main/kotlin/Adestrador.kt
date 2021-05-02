class Adestrador:Seleccion {

    var idFederacion = ""

    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.idFederacion = idFederacion
    }
    override fun concentrarse(tempoConcentracion:Int) : Int{
        println("Concentrase a seleccion e o tempo de concentracion e: " + tempoConcentracion)
        return 0;
    }

    override fun viaxar(viaxa:String) : String {
        println("Viaxa o adestrador a " + viaxa)
        return viaxa;
    }

}