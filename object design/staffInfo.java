/** 
 * staffInfo manipulates information for the staff and also all the 
 * methods that staff may use.including update the database, 
 * search for the customer including flight 
 * information and personal information
 * and changes that is proposed by the customer.
 */
public class staffInfo extends acctInfo{
   /** 
    * initiate an object acctInfo that contains all the information for staff
    */ 
    private acctInfo newStaff;
    /** 
    * initiate a string variable that contains agent number
    */ 
    private String agentNum;
    /** 
     * a constructor that has parameter acctInfo and number as agent number
    */  
    public staffInfo(acctInfo person, String number){    
    }
    /** a getter that gets the value of the agent number
    @post returns agent number 
    */  
    public String getAgentNum(){
    }
    /** a setter that sets the value of the agent number
    @post agentNum is updated
    */  
    public void setAgentNum(String number){
    }
    /** this method changes the previous information to the new 
     * information in the database
    @pre  update button is selected
    @post information is updated base on user's new input
    */  
    public void changes(acctInfo oldInfo, acctInfo newInfo){}
    /** this method changes the previous information to the new 
     * information in the database
    @pre  update button is selected
    @post information is updated base on user's new input
    */  
    public void message(){}
    /** this method deletes message that is selected 
    @pre  delete button is selected
    @post message is deleted and the database is updated
    */  
    public void deleteMessage(){}
    /** method that looks up for the booking history base 
     * on the name is provided
    @pre  BookingHistory button is selected
    @post formatted string that includes all the booking history is returned 
    */    
    public String bookingHistory(acctInfo name){
    }
    /** method that searches information for the customer
    @pre  search button is selected
    @post acctInfo is returned 
    */    
    public acctInfo search(acctInfo name){
    }
    /** the method updates all the changes made by the 
     * staff to the database
    @post database is updated
    */    
    private void update(){
    }
}
