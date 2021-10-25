import java.util.*

fun main(args: Array<String>) {

    var diam = 0
    var area = 0.0
    var perm = 0.0
    var pi = 3.14
    var raio = 0.0
    var leitura = Scanner(System.`in`)


    println("Digite o diâmetro de um círculo: ")
    diam = leitura.nextInt()

    perm = diam * pi

    raio = diam.toDouble() / 2
    area = pi *(raio * raio)

    println("O valor da area é $area, e o valor do perimêtro é $perm")




}