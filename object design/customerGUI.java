/* customerGUI creates a GUI or graphic user interface for the staff users. 
*It contains 5 tabs, which are Redeem, Recommend, SearchRound, SearchOne,
*Mytrips. each tab has a logout button for customers logout
 * */
public class customerGUI{
	final String Redeem;   		// name of redeem tab
	final String Recommend;		// name of Recommend tab
	final String SearchR;		// name of search round trip tab
	final String SearchO;		// name of search one-way tab
	final String MyTrip;		//name of my trip tab
	final JPanel RedeemTab;        //initiate a panel for Reedem
	final JPanel RecommendTab;	//initiate a panel for Recommend
	final JPanel SearchRTab;	//initiate a panel for SearchR
	final JPanel SearchOTab;	//initiate a panel for SearchO
	final JPanel MyTripTabs         // initiate a panel for MyTrips
	final JButton logout;		//intitiate a buuton for logout
	final JButton send;		//intitiate a button for sending  email
	final JButton confirm;		//intitiate a button for redeeming  gifts
	final JCheckBox giftsTable;	//creating a table with gifts
	final JLabel Email;		//initate a label for email
	public customerGUI(){
		/*This custructor will create a main frame for customer login
		 * @pre: customer is selected form the combo box in login frame
		 * @pre: login button is selected*
		 * @post: customer frame is created*/
	}
	public JPanel RedeemPanel(){
		/*This method will show the panel for of Redeem;
		 * @pre: customer is clicked on the redeem tab
		 * @post: return redeem panel
		 * */
	}
	public JPanel RecommendPanel (){
		/*This metahod will show the panel of Recommend
		 * @pre: cusomter os clicked on the Recommend tab
		 * @post : return recommend panel
		 * */
	}
	public Jpanel MyTripPanel (){
		/*This metahod will show the panel of myTrip
		 * @pre: cusomter os clicked on the Mytrip tab
		 * @post : retrun mytrip panel
		 * */
	}
	public Jpanel SearchR() {
		
	}
	public Jpanel SearchO (){
		
	}
	public void destroy(){
            /* listener that allows user to logout from the staff frame 
            * implements destroy method
	    @post cusomter frame is destoryed
	    */ 
	}
	 class sendListener implements ActionListener{
	      public void actionPerformed(ActionEvent e){
	    	/* listener that allows user to send recommend codes to friends
	    	* @pre: user enters proper email address
	  	@post Recommending database is updated
	  	*/
	      }
	    } 
	    class confirmListener implements ActionListener{
	      public void actionPerformed(ActionEvent e){
	   /* listener that allow user to select gifts
	    * @pre: users checks proper gifts
	    @post: Gifts database is updated.
	    */}
	    } 
	    
	    class signupListner implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	    /* listener that allow user to create a new account in data base
	    @post: user is taken to signup frame
	    */
	      }
	    } 
	    } 
}