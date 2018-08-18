// function composition
object Composition {

  def main(args: Array[String]): Unit = {
    println("square:" + square(3))
    println("cube:" + cube(3))
    println("combine square:" + combine(x => x * x, input = 3))
    println("combine cubed" + combine(x => x * x * x, input = 3))

    println("combine square:" + combine(x => square(x), input = 3))
    println("combine cubed" + combine(x => x * x * x, input = 3))
  }

  def square(n: Int): Int = {
    n * n
  }

  def cube(n: Int): Int = {
    n * square(n)
  }

  def combine(f: Int => Int, input: Int): Int = f(input)

  // ignore below too high level
  def combine2[A](f: A => A, input: A): A = f(input)

  def compose(f: Int => Int, g: Int => Int, input: Int): Int = g(f(input))

}


