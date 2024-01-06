package Attendance;

import java.util.Date;

import User.Eit;

public class Track {
    
    //identify each transaction
    private Date datechecked;

    //the user who is performing the tracking
    private String id;

    //the user is checked in
    private Eit user;




    public Date getDatechecked() {
        return datechecked;
    }
    
        
    

    public Track(String id, Eit user) {
        this.id = id;
        this.user = user;
    }

    public void markAttendance (){

        this.datechecked = new Date();

    }
        
    

    
    


}
