package functions

// Function without a class
fun firstLevelFunction() {
}

fun functionWithReturnValue(): Int {
  return 5
}

fun functionWithoutBody(): Int = 5
fun voidFunction(): Unit = println()

// Type is specified after parameter name
fun parameters(text: String) {
  println(text)
}

fun namedParameters(prefix: String, text: String, suffix: String) {
  parameters(prefix + text + suffix)
}

fun defaultValues(prefix: String = "prefix",
                  text: String,
                  suffix: String = "suffix") {
  namedParameters(prefix, text, suffix)
}

fun vararg(vararg args: String) {
  // Lambdas can be specified by square brackets, "it" is default argument name
  args.forEach { println(it) }
}

private class ClassWithFunction {
  fun functionInsideClass() {
    println("Woho")
  }
}

// also a first level function
fun main(args: Array<String>) {
  firstLevelFunction()
  functionWithReturnValue()
  functionWithoutBody()
  voidFunction()
  parameters("Hello everybody!")
  namedParameters(prefix = "prefix", suffix = "suffix", text = "text")
  defaultValues(text = "text")
  vararg("A", "B", "C")
  ClassWithFunction().functionInsideClass()
}