
//class Car(val make: String, val model: String, var color: String) {
//
//    fun accelerate(){
//        println("vroom vroom")
//    }
//
//    fun details(){
//        println("This is a $color $make $model")
//    }
//}
//class Truck(val make: String, val model: String, val towingCapacity: Int){
//    fun tow(){
//        println("taking the horses to the rodeo")
//    }
//    fun details(){
//        println("The $make $model has towing capacity of $towingCapacity lbs")
//    }
//}

open class Vehicle(val make: String, val model:String){ //по умолчанию класс final
    open fun accelerate(){ //allow to override
        println("vroom vroom")
    }
    fun park(){
        println("parking")
    }
    fun brake(){
        println("STOP")
    }
}
class Car(make: String,model: String, var color:String) : Vehicle(make,model){
    override fun accelerate() {
        println("bzz bzz")
        super.accelerate() //делает и то и то
    }
}

class Truck(make:String,model: String, val towingcapacity:Int) : Vehicle(make,model){
    fun tow(){
        println("headed out to the mountains!")
    }
}

fun main(args: Array<String>) {
    val tesla = Car("Tesla","ModelS","Red")
    tesla.accelerate() //методы наследуются
    val truck = Truck("Ford","F-150",10000)
    truck.brake()
    truck.tow()
//    val car = Car("Subaru", "Outback","Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//    val truck = Truck("Ford","F-150",towingCapacity = 10000)
//    truck.tow()
//    truck.details()
}