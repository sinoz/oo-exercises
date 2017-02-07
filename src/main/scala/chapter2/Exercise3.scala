package chapter2

/**
  * An abstraction definition of a container that potentially holds an [[Int]] type.
  */
sealed trait ListInt {
  def iterate(f: Int => Unit): Unit
  def length(): Int
  def isEmpty: Boolean
  def map(f: Int => Int): ListInt
}

/**
  * A node container that holds an [[Int]] type.
  */
case class NodeInt(value: Int, tail: ListInt) extends ListInt {
  override def iterate(f: Int => Unit) = {
    f(value)
    tail.iterate(f)
  }

  override def length() =
    1 + tail.length()

  override def isEmpty = false

  override def map(f: (Int) => Int) = {
    NodeInt(f(value), tail.map(f))
  }
}

/**
  * An empty container that holds no [[Int]] value.
  */
case object EmptyInt extends ListInt {
  override def iterate(f: (Int) => Unit) = ()

  override def length() = 0

  override def isEmpty = true

  override def map(f: (Int) => Int) = this
}

/**
  * The main entry point to this program.
  *
  * @author I.A
  */
object Exercise3 extends App {
  val myList = NodeInt(2, NodeInt(3, NodeInt(4, EmptyInt)))

  // iterates through the chain of nodes print each value
  myList iterate { x => println(x) }

  // prints the length of the chain of nodes
  println(myList.length())

  // transforms each value and prints the end result after the transformation
  myList.map { x => x + 1 } iterate { x => println(x) }
}
