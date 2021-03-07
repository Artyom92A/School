package gradle_app;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList <Integer> cursList;
    public Student(int id, String name, ArrayList <Integer> cursList)
    {
        this.id = id;
        this.name = name;
        this.cursList = cursList;
    }
    @Override
    public String toString(){
        return id + " " + name;
    }
}
