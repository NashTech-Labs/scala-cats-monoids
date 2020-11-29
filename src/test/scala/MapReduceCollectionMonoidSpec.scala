import cats.implicits._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MapReduceCollectionMonoidSpec extends AnyFlatSpec with Matchers {
  "MapReduceCollectionMonoid" should "perform operation on each string and then combine all new strings" in {
    val sequenceOfStrings: Seq[String] = Seq("Hey", "There")
    val finalString = "HeyHeyThereThere"
    assert(MapReduceCollectionMonoid.mapReduce(sequenceOfStrings)(_ * 2) == finalString)
  }

  it should "combine all numbers and then perform operation on result" in {
    val sequenceOfNumbers: Seq[Long] = Seq(1L, 2L, 3L)
    val finalNumber = 12
    assert(MapReduceCollectionMonoid.mapReduce(sequenceOfNumbers)(_ * 2) == finalNumber)
  }
}
