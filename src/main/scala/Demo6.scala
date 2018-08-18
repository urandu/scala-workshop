// nested functions
object Demo6 {
  def main(args: Array[String]): Unit = {

    println(min(2,3))
  }

  def min(x:Int,y:Int): Int ={
    def max(x:Int,y:Int) = {
      if (x>y)
        x
      else
        y
    }
    if(x >= max(x,y)) y else x
  }

}


