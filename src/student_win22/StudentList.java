
package student_win22;

public class StudentList {
    public static void main (String[] args){
        Student[] studentList = new Student[3];
        studentList[0] = new Student("s1", "Ronak");
        studentList[1] = new Student("s2", "John");
        studentList[2] = new Student("s3", "Amir");
        
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getStudentName());
        }
    }

}
