fun main(args: Array<String>) {

    fun forceChoke(){
        println("some text")
    }
    forceChoke()

    fun makeAnEntrance(line: String){
        println(line)
    }
    makeAnEntrance("go away")

    fun calculateNumberGG(rebels: Int,ewoks: Int): Int{
        val gg =  rebels + ewoks
        return gg
    }
    val rbls=calculateNumberGG(5,7)
    println("Hey $rbls")
    println("Hey ${calculateNumberGG(5,7)}")

    fun vaderIsFeeling(mood: String = "angry"){
        println(mood)
    }
    vaderIsFeeling()
    vaderIsFeeling("happy")
}