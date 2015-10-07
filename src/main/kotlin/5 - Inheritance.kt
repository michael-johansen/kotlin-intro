package inheritance

// Similar to java
interface Shape {
    fun area(): Float
}

// Both extends and implements is expressed with :
class Circle(val radius: Float) : Shape {
    override fun area(): Float {
        return Math.PI.toFloat() * radius * radius
    }
}

// Classes are by default final, and must be opened to be extensible
open class Rectangle(val width: Float, val height: Float) : Shape {
    override fun area(): Float = width * height
}

class Square(val side: Float) : Rectangle(side, side)

fun main(args: Array<String>) {
    val shapes: List<Shape> = listOf(
            Circle(2f),
            Rectangle(3f, 6f),
            Square(5f)
    )
    shapes.forEach { println("${it.javaClass.simpleName}: ${it.area()}") }
}