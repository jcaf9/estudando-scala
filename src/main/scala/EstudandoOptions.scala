object EstudandoOptions {
  def main(args: Array[String]): Unit = {
    val map: Map[Int, String] = Map.apply(1 -> "first", 2 -> "second")
    //  println(map.get(2))

    def metodoNaoSeguro(): Option[String] = None

    def metodoValorValido(): Option[String] = Some("Valor válido")

    val resultado = metodoNaoSeguro() orElse metodoValorValido()
    //  println(resultado)
    val primeiraOp: Option[Int] = Some(11)
    println("multiplicando o valor por 3")
    println(primeiraOp.map(_ * 3))
    println("Filtrando, pegando os valores > 10")
    println(primeiraOp.filter(x => x > 10))
  }
}
