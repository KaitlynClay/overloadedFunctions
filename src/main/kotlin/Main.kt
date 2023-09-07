fun main(args: Array<String>) {
    println("Please enter the number of your choice: ")
    println("1. Residential Customer")
    println("2. Business Customer")
    var userInput = readln()!!.toString()
    if (userInput == "1"){
        print("What is your name: ")
        var name= readln()!!.toString()
        print("What is your number: ")
        var num = readln()!!.toString()
        val funct = customerInfo(name, num)
    } else if (userInput == "2"){
        print("What is the name of your business: ")
        var bname: String = readln()!!.toString()
        print("What is your contact name: ")
        var name: String = readln()!!.toString()
        print("What is your number: ")
        var num: String = readln()!!.toString()
        val funct = customerInfo(name, num, bname)
    } else {
        print("Not an option, please try again.")
    }

}

fun customerInfo(
    name: String = "",
    num: String = "",
    bname: String = ""
): String {
    println("Business Name: $bname")
    println("Contact Name: $name")
    println("Number: $num")
    return name + num + bname
}

fun customerInfo(
    name: String = "",
    num: String = ""
): String {
    println("Name: $name")
    println("Number: $num")
    return name + num
}


