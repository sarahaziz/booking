package javaapplication3;
// Generated 12-Mar-2017 19:35:24 by Hibernate Tools 4.3.1



/**
 * Booking generated by hbm2java
 */
public class Booking  implements java.io.Serializable {


     private int bookingId;
     private Integer customerId;
     private Integer sessionId;
     private Integer sessionType;

    public Booking() {
    }

	
    public Booking(int bookingId) {
        this.bookingId = bookingId;
    }
    public Booking(int bookingId, Integer customerId, Integer sessionId, Integer sessionType) {
       this.bookingId = bookingId;
       this.customerId = customerId;
       this.sessionId = sessionId;
       this.sessionType = sessionType;
    }
   
    public int getBookingId() {
        return this.bookingId;
    }
    
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Integer getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }
    public Integer getSessionType() {
        return this.sessionType;
    }
    
    public void setSessionType(Integer sessionType) {
        this.sessionType = sessionType;
    }




}


