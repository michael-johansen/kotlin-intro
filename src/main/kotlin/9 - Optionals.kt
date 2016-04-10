package optionals

import java.util.*

class Person(val name: String, val boss: Person? = null)

fun main(args: Array<String>) {
  val someBody = Person(
    "Want fries with that?",
    Person(
      "Who is in charge here?!?",
      Person(
        "I am pretty high in the chain",
        Person(
          "I am the boss"
        )
      )
    )
  )

  // Im not writhing the Java 7 version, because reasons...
  // Java 8 Optional as a library utility
  val java8 = Optional.of(someBody.boss)
    .map { it?.boss }
    .map { it?.boss }
    .map { it?.name }
    .orElse("Nobody")

  // Kotlin optional as a part of the language
  val kotlin = someBody.boss?.boss?.boss?.name ?: "Nobody"

  println("Java8: $java8")
  println("Kotlin: $kotlin")
}
