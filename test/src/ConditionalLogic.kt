fun main(args: Array<String>) {

    val a = 2
    val b = 3
    if (a == b){
        println("a = b")
    }
    if(a != b){
        println("a != b")
    }

    val accountBalance = 100
    val price = 50
    if(accountBalance >= price){
        println("You can buy this")
    }
    else{
        println("No, you cant buy it!")
    }

    val degrees = 49
    if(degrees >= 70){
        println("so hot here")
    } else if(degrees >= 50 && degrees <70){
        println("quite warm")
    } else {
        println("so cold outside")
    }

    val isHungry = false
    val isBored = true

    if(isHungry || isBored){
        println("Lets get pizza")
    }

    val x = 3
    when (x) { //switch
        1 ->  println("x == 1")
        2 ->  println("x == 2")
        else -> println("x !=1 && x != 2")
    }

    fun VaderIsFeeling(mood: String = "angry"){
        if(mood == "angry"){
            println("run away, Vader is $mood")
        } else {
            println("dont make him angry!")
        }
    }
    VaderIsFeeling("happy")

}