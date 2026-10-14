class Student(protected val studentId: Int, protected var name: String,  protected val courseName: String, protected var studentMark: Double) {

    // Properties (attributes)


    val course: String
    var mark: Double

    init {
        course = courseName
        mark = studentMark
    }
    override fun toString() : String {
        return "student Id: $studentId Name: $name Course Name: $course student mark: $mark"
    }
    fun getGrade() : String {
        val degree = when(mark) {
            in 70.0..100.0 -> "First" // Return "First" when grade is "A"
            in 60.0..69.0 -> "2.1" // Return "2.1" when grade is "B"
            in 50.0..59.0 -> "2.2"
            in 40.0..49.0 -> "Third"
            in 0.0..39.0 -> "Fail"
            else -> "Invalid grade $mark."
        }
        return degree
    }

    fun didPass(): Boolean
    {
        if(mark > 40.0) {
            return true
        }
        return false
    }

}