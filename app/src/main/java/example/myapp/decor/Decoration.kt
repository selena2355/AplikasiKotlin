package example.myapp.decor

data class Decoration (val rocks:String){
    init {
        println("---------------------")
        println("aquarium initializing")
    }
}
data class Decoration2(val rocks: String, val wood: String, val diver: String){
    init {
        println("---------------------")
        println("aquarium initializing")
    }
}
fun makeDecorations() {

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration1 = Decoration ("granite")
    println(decoration1)
    println(decoration1==decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)
    println(decoration3 == decoration2)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
    println("---------------------")
}

enum class Direction(val degrees: Int) {
    EAST(90)
}
fun main(){
    makeDecorations()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}