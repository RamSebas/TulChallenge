import kotlin.io.*
import kotlin.text.*



fun maxValuePali(stringRepresentation: String, numberOfChange: Int): String {
    val charlength = stringRepresentation.toCharArray()
    val n = charlength.size
    val changeList = mutableListOf<Int>()
    var changes = 0

    for (i in 0 until n / 2) {
        val j = n - i - 1
        if (charlength[i] != charlength[j]) {
            val maxValue = maxOf(charlength[i], charlength[j])
            charlength[i] = maxValue
            charlength[j] = maxValue
            changeList.add(i)
            changes++
        }
    }

    if (changes > numberOfChange) {
        return "-1"
    }

    return String(charlength)




}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val stringRepresentation = first_multiple_input[0].toString()

    val numberOfChange = first_multiple_input[1].toInt()



    val result = maxValuePali(stringRepresentation, numberOfChange)

    println(result)
}
