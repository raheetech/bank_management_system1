
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
  JButton login,signup,clear;
  JTextField cardTextField;
  JPasswordField pinTextField;
   Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);
        
         cardTextField = new JTextField();
        cardTextField.setBounds(300,158,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,400,40);
        add(pin);
        
        
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
         login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        
        
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
          clear = new JButton("CLEAR");
       clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
         signup = new JButton("SIGN UP");
       signup.setBounds(300,350,230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
      setLayout(null);
       setVisible(true);
       setSize(800,480);
       setLocation(350,200);
      setDefaultCloseOperation(3);
    }
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()== clear)
       {
           cardTextField.setText("");
           pinTextField.setText("");
           
       }
       else if(ae.getSource() == login)
       {
           con c = new con();
           String cardnumber = cardTextField.getText();
           String pinnumber = pinTextField.getText();
           String query = "Select * from login where cardnumber = '"+cardnumber +"' and pin = '"+pinnumber+"'";
           try
           {
               ResultSet rs = c.s.executeQuery(query);
               if(rs.next())
               {
                    setVisible(false);
           new Transaction(pinnumber).setVisible(true);
               }
               else
               {
                    JOptionPane.showMessageDialog(null,"Incorrect Cardnumber or Pin");
               }
           }catch(Exception e)
           {
               System.out.println(e);
           }
                  
           
       }
       else if(ae.getSource()== signup)
       {
           setVisible(false);
           new Signupone().setVisible(true);
       }
   }
    public static void main(String args[]) {
        // TODO code application logic here
        new Login();
    }
}
