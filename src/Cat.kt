class Cat (nameIn: String, ageIn: Int, weightIn: Int) {

    // Properties (attributes)
    val name: String
    var age: Int
    var weight: Int

    // Init block, for performing tasks on creation of the object
    init {
        name = nameIn
        age = ageIn
        weight = weightIn
    }

    fun walk() {
        weight--
    }
    fun eat(){
        weight++
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}