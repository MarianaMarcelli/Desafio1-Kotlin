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


    fun excluirProfessor(codigoProfessor: Int) : Boolean {
//      // listaProfessores.filter{ it.codigoProfessor == codigoProfessor}.map { it.codigoProfessor }
//        val achaCodigoProfessor = listaProfessores.map { it.codigoProfessor }
//        if (!achaCodigoProfessor.contains(codigoProfessor)){
//            return false
//            } else{
//            listaProfessores.remove(Professor())
//        }




       // TODO()
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



}


    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
    TODO()   }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int,
                      codigoProfessorAdjunto: Int) {
    TODO()}







