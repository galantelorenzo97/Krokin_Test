package com.example.lorenzi.krokin;

/**
 * Created by INKT on 5/13/2017.
 */

public class activities {
    String name;
    String days;
    String time;

    public activities(String name, String days, String time){
        this.name = name;
        this.days = days;
        this.time = time;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDays(String days){
        this.days = days;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getName(){
        return name;
    }
    public String getDays(){
        return days;
    }
    public String getTime(){
        return time;
    }
}
