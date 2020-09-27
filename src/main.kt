fun main() {

    val aluno1 = Aluno(nome="Julia" , sobrenome="Lustre", codigoAluno = 1111 )
    val aluno2 = Aluno(nome="Mariana" , sobrenome= "MM", codigoAluno = 2222 )
    val aluno3 = Aluno(nome= "Luiza", sobrenome="JJ", codigoAluno = 3333 )
    val aluno4= Aluno(nome="Lucas" , sobrenome="ll", codigoAluno = 4444 )
    val aluno5 = Aluno(nome="Marcio" , sobrenome="Marc", codigoAluno = 5555 )

    var alunosCurso1 = arrayListOf<Aluno>(aluno1, aluno2, aluno3)
    var curso1 = Curso(
            "Curso1",
            11,
            ProfessorTitular(Professor("P1", "Pfrof", 10, 1), "lógica"),
            ProfessorAdjunto(Professor("adj", "profe",2, 2), 10),
            4, alunosCurso1
    )
    println(alunosCurso1)
    println(alunosCurso1.size)
    curso1.adicionarUmAluno(aluno4)
    println(alunosCurso1.size)
    println(alunosCurso1)
    curso1.adicionarUmAluno(aluno5)
    curso1.excluirAluno(aluno1)
    curso1.adicionarUmAluno(aluno5)


}