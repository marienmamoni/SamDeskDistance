import org.scalatest.funsuite.AnyFunSuite

class PlanningTest extends AnyFunSuite {

  test("Planning.distance is successful") {
    val list1 = List(3, 4, 2, 1, 3, 3)
    val list2 = List(4, 3, 5, 3, 9, 3)
    assert(Planning.distance(list1, list2) === Right(11))
  }

  test("Planning.distance has a size error") {
    val list1 = List(3, 4, 2, 1, 3, 3)
    val list2 = List(7, 3, 5, 3)
    assert(Planning.distance(list1, list2) === Left("An Error occurred: List sizes are not matching"))
  }

}
