package classes

import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit

private class SimpleClass()
private class ClassWithPrimaryConstructor(var simpleClass: SimpleClass)
private class SimpleDataClass(val firstName: String, val lastName: String, val dateOfBirth: ZonedDateTime) {
    init {
        println("Class initialized with $firstName $lastName, age $age")
    }

    val age: Int
        get() = Period.between(dateOfBirth.toLocalDate(), ZonedDateTime.now().toLocalDate()).get(ChronoUnit.YEARS).toInt()
}

private class ClassWithRegularConstructor {
    var name: String;

    constructor(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    // Look! No new, just invoke, (), a class
    val simpleClass = SimpleClass()
    val classWithPrimaryConstructor = ClassWithPrimaryConstructor(simpleClass)
    classWithPrimaryConstructor.simpleClass = SimpleClass()
    val data = SimpleDataClass ("Donald", "Duck", ZonedDateTime.of(1934, 6, 9, 12, 0, 0, 0, ZoneId.systemDefault()))
    println("Class initialized with ${data.firstName} ${data.lastName}, age ${data.age}")
    ClassWithRegularConstructor("Some name")
}