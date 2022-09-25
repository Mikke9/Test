import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max: Int = readln().toInt()
    var num: Int = max
    var position: Int = 1
    var i: Int = 1
    var postition: Int = 1

    while(scanner.hasNextInt()) {
        i++
        num = scanner.nextInt()
        if (num > max) {
            max = num
            position = i
        }
    }
    print("$max $position")
}