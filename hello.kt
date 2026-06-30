class Car {
    var company: String = ""
    var model: String = ""
    var topSpeed: Int = 0

    fun addCar(company: String, model: String, topSpeed: Int) {
        this.company = company
        this.model = model
        this.topSpeed = topSpeed
    }
}

fun main() {
    var newCar: Car = Car()

    newCar.addCar("Bugatti", "V8", 244)
    println("new update")
    println("new update from new branch")
    println(newCar.company)
    println(newCar.model)
    println(newCar.topSpeed)
}