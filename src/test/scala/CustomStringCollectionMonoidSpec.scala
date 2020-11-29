import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CustomStringCollectionMonoidSpec extends AnyFlatSpec with Matchers {
  "CustomStringCollectionMonoid" should "combine all strings with custom implementation of empty and combine methods" in {
    val sequenceOfStrings: Seq[String] = Seq("One", "Two", "Three", "Four", "Five")
    val finalString = "A collection of Strings: One Two Three Four Five"
    assert(CustomStringCollectionMonoid.combineWithCustomMonoid(sequenceOfStrings) == finalString)
  }
}
