object HelloWorld {

  import org.apache.spark.SparkContext

  object persistdemo {
    def main(args: Array[String]): Unit = {
      val name = "Alice"
      val age = 30
      val message = s"My name is $name and I'm $age years old."
      println(message) // Output: My name is Alice and I'm 30 years old
    }

  }
}
