/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reminder;

/**
 *
 * @author SiLPa
 */
class User {
    
    private int id;
    private String message,date,time;
    
    public User(int id, String message,String date,String time){
        
        this.id = id;
        this.message = message;
        this.date = date;
        this.time = time;
           
    }
    
    public int getid(){
        return id;
    }
    
    public String getmessage(){
        return message;
    }
    
    public String getdate(){
        return date;
    }
    
    public String gettime(){
        return time;
    }
}
