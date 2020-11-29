import cats.implicits._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CollectionMonoidSpec extends AnyFlatSpec with Matchers {
  "CollectionMonoid" should "combine all strings" in {
    val sequenceOfStrings: Seq[String] = Seq("Welcome", "To", "The", "World", "Of", "Programming")
    val finalString = "WelcomeToTheWorldOfProgramming"
    assert(CollectionMonoid.combineAll(sequenceOfStrings) == finalString)
  }

  it should "combine all numbers" in {
    val sequenceOfNumbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
    val finalNumber = 15
    assert(CollectionMonoid.combineAll(sequenceOfNumbers) == finalNumber)
  }
}
