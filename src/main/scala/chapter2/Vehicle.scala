package chapter2

/**
  * An abstract definition of a vehicle.
  */
sealed trait Vehicle {
  /**
    * Loads this vehicle with the given type of [[Fuel]].
    */
  def loadFuel(fuel: Fuel): Unit

  /**
    * Moves this vehicle. Returns whether there is enough fuel or not.
    */
  def move(): Boolean
}

/**
  * An abstraction definition of fuel necessary for a [[Vehicle]].
  */
sealed trait Fuel

/**
  * A car.
  */
case class Car() extends Vehicle {
  override def loadFuel(fuel: Fuel) = {
    if (fuel.isInstanceOf[Gasoline]) {
      // TODO
    }
  }

  override def move() =
    true // TODO
}

/**
  * A truck.
  */
case class Truck() extends Vehicle {
  override def loadFuel(fuel: Fuel) = {
    if (fuel.isInstanceOf[Diesel]) {
      // TODO
    }
  }

  override def move() =
    true // TODO
}

/**
  * An enterprise.
  */
case class Enterprise() extends Vehicle {
  override def loadFuel(fuel: Fuel) = {
    if (fuel.isInstanceOf[Enterprise]) {
      // TODO
    }
  }

  override def move() =
    true // TODO
}

/**
  * The gasoline type of [[Fuel]].
  */
case class Gasoline() extends Fuel

/**
  * A diesel type of [[Fuel]].
  */
case class Diesel() extends Fuel

/**
  * A delithium type of [[Fuel]].
  */
case class Dilithium() extends Fuel

/**
  * The main entry point to this program.
  *
  * @author I.A
  */
object Main extends App {
  val vehicles = Seq(Car(), Truck(), Enterprise())

  // TODO
}