fun main(args: Array<String>) {
    val printMesasge = {message: String -> println(message)}

//    fun printMessage(message: String){
//        println(message)
//    }
    printMesasge("Hello world!")

    val sumA = {a:Int,b:Int -> a+b}
    println(sumA(5,9))

    val sumB : (Int, Int) -> Int = {x,y -> x+y} //пример другой записи

    fun downloadData(url:String, completion: ()->Unit){ //Unit == Void
        //sent a download request
        //we got back data
        //there no networks errors
        completion()
    }
    downloadData("fakeUrl.com",{
        println("The code in this block, will only run after the completion")
    })

    fun downloadCarData(url:String, completion: (Car)->Unit){
        //send download request
        //we got back car data
        val car = Car("Tesla","ModelX","Blue")
        completion(car)
    }
    downloadCarData("fakeUrls.com"){ car ->
        println(car.color)
        println(car.make)
    }

    //если один параметр
    downloadCarData("fakeUrls.com"){
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url:String, completion: (Truck?, Boolean) -> Unit){
        //make the web request
        //we get the result back
        val  webRequestSuccess = true
        if(webRequestSuccess){
            //recieved truck data
            val truck = Truck("Ford","f-150",10000)
            completion(truck,true)
        } else {
            completion(null, false)
        }
    }
    downloadTruckData("fakeurl.com"){ truck, succes ->
        if(succes){
            //do something
            truck?.tow()
        } else {
            //error
            println("Something went wrong")
        }

    }
}