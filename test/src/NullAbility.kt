fun main(args: Array<String>) {

    var name : String = "Andrew"
    //name = null нельзя если не nullable
    var nullableName : String? = "Do I really exist?"
    var length = 0
    nullableName=null
    //null check
    if(nullableName != null) {
        length = nullableName.length
    } else {
        length=-1
    }
    println(length)

    val l = if(nullableName!=null) nullableName.length else -1

    //second method Safe Call Operator ?
    println(nullableName?.length)

    //Third method is Elvis Operator

    val len = nullableName?.length ?: -1 //if its a null then its a default value(-1)
    val noName = nullableName ?:"No one knows me..."

    println(noName)

    //!!
    println(nullableName!!.length) //use it then you know that is contains components

}