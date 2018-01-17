
/**
 * login is a GUI for customer/staff/guest to login to T2P
 */
public class login extends JFrame
{
   private static final int FRAME_WIDTH = 1200;
   private static final int FRAME_HEIGHT = 900;
   private JFrame frame;
   private JLabel userLabel;
   private JLabel passLabel;
   private JTextField username;
   private JTextField password;
   private JButton loginButton;
   private JButton registerButton;
   
   //constructor to set up login frame 
   //@pre all component has add into panel
   //@post a gui login will be created
   public login(){}

   /*method to add all component login need, arrange each component
   into proper order, and adding method(ActionListiner) into button
    @post return a panel with all component needed for login
    */       
   private JPanel panel(){}

  /*method allow user to login to T2P
   @pre user have account with T2P
   @post user successfully login with correct information or not.
   */
   class loginListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event){}

   }
   
    /* a method allow user to create a new account with T2P
    @pre user want to creat a new account has an account and password.
    @post a new frame singup pop out.
   */
   class registerListener implements ActionListener
   {
       public void actionPerformed(ActionEvent event){}  
   }
}