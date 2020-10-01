abstract class Professor(
        val nome: String = "",
        val sobrenome: String = "",
        val codigoProfessor: Int = 0
) {
    var tempoDeCasa: Int = 0

    constructor(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            tempoDeCasa: Int
    ) : this(nome, sobrenome, codigoProfessor) {
        this.tempoDeCasa = tempoDeCasa
    }

    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', codigoProfessor=$codigoProfessor, tempoDeCasa=$tempoDeCasa)"
    }


}