// recursion
object Demo7 {
  def main(args: Array[String]): Unit = {

    println(factorial(74))
  }

  def factorial(n: Int): BigInt = {
    if (n == 0) 1 else n * factorial(n - 1)
  }

}


