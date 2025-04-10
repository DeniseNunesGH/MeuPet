class meuPet {
    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nome = " "

    fun alimentar() {

        if (nivelDeFome > 0) {
            nivelDeFome -= 10
            println("$nome foi alimentado. O nível de fome diminuiu.")
        } else { println("$nome está satisfeito.")
        }
        //quanto maior = mais fome
        //se chegar a 100 = morre/foge/some
        //lvl up = quanto mais comer
        //ajustar limite de fome "pou ta cheio"
        //ajustar o nivel de fome, toda vez que alimenta o nível de fome diminui e chega a negativo, ajustar isso para chegar a zero
    }

    fun brincar() {
        if (nivelFelicidade < 100) {
        nivelFelicidade += 10
        println("$nome está brincando e se sentindo mais feliz.")
        } else {
            println("$nome está se sentindo muito feliz")
        }
        //quanto maior = maior a felicidade e menor o tempo de duração
        //se chegara a 100 = morre/foge/some
        //lvl up = quanto mais comer
        //ajustar limite de felicidade "pou ficou sem depressão"

    }

    fun descansar() {
        println("$nome está dando uma sonequita e se sente mais relaxado.")
        nivelDeFome += 5
        nivelFelicidade += 5
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
