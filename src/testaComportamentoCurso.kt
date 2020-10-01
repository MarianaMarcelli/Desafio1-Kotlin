fun testaComportamentoCurso() {

    val aluno1 = Aluno(nome = "Julia", sobrenome = "Lustre", codigoAluno = 1111)
    val aluno2 = Aluno(nome = "Mariana", sobrenome = "MM", codigoAluno = 2222)
    val aluno3 = Aluno(nome = "Luiza", sobrenome = "JJ", codigoAluno = 3333)
    val aluno4 = Aluno(nome = "Lucas", sobrenome = "LL", codigoAluno = 4444)
    val aluno5 = Aluno(nome = "Marcio", sobrenome = "Marc", codigoAluno = 5555)

    var cursoMat = Curso(nomeDoCurso = "Mat", codigoCurso = 11, quantidadeMaximaAlunos = 3)

    var alunosCursoMat = arrayListOf<Aluno>()


    cursoMat.adicionarUmAluno(aluno1)
    println(cursoMat.alunosMatriculados.size)
    cursoMat.adicionarUmAluno(aluno2)
    println(cursoMat.alunosMatriculados.size)
    cursoMat.adicionarUmAluno(aluno3)
    println(cursoMat.alunosMatriculados.size)
    cursoMat.adicionarUmAluno(aluno4)
    cursoMat.excluirAluno(aluno2)
    println(cursoMat.alunosMatriculados.size)
    cursoMat.adicionarUmAluno(aluno1)
    println(cursoMat.alunosMatriculados.size)
    cursoMat.adicionarUmAluno(aluno4)
    cursoMat.adicionarUmAluno((aluno2))
}
