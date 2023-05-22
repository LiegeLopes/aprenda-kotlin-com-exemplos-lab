enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 180)

    val formacao = Formacao("Formação Kotlin")
    formacao.conteudos.add(conteudo1)
    formacao.conteudos.add(conteudo2)

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    println("Usuários matriculados: ${formacao.inscritos.size}")
    println("Conteúdos da formação:")
    for (conteudo in formacao.conteudos) {
        println(conteudo.nome)
    }
}
