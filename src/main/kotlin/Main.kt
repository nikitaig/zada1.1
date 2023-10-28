fun main() {
    fun zad1(string: String): String {
        var r = ""
        var count = 1
        var n = 1
        var d = string[0]
        for (i in string.substring(1)) {
            n++
            if (d != i || n == string.length) {
                if (count > 1) {
                    r += "$d$count"
                } else {
                    r += d
                }
                count = 1
                d = i
            } else {
                count++
            }
        }
        return r
    }

    println(zad1(readln()))
}