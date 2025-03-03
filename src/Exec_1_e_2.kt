import java.util.Scanner

class Pintura (altura:Double, largura: Double){

    val litro = 2.0

    fun area(faltura:Double, flargura: Double): Double{
        var area = faltura * flargura
        return area
    }

    fun quantTinta (farea:Double): Double{
        var tinta = farea / 2
        return tinta
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

    var altura: Float
    var largura: Float

}
