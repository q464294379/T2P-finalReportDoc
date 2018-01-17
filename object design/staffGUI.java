/**
 * staffGUI creates a GUI or graphic user interface for the staff 
 * users. It contains five tabs including  staff detail, flight information, 
 * customer information, changes and messages.each tab has a logout button that
 * can logout the staff out. 
 */
public class staffGUI {
    /** 
    * initiate a string for the name of the staff detail tab
    */
    final String staffDetail;
    /** 
    * initiate a string for the name of the flight information tab
    */
    final String flightInfo;
   /** 
    * initiate a string for the name of the customer information tab
    */
    final String customerInfo;
   /** 
    * initiate a string for the name of the change tab
    */
    final String changes;
   /** 
    * initiate a string for the name of the message tab
    */
    final String messages;
    /** 
    * initiate a panel for the staff detail
    */
    final JPanel staffDetailTab;
    /** 
    * initiate a panel for the flight information
    */
    final JPanel flightInfoTab;
    /** 
    * initiate a panel for the customer information
    */
    final JPanel customerInfoTab;
    /** 
    * initiate a panel for the changes
    */
    final JPanel changesTab;
    /** 
    * initiate a panel for the messages
    */
    final JPanel messagesTab;
    /** 
    * initiate a button for logout
    */
    final JButton logout;
    /** 
    * initiate a button for booking history
    */
    final JButton bookingHistory;
    /** 
    * initiate a button for delete
    */
    final JButton delete;
    /** 
    * initiate a button for submit
    */
    final JButton submit;
    /** 
    * initiate a text field for agent number
    */
    final JTextField agentNumField;
    /** 
    * initiate a text field for name
    */
    final JTextField nameField;
    /** 
    * initiate a text field for address
    */
    final JTextField addressField;
    /** 
    * initiate a text field for zip code
    */
    final JTextField zipField;
    /** 
    * initiate a text field for city
    */
    final JTextField cityField;
    /** 
    * initiate a text field for state
    */
    final JTextField stateField;
    /** 
    * initiate a text field for country
    */
    final JTextField countryField;
    /** 
    * initiate a text field for phone number
    */
    final JTextField phoneNumField;
    /** 
    * initiate a text field for E-mail
    */
    final JTextField emailField;
    /** 
    * initiate a label with agent number
    */
    final JLabel agentNumLabel;
    /** 
    * initiate a label with name
    */
    final JLabel nameLabel;
    /** 
    * initiate a label with address
    */
    final JLabel addressLabel;
    /** 
    * initiate a label with zip code
    */
    final JLabel zipLabel;
    /** 
    * initiate a label with city 
    */
    final JLabel cityLabel;
    /** 
    * initiate a label with state
    */
    final JLabel stateLabel;
    /** 
    * initiate a label with country
    */
    final JLabel countryLabel;
    /** 
    * initiate a label with phone number
    */
    final JLabel phoneNumLabel;
    /** 
    * initiate a label with E-mail
    */
    final JLabel emailLabel;
    /** 
    * initiate a radio button for region including domestic and international
    */   
    final JRadioButton region;
    /** 
    * initiate a radio button for type of trip including round trip or one way
    */  
    final JRadioButton typeOfTrip;
    /** 
    * initiate a combo box all the contracted airline
    */  
    final JComboBox airline;
    /** 
    * initiate a combo box all the possible locations
    */  
    final JComboBox location;
    /** 
    * initiate a check box for all the messages from the database
    */  
    final JCheckBox messages;
    /** 
    * creating a table for the messages
    */  
    final JTable messagesTable;
    /** 
    * creating a table with all the flight information
    */  
    final JTable flightTable;
    /** method that creates the main frame for staff
    @pre  staff is selected from the combo box in login frame
    @pre  login button is selected
    @post staff frame is created
    */
    public void StaffMainFrame(){}
    /** method that creates a panel for the StaffInfo tab 
     * including multiple labels 
       and a logout button.
    @post returns a panel that contains all proper components
    */
    private JPanel tab1(){}
    /** method that creates a panel for the flightInfo tab 
     * including multiple labels
    table contains flight information and a logout button.
    @post returns a panel that contains all proper components
    */
    private JPanel tab2(){}
    /** method that creates a panel for the customerInfo 
     * tab including multiple labels
       and a logout button.
    @post returns a panel that contains all proper components
    */
    private JPanel tab3(){}
    /** method that creates a panel for the change tab
     * including multiple textfields,
    comboBoxes, labels, a submit button and a logout button.
    @post returns a panel that contains all proper components
    */
    private JPanel tab4(){}
    /** method that creates a panel for the message tab 
     * including a table of messages,
       delete button and logout button
    @post returns a panel that contains all proper components
    */
    private JPanel tab5(){}
    /** method that destroys the staff frame
    @pre  logout button is selected
    @post staff main frame is destroyed
    */
    private void destroy(){}
    /* listener that allows user to logout from the staff frame
    implements destroy method
    @post staff frame is destoryed
    */ 
    class logoutListener implements ActionListener{
      public void actionPerformed(ActionEvent e){}
    } 
    /** listener that allows user to delete selected messages 
     * from the database
    @post database is updated
    @post messages are deleted
    */
    class deleteListener implements ActionListener{
      public void actionPerformed(ActionEvent e){}
    } 
    /** listener that allow new pop-up to show
    @post booking history pop-up is visible.
    */
    class bookingHistoryListener implements ActionListener{
      public void actionPerformed(ActionEvent e){}
    } 
    /** listener that allow user to submit the changes to the database
    @post database is updated
    */
    class submitListener implements ActionListener{
      public void actionPerformed(ActionEvent e){}
    } 
}
