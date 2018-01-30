fun main(args: Array<String>) {
    val str = "May the force be with you"
    //println(str)

    val str1 = "I say that \"A joke\" \t \n \b rly funny!" //b-backspace r-delete left side
    println(str1)

    val rawCrawl = """|A long time ago,
    |in a galaxy
    |far,far,away...""".trimMargin() //прижимает к левомоу краю
    println(rawCrawl)
//    for (char in str){
//        println(char)
//    }
    val contentEquals = str.contentEquals("May the force be with you")
    println(contentEquals)

    val contains = str.contains("Force", false) //true or false больш или мал буквы
    println(contains)

    val uppercase = str.toUpperCase()
    val losercase = str.toLowerCase()

    println(uppercase)
    println(losercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13) //с ... по ... оставляет только это
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightsaber = "green"
    val vehicle = "landspeeder"

    println("$luke has a $lightsaber lightsaber and drives a $vehicle")
    println("Lukes full name $luke has ${luke.length} chars")
}