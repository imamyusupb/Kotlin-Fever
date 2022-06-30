package dico_kotlin.fundamental

fun main() {
    var buah: String = "semangka"
    buah = "Jeruk"
    println(buah)

    val motor :String= "Cbr"
//    motor = "Motor Beat "   Val Cannot be reassigned
    val firstName = "Imam"
    var middleName = "Yusup"
    val lastName = "Bachtiar"
    val fullName = "$firstName $middleName $lastName"
    println(fullName)

    val bilanganA = 20
    val bilanganB = bilanganA + 5 // menjadi 25
    val bilanganC = bilanganB -bilanganA + 5 // menjadi 10

    val sumBilangan ="Hasilnya adalah: ${bilanganA + bilanganB +bilanganC}"
    println(sumBilangan)

}