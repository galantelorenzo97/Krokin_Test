package com.example.lorenzi.krokin;

/**
 * Created by Lorenzi on 4/25/2017.
 */

public class Class {

    String className;
    String timeAndDay;
    String officeHours;
    String classRoom;
    String professorName;

    Class (String className, String timeAndDay, String officeHours, String classRoom, String professorName)
    {
        this.className = className;
        this.timeAndDay = timeAndDay;
        this.officeHours = officeHours;
        this.classRoom = classRoom;
        this.professorName = professorName;
    }

    public void setClassName(String newClassName)
    {
        this.className = newClassName;
    }

    public void setTimeAndDay(String timeAndDay)
    {
        this.timeAndDay = timeAndDay;
    }

    public void setOfficeHours(String officeHours)
    {
        this.officeHours = officeHours;
    }

    public void setClassRoom(String classRoom)
    {
        this.classRoom = classRoom;
    }

    public void setProfessorName(String professorName)
    {
        this.professorName = professorName;
    }

    public String getClassName()
    {
        return className;
    }

    public String getTimeAndDay()
    {
        return timeAndDay;
    }

    public String getOfficeHours()
    {
        return officeHours;
    }

    public String getClassRoom()
    {
        return classRoom;
    }

    public String getProfessorName()
    {
        return professorName;
    }
}
