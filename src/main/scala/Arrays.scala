object Arrays {
  def main(args: Array[String]): Unit = {
    val numeros = Array(1,1,12,3,4)
    numeros(3) = 100
    println(numeros.mkString("Array(", ", ", ")"))
  }
}
