class Student(studentId: Int, studentName: String, courseName: String, studentMark: Double) {

    // Properties (attributes)

    val id: Int
    val name: String
    val course: String
    var mark: Double
    init {
        id = studentId
        name = studentName
        course = courseName
        mark = studentMark
    }
    override fun toString() : String {
        return "student Id: $id Name: $name Course Name: $course student mark: $mark"
    }
}