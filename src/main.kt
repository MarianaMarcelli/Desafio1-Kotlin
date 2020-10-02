fun main() {

    val manager = DigitalHouseManager()

    manager.registrarCurso(nomeCurso = "ios mobile", codigoCurso = 12, quantidadeMaximaDeAlunos = 5)
    manager.registrarCurso(nomeCurso = "lógica", codigoCurso = 22, quantidadeMaximaDeAlunos = 10)
    manager.registrarCurso(nomeCurso = "android mobile", codigoCurso = 156, quantidadeMaximaDeAlunos = 10)
    println(manager.listaCursos)
    manager.excluirCurso(codigoCurso = 50)
    println(manager.listaCursos)
    println()

    manager.registrarProfessorAdjunto(nome = "Bob", sobrenome = "Domzalski", codigoProfessor = 200, quantidadeDeHorasDeMonitoria = 20)
    manager.registrarProfessorAdjunto(nome = "Jim", sobrenome = "Lake", codigoProfessor = 201, quantidadeDeHorasDeMonitoria = 15)
    manager.registrarProfessorAdjunto(nome = "Clara", sobrenome = "Numes", codigoProfessor = 202, quantidadeDeHorasDeMonitoria = 20)
    manager.registrarProfessorTitular(nome = "Walter", sobrenome = "Strickler", codigoProfessor = 100, especialidade = "ios mobile")
    manager.registrarProfessorTitular(nome = "Merlin", sobrenome = "Magician", codigoProfessor = 101, especialidade = "lógica")
    manager.registrarProfessorTitular(nome = "Barbara", sobrenome = "", codigoProfessor = 102, especialidade = "android mobile")
    println(manager.listaProfessores)
    manager.excluirProfessor(codigoProfessor = 100)
    println(manager.listaProfessores)
    println()

    manager.matricularAluno(nome = "Julia", sobrenome = "Luiza", codigoAluno = 21)
    println(manager.listaAlunos)


}

