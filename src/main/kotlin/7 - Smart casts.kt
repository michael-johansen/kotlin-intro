package smartcast

import java.util.*

fun iamsmart(input: Any): Any {
  return when (input) {
    is String  -> input.capitalize()
    is Int     -> input.plus(5)
    is Boolean -> input.not().not().or(input.not()).xor(input).not()
    else       -> {
      // we have no idea what this is
      input
    }
  }

}

fun main(args: Array<String>) {
  println(iamsmart("hello"))
  println(iamsmart(123))
  println(iamsmart(true))
  println(iamsmart(false))
  println(iamsmart(Date()))

  val reallyAString: Any = "i am a string"
  // if first check is true we know reallyAString is a String and may call String functions on it.
  if (reallyAString is String && reallyAString.contains("string")) {
    println(reallyAString.capitalize())
  }

}