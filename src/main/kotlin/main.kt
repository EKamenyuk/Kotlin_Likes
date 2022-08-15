fun printWord(likes: Int) {
  var textPeople = ""
    if ( likes % 10 == 1 || likes % 100 == 1) textPeople = "человеку "
    else if (likes < 2 && likes <= 20) textPeople = "людям"
    else textPeople = "человекам"
    println(" Понравилось $likes $textPeople")

}
fun main(args: Array<String>) {

    val likes = 16     // вводимая (изменяемая величина)
    printWord(likes)
}








