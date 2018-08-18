// method exercise
object Sum {

  def main(args: Array[String]): Unit = {
    println("square:" + square(3))
    println("cube:" + cube(3))
    println("combine square:" + combine(x => x * x, input = 3))
  }

  def square(n: Double): Double = {
    n * n
  }

  def cube(n: Double): Double = {
    n * square(n)
  }

  def combine(f: Int => Int, input: Int): Int = f(input)

  // ignore below too high level
  def combine2[A](f: A => A, input: A): A = f(input)


}


