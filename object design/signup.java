

/**
 *singn up is a GUI for customer to register a new account
 */
public class signup extends JFrame
{
   private static final int FRAME_WIDTH = 1200;
   private static final int FRAME_HEIGHT = 900;
   private JFrame frame;
   private JLabel userLabel;
   private JLabel passLabel;
   private JLabel c_userLabel;
   private JLabel c_passLabel;
   private JLabel e_mailLabel;
   private JLabel phoneNumberLabel;
   private JLabel recommand_Friend_Code_Label;
   private JTextField username;
   private JTextField password;
   private JTextField c_username;
   private JTextField c_password;
   private JTextField e_mail;
   private JTextField phoneNumber;
   private JTextField recommand_Friend_Code;
   private JButton loginButton;
   private JButton signupButton;
    
   //constructor to set up signup frame 
   //@pre all component has add into panel
   //@post a gui login will be created
   public login(){}
   
    /*method to add all component for singup, arrange each component
   into proper order, and adding method(ActionListiner) into button
    @post return a panel with all component needed for siguup
    */       
    private JPanel panel(){}
   
     /* a method allow user to create a new account with T2P
    @pre  user want to creat a new account ,and  user need enter
    correct information required for singup.
    @post user create an account with T2P or cancel it
   */
   class signupListener implements ActionListener
   {
       public void actionPerformed(ActionEvent event){}  
   }
   
   /* method allow user back to login page
    @post user back to login page
   */
   class back implements ActionListener
   {
       public void actionPerformed(ActionEvent event){}  
   }
}
