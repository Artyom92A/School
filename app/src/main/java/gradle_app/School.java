package gradle_app;

import java.util.ArrayList;

public class School {
    public ArrayList<Teacher> teachers;
    public ArrayList<Student> students;

    public School(){
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    @Override
    public String toString(){
        return this.teachers.toString();
    }
}
