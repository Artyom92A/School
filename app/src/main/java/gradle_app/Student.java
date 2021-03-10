package gradle_app;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList <Integer> courseList;
    public Student(int id, String name, ArrayList <Integer> courseList)
    {
        this.id = id;
        this.name = name;
        this.courseList = courseList;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getCourseList() {
        return courseList;
    }
    public int getCourseCount(){
        return courseList.size();
    }

    public void enroll(int courseId)
    {
       courseList.add(courseId);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + courseList.toString();
    }
}
