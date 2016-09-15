object atv02 {

  def itera_lista (lista: List[Int], num: Int, i: Int): Boolean = {
    if ((lista.length) > i) {
      if (num%lista(i) == 0) itera_lista (lista, num, i + 1)
      else false
    }
    else true
  }

  def itera_num (lista: List[Int], num: Int, i: Int): Int = {
    if (itera_lista (lista, num, i) == true) num
    else itera_num (lista, num + 1, i)
  }
  
  def main (args: Array[String]) {
    println ("MMC: "+itera_num (List ( 1, 2, 3, 4, 5), 1, 0))
  }
}
