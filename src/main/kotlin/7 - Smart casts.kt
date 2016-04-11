package smartcast

import java.util.*

fun iAmSmart(input: Any): Any {
  return when (input) {
    is String  -> input.capitalize()
    is Int     -> input + 5
    is Boolean -> input.not().not().or(input.not()).xor(input).not()
    else       -> {
      // we have no idea what this is
      input
    }
  }

}

fun main(args: Array<String>) {
  println(iAmSmart("hello"))
  println(iAmSmart(123))
  println(iAmSmart(true))
  println(iAmSmart(false))
  println(iAmSmart(Date()))

  val reallyAString: Any = "i am a string"
  // if first check is true we know reallyAString is a String and may call String functions on it.
  if (reallyAString is String && reallyAString.contains("string")) {
    println(reallyAString.capitalize())
  }

}