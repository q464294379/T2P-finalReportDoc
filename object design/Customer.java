/*The Customer class will pass the booking information to personal 
*information if customer clicks on checkout button,
* pass the redeeming information to personal information if
* customer clicks on redeem button, create a new account if 
 * customer login as guest and sign  up while booking*/
public class Customer extends acctInfo{
	private acctInof Info;          //indicate who is login
	private int points =0 ;         //initial points is 0
	private String Gift;		// selected gift
	private int code;		// Recommend code
	private int CardNum;		// card number
	private int ExpDate;		//expired date of card
	private int cvv;		//card's cvv number
	private String NameonCard;	// name on card
	private String Address;		//billing address
	private int zip;		//billing zip
	
	public Customer(acctInfo Info){
		this.Info = Info;
		/*
		 * This constructor will pass a personalInfo Object 
                 * to Customer class, which can indicate which customer is
		 * using t2p */
	}
	public Customer(){
		/* This constructor indicates a customer login as a guest*/
	}
	public void setCode (int code){
		//store recommend friends code
	}
	public void setPoints (){
		//store reward points
	}
	public void setGift (String Gift){
		//store selected gifts
	}
	public void setCardNum (int CardNum){
		//store card number
	}
	public void setExpDate (int ExpDate){
		//store expired date of card
	}
	public void setcvv (int cvv){
		//store cvv
	}
	public void setNameonCard (String NameonCard){
		//store name on card
	}
	public void setAddress (String Address){
		//store billing address
	}
	public void setzip (int zip){
		//store zip code
	}
	public int getCode (){
		//return code
	}
	public int getPoints (){
		//return return reward points
	}
	public String getGift (){
		//return Gift that selected
	}	
	public int getcardNum (){
		//return card number
	}
	public int getExpDate (){
		//return expired date
	}
	public int getcvv (){
		//return cvv
	}
	public String getNameonCard (){
		//return name on card
	}
	public String getAddress (){
		//return billing address
	}
	public int getzip (int zip){
		//return zip code
	}
	public void Send(){
	/*The Send() save the Recommend code into account information
	* pre: Customer(Info) (passing personal information as 
            *a parameter in constructor)
	* post: Recommend code is saved into customer information
	 * post: Send() will not be called again.
	* */
	}
	public void Checkout(){
	/*The Checkout() save all the booking information into the 
            *account information
	* pre: Customer(Info) (passing personal information as a 
            *parameter in constructor)
	* post: booking information is saved into customer information
	* post: rewardpoints are updated
	*/
	}
	public void confirm(){
		/*The confirm() save all the redeeming information into
                *the account information
		 * pre: Customer(Info) (passing personal information as 
                *a parameter in constructor)
		 * post: points and gifts is saved into customer information
		 */
	}
	public void signup(){
		/*The sign up create a new account object and save all the 
                 * booking information into the customer information
		 * pre: Customer(Info) (passing nothing in constructor and 
                    *sign up after booking)
		 * post: booking information is saved into customer information]
		 *	post :new acctInfo object is created
		 */
	}
	public void signout(){
		/* The sign out method deleting all the value that input by user
		 * pre : customer(Info)
		 * post:  initialize all the variable to default.
		 * */
	}
}
