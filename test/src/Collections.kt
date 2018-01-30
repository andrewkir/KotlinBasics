fun main(args: Array<String>) {

    val imperials = listOf("Emperor","Darth Vader","Boba Fett") //cant modify
    println(imperials.sorted())
    println(imperials[0])
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials)

    val rebels = arrayListOf("Leiah","Luke","Han Solo") //CAN modify
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder") //cant change
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesnt exist"))
    println(rebelVehiclesMap.values) //or keys

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder","Boba Fett" to "rocket asd")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles

}