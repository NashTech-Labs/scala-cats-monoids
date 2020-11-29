import cats.Monoid

object CustomStringCollectionMonoid {
  def combineWithCustomMonoid(collection: Seq[String]): String = {

    implicit val customMonoid: Monoid[String] = new Monoid[String] {
      override def empty: String = "A collection of Strings:"

      override def combine(x: String, y: String): String = s"$x $y"
    }

    collection.foldLeft(customMonoid.empty)(customMonoid.combine)
  }
}
