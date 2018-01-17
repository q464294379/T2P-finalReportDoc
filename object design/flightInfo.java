
/*
flightInfo allow customer or staff search flight and check flight status from
Ticket2Paradise Database by entering airline, departure, destination 
and date, or flightNumber.
*/
public class flightInfo {
    /*
    Ddate must not ealier than today
    Rdate must not earlier than Ddate
    departure must different from destination
    @invariant departure.equal(destination)==false
    */
    private String airline,departure,destination, 
            range, flightNumber, Ddate,Rdate,time,seatNumber,type; 
    private double price;

    //default constructor setting Ddate as today
    public flightInfo(){};

    /*@pre: airline must be choosen by user
    @post: airline is initialized from user choosen*/
    public void setAirline(String airline){};
    
    /*@pre depart date must be choosen by user
    @post Ddate is initialized from user choosen*/
    public void setDdate(){};
    
    /*@pre return date must be choosen by user
    @post Ddate is initialized from user choosen*/
    public void setRdate(){};
    
    //@post filght time is updated or choosen
    public void setTime(){};
    
    /*@pre departure city must be enter by user
    @post departure is initialized from user choosen*/
    public void setDeparture(String city){};
    
    /*@pre destination must be enter by user
    @post destination is initialized from user input*/
    public void setDestination(String city){};
    
    /*@pre range must be one choosen from domestic and international by user 
    @post range is initialized from user choosen*/
    public void setRange(String range){};
    
    /*@pre flight number must be entered by user 
    @post flightNumber is initialized from user input*/
    public void setFlightNumber(String flightNumber){};
    /*@pre flight number must be entered by user
    @post type of class(First,Economy,Bussiness) is initialized from user input
    */
    public void setType(String t){};
    /*@pre flight number must be entered by user 
    @post set the price fot this trip*/
    public void setPrice(double p){};
    /*pre flight number must be entered by user
    @post seat number is niitilized from user input */
    public void setSeaNumber(String sNumber){};
    
    //return airline name
    public String getAirline(){};
    
    //return depart date
    public String getDdate(){};
    
    //return returning date
    public String getRdate(){};
    
    //return flight time 
    public String getTime(){};
    
    //return departure city
    public String getDeparture(){};
    
    //return destination city
    public String getDestination(){};
    
    //return domestic or international
    public String getRange(){};
    
    //return flight number
    public String getFlightNumber(){};
    
    //return the price for this trip
    public double getPrice(){};
    
    //return seat number
    public String getseatNumber(){};
    
    
    /*search all possible departure flight information, assumed that it can access database
    @pre parameter needed: airline, Dday, Dmonth, Dyear, departure, destination, range 
    @post return flight information as a list of matched flight information*/
    public List searchFlightD(String airline,String Ddate,String 
            departure,String destination,String range){};
    
    /*search all possible returning flight information, assumed that it can access database
    @pre parameter needed: airline, Dday, Dmonth, Dyear, departure, destination, range 
    @post return flight information as a list of matched flight information*/
    public List searchFlightR(String airline,String 
            Rdate, String departure,String destination,String range){};
    
    /*search specific flight information, assumed that it can access database
    @pre parameter needed: airline, Dday, Dmonth, Dyear, flightNumber 
    @post return the specific flight information such as arrived, departed, 
    and on the way*/
    public String flightStatus(String airline,
            Stirng Ddate,String time,String flightNumber){};
}
