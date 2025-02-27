
object Main extends App {

  val list1 = List(3, 4, 2, 1, 3, 3)
  val list2 = List(4, 3, 5, 3, 9, 3)
  val list3 = List(7, 3, 5, 3)
  println(s"Distance is: ${Planning.distance(list1, list2)}")
  println(s"Distance is: ${Planning.distance(list1, list3)}")
}
