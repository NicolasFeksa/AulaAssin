//Função que imprime os números em forma crescente


fun main (){
    val numeros = listOf(2,3,5,12,)
    val crescente = numeros.sortedBy { it }

    print(crescente)

}