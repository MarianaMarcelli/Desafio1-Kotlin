class ProfessorTitular(
        nome: String = "",
        sobrenome: String = "",
        codigoProfessor: Int = 0

) : Professor(
        nome = nome,
        sobrenome = sobrenome,
        codigoProfessor = codigoProfessor
) {
    var especialidade: String = ""

    constructor(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            especialidade: String
    ) : this(nome, sobrenome, codigoProfessor) {
        this.especialidade = especialidade
    }


}