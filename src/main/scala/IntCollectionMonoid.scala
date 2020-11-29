import cats.Monoid

object IntCollectionMonoid {
  def combineInts(collection: Seq[Int]): Int = {
    collection.foldLeft(Monoid[Int].empty)(Monoid[Int].combine)
  }
}
