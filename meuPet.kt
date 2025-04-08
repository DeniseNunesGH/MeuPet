fun main() {
    val pet = meuPet()

    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    pet.nome = readln()


    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar ${pet.nome}")
        println("2. Brincar com ${pet.nome}")
        println("2. Nanar o ${pet.nome}")
        println("3. Verificar o status de ${pet.nome}")
        println("4. Sair")

        val escolha = readLine()?.toIntOrNull() ?: continue

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.descansar()
            4 -> pet.verificarStatus()
            5 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }
            else -> println("Escolha inválida. Tente novamente.")
        }

        pet.passarTempo() // Simula o tempo que passa após cada ação
    }
}