object Demo3 {
  def main(args: Array[String]): Unit = {
    println(max(2,4))
  }
  def max (x:Int, y:Int ):Int = {
    val ten = if (x > y) x else y
    return ten
  }
}


