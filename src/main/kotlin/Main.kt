import java.util.Scanner
fun main() {
    do{
        val  scanner = Scanner(System. `in`)
        println("Informe o preço da gasolina: R$")
        var gas = scanner.nextDouble()
        println("Informe o valor do alcool: R$")
        var alc = scanner.nextDouble()
        val valor = alc/gas
        if( valor > 0.7) {
            println("A gasolina vale mais a pena")
        }else if (valor == 0.7){
            println("Tanto faz abastecer com qualquer um dos dois")
        }else{
            println("O alcool vale mais a pena")
        }
        println("Deseja continuar?\nS --> SIM\nN --> NÂO\n")
        var cont = scanner.next()
    }while(cont.equals("s", ignoreCase = true))
    println("Program finalizado")

}