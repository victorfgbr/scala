// Implementar uma função que recebe um vetor (ou lista)
// e um inteiro n e retorna o enésimo elemento desse vetor.

object atv03 {
  def retorna_valor (lista: List[Int], i: Int): Int = {
    lista(i)
  }
  def main (args: Array[String]) {
    println(retorna_valor(List( 1, 2, 3, 4), 2))
  }
}
