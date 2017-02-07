package chapter2

/**
  * An abstract definition of an animal that can say something.
  */
sealed trait Animal {
  def saySomething(): Unit
}

/**
  * A dog.
  */
case class Dog() extends Animal {
  override def saySomething() =
    println("Bao")
}

/**
  * A cat.
  */
case class Cat() extends Animal {
  override def saySomething() =
    println("Miaow")
}

/**
  * A cow.
  */
case class Cow() extends Animal {
  override def saySomething() =
    println("Muuu...")
}

/**
  * The main entry point to this program.
  *
  * @author I.A
  */
object Main extends App {
  val dog = Dog()
  val cat = Cat()
  val cow = Cow()

  dog.saySomething()
  cat.saySomething()
  cow.saySomething()
}
