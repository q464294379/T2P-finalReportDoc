

/*acctInfo provide an account, flight information and personal informaiton for
* a person
*/


public class acctInfo extends flightInfo
{
    
    private String userName;
    private String password;
    private String name;
    private String address;
    private String dateOfBirth;
    private char gender;
    private long phoneNumber;
    private String e_mail;
    private int agentNumber;
    
    //default constructor for acctInfo
    public acctInfo(){ }
    
    //constructor for a customer/staff: set username, password, phone number, and e-mail 
    public acctInfo(String uname, String pass, long p, String e){ }
    
    //constructor for a customer/staff: set username, password, and e-mail 
    public acctInfo(String uname, String pass, String e){ }
    
    //constructor for a customer/staff: set username, password, 
    // name.address,date of birth, gender,phone number, and e-mail 
    public acctInfo(String uname, String pass, String n, String a, 
            String d, char g, long p, String e){ }
   
    //set username for acctInfo
    public void setUserName(String u){ }
       
     //set password for acctInfo
    public void setPassword(String p){ }
    
    //set the name for acctInfo
    public void setName(String n){ }
    
    //set the  address forr acctInfo
    public void setAddress(String a){ }
    
    // set the date of birth for acctInfo
    public void setDateOfBirth(String d){ }
   
    // set the gender for acctInfo
    public void setGender(char g){ }
    
    // set the phone number for acctInfo
    public void setPhoneNumber(long p){ }
    
    //set the e-mail for acctInfo
    public void setE_mail(String e){ }
    
    //return the username for the acctInfo
    public String getUserName(){ }
    
    //return the password for the acctInfo
    public String getPassword(){ }
    
    //return name of the person for the acctInfo
    public String getName(){ }
    
    
    //return address of the person for the acctInfo
    public String getAddress(){ }
    
    //return date of birth of the person for the acctInfo
    public String getDOB(){ }
    
    //return gender of the person for the acctInfo
    public char getGender(){ }
    
    //@pre;the person need to have a phone numebr otherwise, it will return null.
     //return the phone number  for the acctInfo
    public long getPhoneNumber(){ }
   
    //return the e-mail  for the acctInfo
    public String getE_mail(){ }
    
    /*The sign up create a new account for customer who does not has account
     *@pre: customer enter proper username, password, phone number, and e-mail.
     * @post: customer register a new account with T2P
     */
    public void signup( String uname, String pass, long p, String e){}
	
    /*The sign up create a new account for customer who does not has account
     *@pre: customer enter proper username, password,  and e-mail.
     * @post: customer register a new account with T2P
     */
    public void signup( String uname, String pass,  String e){}
    
    /* The newPass change old password of user to a new password
        @pre customer need enter correct old password firs, then enter new 
        password and confirm new password,
        @poast customer set old password to new password
    */
    public void newPass(String newP, String confirmP){}   
    
    /*The validateUser check if person enter correct login information.
        @pre the pserson need have an account 
        @post return true if customer eneter correct informaiton then he is 
        login to T2P, otherwise, return false.
    */
    public boolean validateUser(String u, String p){}
}
