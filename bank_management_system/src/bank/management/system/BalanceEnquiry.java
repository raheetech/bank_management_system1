
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
JButton back;
String pinnumber;
   BalanceEnquiry(String pinnumber)
   {
       this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
      back = new JButton("Back");
       back.setBounds(355,520,150,30);
       image.add(back);
       back.addActionListener(this);
           int balance  = 0;
        con c = new con();
           try
           {
               ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            
               while(rs.next())//use for looping row-- rs.next();
               {
                   if(rs.getString("type").equals("Deposit"))
                   {
                       balance += Integer.parseInt(rs.getString("amount"));
                       
                   }else
                       {
                       balance -= Integer.parseInt(rs.getString("amount"));
                       
                   }
               }
           }catch(Exception e)
           {
               System.out.println(e);
           }
           
           JLabel text = new JLabel("YOUR CURRENT ACCOUNT BALANCE IS RS " + balance);
          text.setBounds(170,300,400,30);
          text.setForeground(Color.WHITE);
        image.add(text);
        
        setLayout(null);
       setUndecorated(true);
       setSize(900,900);
       setLocation(300,0);
       setVisible(true);
      setDefaultCloseOperation(3);
   }
   public void actionPerformed(ActionEvent ae)
   {
        setVisible(false);
           new Transaction(pinnumber).setVisible(true);
   }
    public static void main(String args[]) {
        // TODO code application logic here
        new BalanceEnquiry("");
    }
}
