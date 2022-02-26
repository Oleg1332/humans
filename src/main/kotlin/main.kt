fun main() {

    val likes = 41
    val lastChar = likes % 10
    if (lastChar == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}