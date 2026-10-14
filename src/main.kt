fun main()
val University = University(newSt)
{
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
            University.add(newSt)
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
