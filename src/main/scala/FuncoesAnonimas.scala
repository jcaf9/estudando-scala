object FuncoesAnonimas {
  def main(args: Array[String]): Unit = {
    //val duplicar = (x: Int) => x * 2
    val duplicar: Int => Int = x => x * 2
  }

  def imprimeMsg(msg: String): Unit = {
    println(msg)
  }

  def calcula(numero: Int, numero2: Int, op: String): Int = {
    println("Operação " + op + " " + numero + " " + numero2)
    op match {
      case "soma" => numero + numero2
      case "subtracao" => numero - numero2
      case "multi" => numero * numero2
      case "divisao" => numero / numero2
    }
  }
}
