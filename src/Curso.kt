class Curso(
        var nomeDoCurso: String = "",
        var codigoCurso: Int = 0,
        var quantidadeMaximaAlunos: Int = 0
) {
    var professorTitular = ProfessorTitular()
    var professorAdjunto = ProfessorAdjunto()
    var alunosMatriculados: ArrayList<Aluno> = arrayListOf()

    constructor(
            nomeDoCurso: String,
            codigoCurso: Int,
            quantidadeMaximaAlunos: Int,
            professorTitular: ProfessorTitular,
            professorAdjunto: ProfessorAdjunto,
            alunosMatriculados: ArrayList<Aluno>) : this(
            nomeDoCurso,
            codigoCurso,
            quantidadeMaximaAlunos
    ) {
        this.professorAdjunto = professorAdjunto
        this.professorTitular = professorTitular
        this.alunosMatriculados = alunosMatriculados
    }

     fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunosMatriculados.contains(umAluno)) {
            println("${umAluno.nome} ${umAluno.sobrenome} você já está matriculado(a) neste curso")
            return false
        } else if (alunosMatriculados.size < quantidadeMaximaAlunos) {
            alunosMatriculados.add(umAluno)
            println("${umAluno.nome} ${umAluno.sobrenome} sua matrícula no curso foi efetuada com sucesso.")
            return true
        } else {
            println("${umAluno.nome} ${umAluno.sobrenome}, desculpe, mas não há mais vagas disponíveis para este curso.")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        val remove = alunosMatriculados.remove(umAluno)
        println("${umAluno.nome} ${umAluno.sobrenome} você não pertence mais ao curso $nomeDoCurso")
    }

    override fun toString(): String {
        return "Curso(nomeDoCurso='$nomeDoCurso', codigoCurso=$codigoCurso, quantidadeMaximaAlunos=$quantidadeMaximaAlunos, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, alunosMatriculados=$alunosMatriculados)"
    }

}