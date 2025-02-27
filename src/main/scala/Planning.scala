
object Planning {

  def distance(list1: List[Int], list2:List[Int]): Either[String, Int] = {
    if(list1.size != list2.size) {
      Left("An Error occurred: List sizes are not matching")
    } else {
      val distance = list1.sorted.zip(list2.sorted)
        .map{ case (num1, num2) =>
          Math.abs(num1 - num2)
        }.sum
      Right(distance)
    }
  }
}
