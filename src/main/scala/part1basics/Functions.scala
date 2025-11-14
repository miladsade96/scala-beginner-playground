package tech.miladsadeghi
package part1basics

object Functions {

  // A function is a reusable block of code that takes some inputs and produces an output.
  // In Scala, functions are first-class citizens, meaning they can be assigned to variables,
  // passed as arguments to other functions, and returned from other functions.
  private def aFunction(a: String, b: Int): String = {
    a + " " + b // one expression
  }

  // Function invocation
  private val aFunctionInvocation: String = aFunction("Hello", 3) // "Hello 3"

  // Function with no arguments
  private def aNoArgFunction(): Int = 42

  // Parameterless function can be called without parentheses
  private def aParameterlessFunction: Int = 42

  // Functions can be recursive
  private def stringConcatenation(str: String, n: Int): String = {
    if (n == 0) ""
    else if (n == 1) str
    else str + stringConcatenation(str, n - 1)
  }

  // A void function (Unit return type)
  private def aVoidFunction(): Unit = {
    println("This function returns Unit")
  }

  def main(args: Array[String]): Unit = {
    println("aFunctionInvocation: " + aFunctionInvocation)
    println("aNoArgFunction: " + aNoArgFunction())
    println("aParameterlessFunction: " + aParameterlessFunction)
    println("stringConcatenation: " + stringConcatenation("Scala", 3))
    aVoidFunction()
  }
}
