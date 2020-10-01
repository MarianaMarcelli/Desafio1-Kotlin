class ProfessorAdjunto(
        nome: String = "",
        sobrenome: String = "",
        codigoProfessor: Int = 0

) : Professor(
        nome = nome,
        sobrenome = sobrenome,
        codigoProfessor = codigoProfessor
) {
    var quantidadeDeHorasDeMonitoria: Int = 0

    constructor(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHorasDeMonitoria: Int
    ) : this(nome, sobrenome, codigoProfessor) {
        this.quantidadeDeHorasDeMonitoria = quantidadeDeHorasDeMonitoria
    }

}