/**this class provide a GUI for users to checkout.*/

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class checkOutGUI {
	   private JLabel CardNumLabel;     //Initiate a label for card number
	   private JLabel ExpDateLabel;     //Initiate a label for expired date
	   private JLabel cvvLabel;         //Initiate a label for cvv number
	   private JLabel NameonCardLabel;//Initiate a label for name on card
	   private JLabel AddressLabel;	//Initiate a label for billing address
	   private JLabel zipLabel;		//Initiate a label for zip
	   private JPanel checkoutFrame;//Initiate a panel for checkout frame
	   public checkOutGUI(){
		   //default Constructor for guest to checkout
	   }
	   public checkOutGUI(acctInfo Info){
		   // a Constructor for existing customers to checkout
	   }
	   public JButton checkoutButton;/Initiate a button for checkout
	   public JButton backButton;// Initiate a button to back to book frame
	   
	   class checkoutListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
                /* listener that allows user to checkout
		* @pre: user enters proper checkout information
		* @pre: customers clicks on checkout button
		* @post checkout database is updated
		* @post checkout frame is killed, and customer frame is pop up
		 */
		      }
		    } 
	   class BacktListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		/* listener that allows user to back to book frame
		*  @post checkout frame is killed, and book frame is pop up
		*/
		      }
		    } 
}
