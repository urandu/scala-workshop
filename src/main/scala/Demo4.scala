object Demo4 {
  def main(args: Array[String]): Unit = {
    println(max(2,4))
  }
  // max without return type
  def max (x:Int, y:Int ) = {
    val ten = if (x > y) x else y
    ten
  }
}


