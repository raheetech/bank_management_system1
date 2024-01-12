
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno)
    {
        this.formno = formno;
        JLabel l1 = new JLabel("Page 3: Account Details");
       l1.setBounds(280,40,400,40);
       l1.setFont(new Font("Raleway",Font.BOLD,22));
        add(l1);
        
        
         JLabel type = new JLabel("Account Type");
       type.setBounds(100,140,400,30);
       type.setFont(new Font("Raleway",Font.BOLD,22));
        add(type);
        
        r1 = new JRadioButton("Saving Account");
          r1.setBounds(100,180,150,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
         
        r2 = new JRadioButton("Fixed Deposit Account");
          r2.setBounds(350,180,150,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        
         
        r3 = new JRadioButton("Current Account");
          r3.setBounds(100,220,150,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
         
        r4 = new JRadioButton("Recurring Deposit Account");
          r4.setBounds(350,220,150,22);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
         groupaccount.add(r2);
          groupaccount.add(r3);
           groupaccount.add(r4);
           
           
           
            JLabel card = new JLabel("Card Number:");
       card.setBounds(100,300,200,30);
       card.setFont(new Font("Raleway",Font.BOLD,22));
        add(card);
        
      
        
         
            JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
       number.setBounds(330,300,300,30);
       number.setFont(new Font("Raleway",Font.BOLD,22));
        add(number);
        
        
            JLabel p1number = new JLabel("Your 16 Digit Card Number");
       p1number.setBounds(100,330,300,20);
       p1number.setFont(new Font("Raleway",Font.BOLD,12));
        add(p1number);
        
            JLabel pin = new JLabel("Pin:");
      pin.setBounds(100,370,200,30);
       pin.setFont(new Font("Raleway",Font.BOLD,22));
        add(pin);
        
      JLabel p11number = new JLabel("Your 4 Digit Pin");
       p11number.setBounds(100,400,300,20);
       p11number.setFont(new Font("Raleway",Font.BOLD,12));
        add(p11number);
        
         
            JLabel pnumber = new JLabel("XXXX");
       pnumber.setBounds(330,370,300,30);
       pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        add(pnumber);
        
        
        JLabel services = new JLabel("Service Required:");
      services.setBounds(100,450,200,30);
       services.setFont(new Font("Raleway",Font.BOLD,22));
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
       c1.setBounds(100,500,200,30);
       c1.setFont(new Font("Raleway",Font.BOLD,16));
        add(c1);
        
           c2 = new JCheckBox("Internet Banking");
       c2.setBounds(350,500,200,30);
       c2.setFont(new Font("Raleway",Font.BOLD,16));
        add(c2);
        
           c3 = new JCheckBox("Mobile Banking");
       c3.setBounds(100,550,200,30);
       c3.setFont(new Font("Raleway",Font.BOLD,16));
        add(c3);
        
           c4 = new JCheckBox("EMAIL & SMS Alerts");
       c4.setBounds(350,550,200,30);
       c4.setFont(new Font("Raleway",Font.BOLD,16));
        add(c4);
        
           c5 = new JCheckBox("Check Book");
       c5.setBounds(100,600,200,30);
       c5.setFont(new Font("Raleway",Font.BOLD,16));
        add(c5);
        
           c6 = new JCheckBox("E-Statement");
       c6.setBounds(350,600,200,30);
       c6.setFont(new Font("Raleway",Font.BOLD,16));
        add(c6);
        
           c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
       c7.setBounds(100,680,600,30);
       c7.setFont(new Font("Raleway",Font.BOLD,12));
        add(c7);
          
        
                
                  submit = new JButton("Submit");
       submit.setBounds(250,720,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
       
        submit.addActionListener(this);
        add(submit);
        
         cancel = new JButton("Cancel");
       cancel.setBounds(420,720,100,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
       cancel.addActionListener(this);
        add(cancel);
                
         getContentPane().setBackground(Color.WHITE);
      setLayout(null);
       setVisible(true);
       setSize(850,820);
       setLocation(350,0);
      setDefaultCloseOperation(3);
    }
    
    public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()== submit)
       {
          String accountType = null;
          if(r1.isSelected())
          {
              accountType = "Saving Account";
          } else if(r2.isSelected())
          {
              accountType = "Fixed Deposit Account";
          } else if(r3.isSelected())
          {
              accountType = "Current Account";
          }else if(r4.isSelected())
          {
               accountType = "Recurring Deposit Account";
          }
          Random random = new Random();
         String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
           String pin = "" + Math.abs((random.nextLong() % 9000L) + 1000L); 
           
           String facility = "";
           if(c1.isSelected())
          {
              facility = facility + "ATM Card" ;
          } else  if(c2.isSelected())
          {
              facility = facility + "Internet Banking";
          } else  if(c3.isSelected())
          {
              facility = facility + "Mobile Banking" ;
          } else  if(c4.isSelected())
          {
              facility = facility + "EMAIL & SMS Alerts" ;
          } else  if(c5.isSelected())
          {
              facility = facility + "Check Book" ;
          } else  if(c6.isSelected())
          {
              facility = facility + "E-Statement";
          } else  if(c7.isSelected())
          {
              facility = facility + "ATM Card" ;
          } 
           try
        {
            if(accountType.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Account Type is Required");
            }
            else
            {
                con conn = new con();
                String query1 = "insert into signupthree values('"+formno +"','"+accountType +"','"+cardnumber +"','"+pin +"','"+facility +"')";                         
                String query2 = "insert into login values('"+formno +"','"+cardnumber +"','"+pin +"')";
                
                conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
                 //setVisible(false);
           //new SignupTwo(formno).setVisible(true);
               JOptionPane.showMessageDialog(null,"Card Number" + " " + cardnumber + "\n Pin" + " " + pin);
            
               setVisible(false);
            new Deposit(pin).setVisible(false);
            
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
           
       }else if(ae.getSource() == cancel)
       {
           setVisible(false);
           
           new Login().setVisible(true);
       }
      
       
   }
    public static void main(String args[]) {
        // TODO code application logic here
        new SignupThree("");
    }
}
