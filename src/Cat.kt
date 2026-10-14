class Cat (nameIn: String, ageIn: Int, weightIn: Int) {

    // Properties (attributes)
    val name: String = nameIn
    var age: Int
    var weight: Int

    // Init block, for performing tasks on creation of the object
    init {
        age = ageIn
        weight = weightIn
    }

    fun walk(walkDis: Int) {
        weight -= walkDis
    }
    fun eat(eatAmt: Int): Boolean
    {
        if (weight <= 19) {
            weight += eatAmt
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}