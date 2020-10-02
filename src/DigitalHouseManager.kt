class DigitalHouseManager(val listaAlunos: MutableList<Aluno> = mutableListOf(),
                          val listaProfessores: MutableList<Professor> = mutableListOf(),
                          val listaCursos: MutableList<Curso> = mutableListOf(),
                          val listaMatriculas: MutableList<Matricula> = mutableListOf()
) {

    fun registrarCurso(nomeCurso: String, codigoCurso: Int,
                       quantidadeMaximaDeAlunos: Int) {
        var novoCurso = Curso(
                nomeCurso,
                codigoCurso,
                quantidadeMaximaDeAlunos
        )
        listaCursos.add(novoCurso)
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.forEach {
            if (it.codigoCurso == codigoCurso) {
                listaCursos.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHorasDeMonitoria: Int
    ) {
        val novoAdjunto = ProfessorAdjunto(
                nome,
                sobrenome,
                codigoProfessor,
                quantidadeDeHorasDeMonitoria
        )
        listaProfessores.add(novoAdjunto)
    }

    fun registrarProfessorTitular(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            especialidade: String
    ) {
        val novoTitular = ProfessorTitular(
                nome,
                sobrenome,
                codigoProfessor,
                especialidade
        )
        listaProfessores.add(novoTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val iterator = listaProfessores.listIterator()
        while (iterator.hasNext()) {
            val professor = iterator.next()
            if (professor.codigoProfessor == codigoProfessor) {
                iterator.remove()
            }
        }
    }

    fun matricularAluno(
            nome: String,
            sobrenome: String,
            codigoAluno: Int
    ) {
        val novoAluno = Aluno(
                nome,
                sobrenome,
                codigoAluno
        )
        listaAlunos.add(novoAluno)
    }

    fun matricularAlunoCurso(codigoAluno: Int, codigoCurso: Int) {
        val aluno = listaAlunos.find { it.codigoAluno == codigoAluno }
        val cursoescolhido = listaCursos.find { it.codigoCurso == codigoCurso }
    }

    fun alocarProfessores(
            codigoCurso: Int,
            codigoProfessorTitular: Int,
            codigoProfessorAdjunto: Int
    ) {
        val titulardoCurso = listaProfessores.find { it.codigoProfessor == codigoProfessorTitular }
        val adjuntoDocurso = listaProfessores.find { it.codigoProfessor == codigoProfessorAdjunto }

    }

    override fun toString(): String {
        return "DigitalHouseManager(listaAlunos=$listaAlunos, listaProfessores=$listaProfessores, listaCursos=$listaCursos, listaMatriculas=$listaMatriculas)"
    }

}












