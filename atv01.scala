object atv01 {
  def eh_primo (num_orig: Int, divisor: Int) {
    if (divisor > 2) {
      if (num_orig%divisor == 0) println ("Numero nao primo !\nDivisivel por "+divisor)
      else eh_primo(num_orig, (divisor - 1))
    }
    else println("Numero primo !")
  }
  def main (args: Array[String]) {
    eh_primo(args(0).toInt, (args(0).toInt - 1))
  }
}
