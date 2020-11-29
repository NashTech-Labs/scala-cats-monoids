import cats.Monoid

object MapReduceCollectionMonoid {
  def mapReduce[A, B](collection: Seq[A])(op: A => B)(implicit ev: Monoid[B]): B = {
    val instance = Monoid[B]
    collection.map(op).foldLeft(instance.empty)(instance.combine)
  }
}
