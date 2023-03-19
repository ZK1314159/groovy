package test

import java.time.LocalDateTime

class Test {

  static void main(args) {
//    println("Hello, Groovy")
    var number = 3;
//    println("$number")
    def integer = 4;
//    println("${integer}")
    int i = 2;
//    println("${i}333")
    int j = i + number;

    // list
    def roman = ["test", "day", "haha", "hate"]
//    println("${roman[2]}")
//    roman.each {string ->
//      println(string)
//    }
//    for (string in roman) {
//      println(string)
//    }
    var http = [
        100 : "nice",
        200 : "very",
        300 : "bad"
    ]
    assert http[300] == "bad"
    JavaTest javaTest = new JavaTest();
    var result = javaTest.compute(2, 3)
//    println(result)
//    javaTest.test()
//    println(javaTest.getName())
    def test = new Test();
//    test.function()
//    println(test.generateString())
    LocalDateTime localDateTime = LocalDateTime.now()
    println(localDateTime)
  }

  def function() {
    println("a simple groovy function")
  }

  String generateString() {
    return "string"
  }

}
