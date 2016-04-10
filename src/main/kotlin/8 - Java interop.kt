package interop

import java.time.LocalDate
import java.time.Month


fun main(args: Array<String>) {
  // Person is java class
  val person = Person("Michael",
                      "Johansen",
                      LocalDate.of(1983, Month.NOVEMBER, 11))

  println(person) // Michael Johansen (31)

  person.lastName = "Jordan"
  person.dateOfBirth = LocalDate.of(1963, Month.FEBRUARY, 17)
  // This won't work, no setter
  // person.age = 2

  println(person) // Michael Jordan (52)
}
