class Xogador : Seleccion {

    var dorsal = 0
    var demarcacion = ""

    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) : super(
            id,
            nome,
            apelido,
            edade
    ) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    override fun concentrarse(tempoConcentracion : Int): Int {
        println("Concentrase a seleccion e o tempo de concentracion e: " + tempoConcentracion)
        return 0;
    }

    override fun viaxar(viaxa: String): String {
        println("Viaxan o xogadores a " + viaxa)
        return viaxa;

    }
}