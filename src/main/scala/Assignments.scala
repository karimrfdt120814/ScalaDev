object Assignments {
 def main(args: Array[String]): Unit = {

  val range = 1 to 100
  val a = 1 until 100

  println("*****************divisible by either 3 or 11 ***************")
  for (i <- a) {
   if (i % 3 == 0 || i % 11 == 0) {
    println(i)
   }
  }

  println("***************divisible by both 3 and 11 ******************************")
  for (i <- a) {
   if (i % 3 == 0 && i % 11 == 0) {
    println(i)
   }
  }
 }
}

