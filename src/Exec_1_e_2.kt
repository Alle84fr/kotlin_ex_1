import java.util.Scanner

class Pintura (val altura:Double, val largura: Double){

    // no parâmetro do class deve por a mtabilidade da variável, seu nome e :tipo

    val litro = 2.0

    fun area(): Double{

        // a variável já foi adicinada na parte de cima, então é só chamar-las
        // deve por o tipo de saída da função

        return altura * largura

    }

    fun quantTinta (): Double{
        var tinta = area() / litro
        // lembrar que para chamar função deve por ()
        return tinta
    }

    fun litrao(): Double {
        val umLitro = 35.30/5.75
        var xLitros = quantTinta() * umLitro
        return xLitros
    }
}

fun conversao(freal:Float): Double {
    val doleta = 5.75
    var convertido = freal / doleta
    return convertido

    //porque o retorno é double não float?
    //return apenas para números e deve, no "cabeçalho" por () : Double ou Int -> representa o tipo do return
}


fun main() {
    println("Saluton Komencanto")

    val scanner = Scanner(System.`in`)     // tem que por esta variável.

    var real: Float
    println("quantos reais você tem em sua carteira? ")
    real = scanner.nextFloat()

   // ao procurar meu erro vi que posso por direto a variável no scanner

    println("Qual altura da parede? ")
    var altura = scanner.nextDouble()

    println("Qual lagura da parede? ")
    var largura = scanner.nextDouble()

    var parede = Pintura(altura, largura)

    var conv = conversao(real)


    println("Cliente X,  para pintar ${parede.area()} m² usa-se ${parede.quantTinta()} L tinta" +
    "\n Se cliente X tem ${real} ele tem ${"%.2f".format(conv)} dolares precisa de $ ${"%2f".format(parede.litrao())}")
}
