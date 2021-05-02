open abstract class Seleccion {

    var id = 0
    var nome = ""
    var apelido = ""
    var edade = 0

    constructor(id: Int, nome: String, apelido: String, edade: Int){
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
    }
    abstract fun concentrarse(tempoConcentracion : Int):Int

    abstract fun viaxar(viaxa:String):String





}