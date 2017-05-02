package com.example.lorenzi.krokin;

/**
 * Created by Zero on 5/1/2017.
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

//
//public class signin {
//    public static void main(String[] args){
//        user student = new user("test", "password", 001);
//
//        String acc = JOptionPane.showInputDialog("ENTER YOUR USERNAME");
//
//        String test = student.getAcc();
//
//        if(acc.equals(student.getAcc())){
//            // NULL
//        }else{
//            JOptionPane.showMessageDialog(null, "INVALID USERNAME");
//            System.exit(0);
//        }
//
//        String pass = JOptionPane.showInputDialog("ENTER YOUR PASSWORD");
//
//        if(pass.equals(student.getPass())){
//            // NULL
//        }else{
//            JOptionPane.showMessageDialog(null, "INVALID PASSWORD");
//            System.exit(0);
//        }
//
//        System.out.println(student.getAcc() + " " + student.getPass() + " " + student.getID());
//    }
//}
//
//
//
//public class register {
//    public static void main(String[] args){
//        String acc = JOptionPane.showInputDialog("ENTER YOUR USERNAME");
//        String pass = JOptionPane.showInputDialog("ENTER YOUR PASSWORD");
//        int ID = 001;
//
//        user student = new user(acc, pass, ID);
//
//        System.out.println(student.getAcc() + " " + student.getPass() + " " + student.getID());
//    }
