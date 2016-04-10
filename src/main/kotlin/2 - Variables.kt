package variables

fun main(args: Array<String>) {
    var mutable = "No type is necessary"
    mutable = "and i'm mutable"

    var notNullable: String = "I can't be null"
    // notNullable = null // not legal
    var nullable: String?
    nullable = null //I can be null

    val value = "I'm final"
    // value = "" // not legal

    println("$mutable, $notNullable, $nullable, $value")
}