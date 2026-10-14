class University (student: Student) {
    val studentList = mutableListOf<Student>()

    fun findStudentById(sId: Int): Int? {
        if(sId in studentList){
            return studentList.indexOf(sId)
        }
        else
            return null
    }
}