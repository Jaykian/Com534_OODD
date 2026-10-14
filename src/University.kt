class University {
    val studentList = arrayListOf<Student>()

    fun addStudentList(){
        var i = 0
        while (true){
            print("Select a option 1: create student, 2:See students, 3:quit")
            val option = readln()
            if (option == "1") {
                print("Enter your name:")
                val name = readln()

                print("Enter your course :")
                val course = readln()

                print("Enter your Mark:")
                val mark = readln().toDouble()
                val newSt = Student(i, name, course,mark)
                i++
                studentList.add(newSt)
            }
            else if (option == "2") {
                for (student in studentList){
                    print(student)
                }
            }
            else if (option == "3") {
                break
            }
        }
    }
    fun findStudentById(sId: Int): Int? {

        if(sId in studentList){
            return studentList.indexOf(sId)
        }
        else
            return null
    }
}