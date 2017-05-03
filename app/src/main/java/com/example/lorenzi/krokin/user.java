package com.example.lorenzi.krokin;

/**
 * Created by Jamie on 5/3/2017.
 */

public class user{
    private String acc;
    private String pass;
    private int ID;

    public user(String acc2, String pass2, int iD2) {
        acc = acc2;
        pass = pass2;
        iD2 = ID;
    }

    public void user(String acc,  String pass, int ID){
        this.acc = acc;
        this.pass = pass;
        this.ID = ID;
    }

    public void setAcc(String acc){
        this.acc = acc;
    }
    public String getAcc(){
        return acc;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public String getPass(){
        return pass;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
}