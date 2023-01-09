import Solution.*
import org.scalatest.funsuite.AnyFunSuite

class StringCounterTests extends AnyFunSuite :
  test("'insertWord' should add new words to the counts map") {
    val counts: Map[String, Int] = Map("hello" -> 1)
    val result = insertWord("World", counts)
    val expected = Map("hello" -> 1, "world" -> 1)
    assert(result ==  expected)
  }

  test("'insertWord' should add existing words to the counts map") {
    val counts: Map[String, Int] = Map("hello" -> 1, "world" -> 1)
    val result = insertWord("world", counts)
    val expected = Map("hello" -> 1, "world" -> 2)
    assert(result ==  expected)
  }

  test("'countWords' should count all the words in a list") {
    val counts: Map[String, Int] = Map("hello" -> 1, "world" -> 1)
    val words = List("Hello", "again", "my", "name", "is", "is", "Ali")
    val result = countWords(words, counts)
    val expected = Map("hello" -> 2, "world" -> 1, "again" -> 1, "my" -> 1, "name" -> 1, "is" -> 2, "ali" -> 1)
    assert(result ==  expected)
  }


  test("'uniqueWords' should count all the words in a string") {
    val text = "Hello hello my name is is ali ali hello"
    val result = uniqueWords(text)
    val expected = Map("hello" -> 3, "my" -> 1, "name" -> 1, "is" -> 2, "ali" -> 2)
    assert(result ==  expected)
  }

  test("'uniqueWords' should discard an empty string") {
    val text = ""
    val result = uniqueWords(text)
    val expected = Map.empty
    assert(result ==  expected)
  }

  test("'uniqueWords' should discard a blank string") {
    val text = " "
    val result = uniqueWords(text)
    val expected = Map.empty
    assert(result ==  expected)
  }

  test("'uniqueWords' should discard null values") {
    val text = null
    val result = uniqueWords(text)
    val expected = Map.empty
    assert(result ==  expected)
  }


end StringCounterTests
