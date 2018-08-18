// method exercise
object Calc {

  def main(args: Array[String]): Unit = {
    println("square:" + square(3))
    println("cube:" + cube(3))
  }

  def square(n: Double): Double = {
    n * n
  }

  def cube(n: Double): Double = {
    n * square(n)
  }


}


