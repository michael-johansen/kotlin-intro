package todo

class TodoList(val list: List<Todo>) {
    constructor(vararg tasks: Todo) : this(listOf(* tasks))

    override fun toString(): String {
        return list.toString()
    }
}

class Todo(val description: String, val completed: Boolean = false) {
    override fun toString(): String {
        return "${if (completed ) '\u2713' else '\u2717'} $description"
    }
}

fun main(args: Array<String>) {
    val todoList = TodoList(
            Todo("Take out trash", true),
            Todo(description = "Clean dishes", completed = false),
            Todo(description = "Make presentation")
    )
    println(todoList)

    val completed = todoList.list.filter { it.completed }
    println(completed)
}