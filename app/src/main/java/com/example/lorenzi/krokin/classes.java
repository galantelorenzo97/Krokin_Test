package com.example.lorenzi.krokin;

public class classes {
    private String cname;
    private String cdays;
    private String ctime;
    private String cprofessor;

    public classes(String cname, String cdays, String ctime, String cprofessor){
        this.cname = cname;
        this.cdays = cdays;
        this.ctime = ctime;
        this.cprofessor = cprofessor;
    }

    public void setName(String cname){
        this.cname = cname;
    }
    public void setDays(String cdays){
        this.cdays = cdays;
    }
    public void setTime(String ctime){
        this.ctime = ctime;
    }
    public void setProfessor(String cprofessor){
        this.cprofessor = cprofessor;
    }
    public String getName(){
        return cname;
    }
    public String getDays(){
        return cdays;
    }
    public String getTime(){
        return ctime;
    }
    public String getProfessor(){
        return cprofessor;
    }
}