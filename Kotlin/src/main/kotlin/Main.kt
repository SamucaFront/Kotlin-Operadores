fun main() {

    println("Digite a primeira string:")
    val stringA = readln()

    println("Digite a segunda string:")
    val stringB = readln()

    if (stringA == stringB) {
        println("As strings são iguais.")
    } else {
        println("As strings são diferentes.")
    }

    println("--------------------------------------------------")

    println("Digite sua idade:")
    val idade = readln().toInt()

    if (idade >= 18) {
        println("Pode dirigir.")
    } else {
        println("Não pode dirigir.")
    }

    if (idade < 18) {
        println("Confirmando: NÃO pode dirigir.")
    } else {
        println("Confirmando: Pode dirigir.")
    }

    println("--------------------------------------------------")

    println("Você é motorista? (true/false)")
    val motorista = readln().toBoolean()

    if (motorista || idade >= 17) {
        println("É motorista OU tem 17 anos ou mais.")
    } else {
        println("Não atende à condição.")
    }

    if (motorista && idade > 30) {
        println("É motorista E tem mais de 30 anos.")
    } else {
        println("Não atende à condição.")
    }

    println("--------------------------------------------------")


    println("Digite o nome do produto:")
    val produto = readln()

    println("Digite o preço do produto:")
    val preco = readln().toDouble()

    if (produto == "iMac" && preco >= 10000.0) {
        val desconto = preco * 0.12
        val total = preco - desconto
        println("Desconto aplicado de 12%. Total a pagar: R$ $total")
    } else {
        println("Produto sem desconto.")
    }

    println("--------------------------------------------------")

    println("Digite um dia da semana (SEG, TER, QUA, QUI, SEX, SAB, DOM):")
    val dia = readln().uppercase()

    when (dia) {
        "SAB", "DOM" -> println("É fim de semana.")
        "SEG", "TER", "QUA", "QUI", "SEX" -> println("É dia útil.")
        else -> println("Erro: dia inválido.")
    }
}