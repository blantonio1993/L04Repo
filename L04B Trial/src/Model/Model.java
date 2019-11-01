package Model;

import java.util.ArrayList;
import java.util.Random;

public class Model {

    ArrayList<Student> students = new ArrayList<Student>();

    public Model() {
        //creates 3 students
        MailAddress addr1 = new MailAddress("107 W College Avenue", "State College", "PA", 16801);
        Student st1 = new Student("Emily", "Smith", 20, addr1);
        MailAddress addr2 = new MailAddress("200 W College Avenue", "State College", "PA", 16801);
        Student st2 = new Student("Mary", "Doe", 20, addr2);
        MailAddress addr3 = new MailAddress("300 W College Avenue", "State College", "PA", 16801);
        Student st3 = new Student("John", "Doe", 20, addr3);
        //add them to the array of students
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public ArrayList<Student> getStudents() {
        return (students);
    }

    public void randomGPA() {
        for (Student student: this.students){
            Random random = new Random();
            double number = random.nextInt(4) + random.nextDouble();
            number = Math.round(number * 100);
            number = number / 100;
            student.creditsThisSemester();

        }
    }
}








