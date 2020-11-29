import cats.Monoid

object CollectionMonoid {
  // Monoid is used here to write generic method for combining elements
  def combineAll[A](collection: Seq[A])(implicit ev: Monoid[A]): A = {
    val monoid = Monoid[A]
    collection.foldLeft(monoid.empty)(monoid.combine)
  }
}
