fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah","Luke","Han Solo")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder","Boba Fett" to "rocket asd")
    for (rebel in rebels){
        println("Name :$rebel")
    }
    for((key,value) in rebelVehicles){
        println("$key gets around in their $value")
    }

    var x = 10 //changable
    while (x > 0){
        println(x)
        x--
    }
}