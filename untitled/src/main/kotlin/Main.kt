fun main(args: Array<String>) {

    println(myFirstFunction("Wow, my first method in Kotlin"))

    val p1 = Person()
    p1.age = 31
    p1.name = "Elijah"
    p1.jobTitle = "Academic Fellow"

    println("My name is: " + p1.name)
    println("My age is: " + p1.age)
    println("My job title is: " + p1.jobTitle)

    val p2 = Person2("Elijah", 1, "Software Developer")

    println("My name is " + p2.name + ", and I am looking for a job as a " + p2.jobSeeking + ". " +
            "I have been coding for " + p2.yearsCoding + " year.")
    p2.learning("Kotlin")
    val myChild = Child()
    myChild.myMethod()

    val h1 = Human()
    h1.name = "Elijah"
    h1.age = 31
    h1.phoneNumber = "412-867-5309"
    h1.address = "55 Fake Street -- Pittsburgh, PA"

    h1.basicStats()
    h1.addressNNumber()

}
fun myFirstFunction(hello : String) = hello

class Person {
    var name = ""
    var age = 0
    var jobTitle = ""
}
class Person2(var name : String, var yearsCoding : Int, var jobSeeking : String) {

    fun learning(language : String){
        println("I am learning the coding language: $language")
    }

}

open class Parent {
    var x = "Let's learn about Inheritance in Kotlin"
}

class Child : Parent() {
    fun myMethod(){
        println(x)
    }
}