package tech.miladsadeghi
package part1basics

object ValuesAndTypes {

  // Values:
  val meaningOfLife: Int = 42 // This is a constant value of type Int

  // Reassignment is not allowed for vals
  //  meaningOfLife = 45

  // Int is optional, Scala can infer the type
  val anInteger = 67 // type inference

  // Common types:
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aString: String = "Hello, Scala"
  val aInteger: Int = 123 // 4 bytes
  val aShort: Short = 12345 // 2 bytes
  val aLong: Long = 1234567890L // 8 bytes
  val aFloat: Float = 2.5f // 4 bytes
  val aDouble: Double = 3.14159 // 8 bytes

  def main(args: Array[String]): Unit = {
    print(meaningOfLife)
  }
}
