package chapter2

/**
  * The abstract definition of a person.
  */
sealed trait Person {
  val name: String
  val surname: String
  val age: Int
}

/**
  * A customer.
  */
case class Customer() extends Person {
  override val name = "C"
  override val surname = "D"
  override val age = 15
}

/**
  * A student.
  */
case class Student() extends Person {
  override val name = "B"
  override val surname = "A"
  override val age = 16
}

/**
  * A teacher.
  */
case class Teacher() extends Person {
  override val name = "A"
  override val surname = "Z"
  override val age = 29
}
