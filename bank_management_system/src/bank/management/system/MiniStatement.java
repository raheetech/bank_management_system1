
package bank.management.system;

import javax.swing.*;
import java.sql.*;
import java.awt.*;

public class MiniStatement extends JFrame {
  
    MiniStatement(String pinnumber)
    { 
         //this.pinnumber = pinnumber;
         
        setTitle("MiniStatement");
        
        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
          JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
          add(bank);
          
           JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
          add(card);
          
          JLabel balance = new JLabel();
          balance.setBounds(20,400,300,20);
          add(balance);
          
          try{
              con con = new con();
             ResultSet rs = con.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
             while(rs.next())
             {
                   card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12) );
                
                  
             
             }
          }catch(Exception e)
               {
                   System.out.println(e);
               }
          
           try{
              con conn = new con();
              int bal = 0;
             ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             while(rs.next())
             {
                 mini.setText(mini.getText() +  "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") +"<br><br> <html>");
                   if(rs.getString("type").equals("Deposit"))
                   {
                       bal += Integer.parseInt(rs.getString("amount"));
                       
                   }else
                       {
                       bal -= Integer.parseInt(rs.getString("amount"));
                       
                   }
             
             }
             balance.setText("YOUR CURRENT ACCOUNT BALANCE IS RS " + bal);
          }catch(Exception e)
               {
                   System.out.println(e);
               }
          
          
        
         setLayout(null);
       //setUndecorated(true);
       setSize(400,600);
       setLocation(20 ,20);
       getContentPane().setBackground(Color.WHITE);
       setVisible(true);
      setDefaultCloseOperation(3);
    
        
    }

    public static void main(String args[]) {
        // TODO code application logic here
        new MiniStatement("");
    }
}
