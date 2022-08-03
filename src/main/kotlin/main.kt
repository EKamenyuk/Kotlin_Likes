fun main() {
    val likes = 31  // изменяемая величина. количество лайков
    val result = likes % 10
    if (2 <= likes && likes <= 20) println("Понравилось " + likes + " человекам")
    else if (result == 1) println("Понравилось " + likes + " человеку")
    else println("Понравилось " + likes + " людям")
}


