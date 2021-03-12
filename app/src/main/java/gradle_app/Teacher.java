package gradle_app;

import java.util.ArrayList;

public class Teacher implements Person{
    private int id;
    private String name;
    private ArrayList<Integer> courseList;
    private Specialization specialization;

    public Teacher(int id, String name, ArrayList<Integer> courseList, Specialization specialization){
        this.id = id;
        this.name = name;
        this.courseList = courseList;
        this.specialization = specialization;
    }

    @Override
    public String printCard() {
        return "I am teacher";
    }

    public void assignToCourse(int course){
        courseList.add(course);
    }

    @Override
    public String toString(){
        return id + " " + name;
    }
}
