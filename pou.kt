class meuPet {
    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nivelDeDormes = 8
    var nome = " "

    fun alimentar() {
        nivelDeFome -= 10
        println("$nome foi alimentado. O nível de fome diminuiu.")
        //quanto maior = mais fome
        //se chegar a 100 = morre/foge/some
        //lvl up = quanto mais comer
        //ajustar limite de fome "pou ta cheio"
        //ajustar o nivel de fome, toda vez que alimenta o nível de fome diminui e chega a negativo, ajustar isso para chegar a zero
    }

    fun brincar() {
        nivelFelicidade += 10
        println("$nome está brincando e se sentindo mais feliz.")
        //quanto maior = maior a felicidade e menor o tempo de duração
        //se chegara a 100 = morre/foge/some
        //lvl up = quanto mais comer
        //ajustar limite de felicidade "pou ficou sem depressão"

    }

    fun descansar() {
        //
    }

    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
    }

    fun passarTempo() {
        nivelDeFome += 5
        println("$nome está ficando mais faminto com o passar do tempo.")
    }


}