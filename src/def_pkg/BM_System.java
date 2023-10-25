/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package def_pkg;

/**
 *
 * @author Shahraiar Hossain
 */


import javax.swing.*;

public class BM_System {
	
	public static void main(String[] args) {
		JFrame frame=new JFrame(" Amar Bank Online ");
		frame.setIconImage(  new ImageIcon(System.getProperty("user.dir") + "\\src\\def_pkg\\ddot.png").getImage() );
		
		GUI interf = new GUI();
		Login_Account user = new Login_Account();
	        interf.openSignInForm(frame, user);
		frame.setSize(900,500);  
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
	}
}
