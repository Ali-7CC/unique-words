import scala.io.Source
import Solution.*

@main def main: Unit =
  val filePath = "src/main/resources/example.txt"
  val lines    = Source.fromFile(filePath).getLines.toList
  lines.foreach(line => println(uniqueWords(line)))