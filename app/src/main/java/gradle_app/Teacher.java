package gradle_app;

import java.util.ArrayList;

public class Teacher {
    private int id;
    private String name;
    private ArrayList<Integer> courseList;
    public Teacher(int id, String name, ArrayList<Integer> courseList){
        this.id = id;
        this.name = name;
        this.courseList = courseList;
    }
    @Override
    public String toString(){
        return id + " " + name;
    }
}
