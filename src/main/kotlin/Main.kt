import java.util.Calendar
import java.util.Random

class Aqurium (var width:Int = 30, var height : Int = 40, var length : Int = 100){
    var volume : Int
    get() = width* height* length / 1000
    set(value){height = (value * 1000)/ (width * height) }

    constructor(numberOfFish : Int) : this() {
        val water : Int = numberOfFish * 2000
        val tank : Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}
fun main(args: Array<String>) {
//    when (daysOfTheWeek()){
//        1 -> println("Monday")
//        2 -> println("Tuesday")
//        3 -> println("Wednesday")
//        4 -> println("Thursday")
//        5 -> println("Friday")
//        6 -> println("Saturday")
//        7 -> println("Sunday")
//    }
//println(feedFish())


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

//    New update
//    println("Enter Your Birth date:\t")
//    val birthdate : String =  readln()
//    for( result in getFortuneCookies().){
//
//    }
//    println("My birthdate is $birthdate and my fortune is ${getFortuneCookies()}")
    buildAquarium()



}
fun buildAquarium(){
    val myaquariam = Aqurium()
    println(
        "length: ${myaquariam.length}" +
                "width: ${myaquariam.height}"+
                "length: ${myaquariam.length}"
    )
    myaquariam.length = 50
    println("new length: ${myaquariam.length}")

    val mysmallaquarium = Aqurium(13,30,20)
    println(
        "length: ${mysmallaquarium.length}" +
                "width: ${mysmallaquarium.height}"+
                "length: ${mysmallaquarium.length}"
    )
    val fishNumber = Aqurium(numberOfFish = 7)
//        println("num")
    println(
        "small Aquarium 2 ${fishNumber.volume} with" +
                "length ${fishNumber.length}" +
                "width ${fishNumber.width}" +
                "height ${fishNumber.height}"
    )


}

fun daysOfTheWeek(): Int {
    return Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
}
fun feedFish(): String {
    val food  = "pellets"
    return ("Today is ${randomDay()} and the fish eat $food")
}
fun randomDay() : String{
    var days  = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return  days[Random().nextInt(7)]
}

fun getFortuneCookies(): String{
    val fortunes = listOf("You will have a great day!","Things will go well for you today.","Enjoy a wonderful day of success.","Be humble and all will turn out well.","Today is a good day for exercising restraint.","Take it easy and enjoy life!","Treasure your friends because they are your greatest fortune.")
    return  fortunes[Random().nextInt(7)]

}