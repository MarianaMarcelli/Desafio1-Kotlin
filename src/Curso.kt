class Curso(
        val nomeDoCurso: String,
        val codigoCurso: Int,
        val professorTitular: ProfessorTitular,
        val professorAdjunto: ProfessorAdjunto,
        var qtdeMaximaAlunos: Int,
        var alunosMatriculados: ArrayList<Aluno> = arrayListOf()

) {

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunosMatriculados.size < qtdeMaximaAlunos) {
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
}