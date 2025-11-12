package tech.miladsadeghi
package part1basics

object Expressions {

  // Expressions are structures that can be evaluated to a value:
  val meaningOfLife: Int = 40 + 2
  //--------------------------------------------------------------------------------------------------------------------
  // Mathematical Expressions: +, -, *, /, bitwise & , | , ^ , << , >> , >>>
  private val mathExpression = (5 + 3) * 2
  //--------------------------------------------------------------------------------------------------------------------
  // Comparison Expressions: ==, !=, >, >=, <, <=
  private val isEqual = (5 + 3) == 8
  //--------------------------------------------------------------------------------------------------------------------
  // Boolean Expressions: &&, ||, !
  private val isTrue = !isEqual && (meaningOfLife > 40)
  //--------------------------------------------------------------------------------------------------------------------
  // Instruction vs. Expression
  // Instructions are commands that perform actions but do not return values.
  // Expressions return values and can be composed together.
  private val aCondition = true
  private val anIfExpression: Int = if (aCondition) 5 else 3
  //--------------------------------------------------------------------------------------------------------------------

  def main(args: Array[String]): Unit = {
    println(meaningOfLife)
    println(mathExpression)
    println(isEqual)
    println(isTrue)
    println(anIfExpression)
  }
}
