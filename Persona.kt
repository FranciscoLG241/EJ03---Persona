


open class Persona(val nombre: String, private var edad: Int) {

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        require(edad >= 0) { "La edad debe de ser mayor o igual a 0" }
    }



    fun cumple() {
        edad++
    }


    fun mostrarEdad(): Int {
        return edad
    }



    open fun actividad(): String {
        return "$nombre está realizando una actividad."
    }



    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }
}





class Estudiante(nombre: String, edad: Int, private val carrera: String) : Persona(nombre, edad) {

    override fun actividad(): String {
        return "$nombre está estudiando la carrera de $carrera."
    }

    override fun toString(): String {
        return super.toString() + ", carrera = $carrera"
    }
}





fun main() {

    try {
        val persona = Persona("Lucía", 21)
        println(persona)
        persona.cumple()
        println("Después de su cumpleaños: ${persona}")

        println(persona.actividad())

        val estudiante = Estudiante("Pedro", 19, "Ingeniería en Software")
        println(estudiante)
        println(estudiante.actividad())

        val estudianteInvalido = Estudiante("Ana", -5, "Medicina")

    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
