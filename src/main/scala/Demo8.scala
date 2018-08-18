import scala.annotation.tailrec

// tail recursion
object Demo8 {
  def main(args: Array[String]): Unit = {

    println(factorial(1000000))
  }

  def factorial(n: Int): BigInt = {
    @tailrec
    def helpFunction(acc: BigInt, n: Int): BigInt = {
      if (n == 0)
        acc
      else
        helpFunction(acc * n, n - 1)
    }

    helpFunction(1, n)
  }


}


