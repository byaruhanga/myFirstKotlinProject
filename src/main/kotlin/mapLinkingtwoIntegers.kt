
fun main() {
    val groupA = listOf("a", "b", "c", "d", "e", "a", "g", "r", "f")
    val groupB = listOf("ant", "bee", "elephant", "dog", "cat")

    val resultMap = mutableMapOf<Char, Pair<List<String>, List<String>>>()

    for (element in groupA) {
        val firstChar = element[0]
        val pair = resultMap[firstChar] ?: Pair(emptyList(), emptyList())
        resultMap[firstChar] = pair.copy(first = pair.first + element)
    }

    for (element in groupB) {
        val firstChar = element[0]
        val pair = resultMap[firstChar] ?: Pair(emptyList(), emptyList())
        resultMap[firstChar] = pair.copy(second = pair.second + element)
    }

    println("Map linking the two groups using their first characters:")
    for ((key, value) in resultMap) {
        println("Key: $key, Group A: ${value.first}, Group B: ${value.second}")
    }
}
