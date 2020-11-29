import cats.implicits._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class IntCollectionMonoidSpec extends AnyFlatSpec with Matchers {
  "IntCollectionMonoid" should "combine all numbers" in {
    val sequenceOfNumbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
    val finalNumber = 15
    assert(IntCollectionMonoid.combineInts(sequenceOfNumbers) == finalNumber)
  }
}
