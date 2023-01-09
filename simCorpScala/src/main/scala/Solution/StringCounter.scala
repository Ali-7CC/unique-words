package Solution

def uniqueWords(text: String): Map[String, Int] =
  if (text == null || text.isBlank()) then Map.empty else countWords(text.split(" ").toList, Map.empty)

def countWords(wordList: List[String], counts: Map[String, Int]): Map[String, Int] =
  wordList match
    case Nil          => counts
    case word :: rest => countWords(rest, insertWord(word, counts))

def insertWord(word: String, counts: Map[String, Int]): Map[String, Int] =
  val lowerCaseWord: String = word.toLowerCase()
  if counts.keySet.contains(lowerCaseWord) then
    val wordCount: Int = counts(lowerCaseWord)
    counts + (lowerCaseWord -> (wordCount + 1))
  else counts + (lowerCaseWord -> 1)
