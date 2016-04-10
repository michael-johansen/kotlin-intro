package extensions

class Car(val type: String) {
  fun drive() = println("$type: Wrooom!")
}

// Because cars should be able to fly in 2015
fun Car.fly() = println("$type: Woosh!")

// Because java.lang.Integer needs this silly function
fun java.lang.Integer.largerThan5() = this > 5

fun main(args: Array<String>) {
  val car = Car("DeLorean")

  car.drive()
  car.fly()

  val six = Integer(6) // Explicit type because we want to use java.lang.Integer
  println("Is six largerThan5: ${six.largerThan5()}")
}
// Should we use this? It is meant as a replacement for all the Util/Helper classes we tend to write.