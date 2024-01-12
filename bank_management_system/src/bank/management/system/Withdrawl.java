package bank.management.system;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Withdrawl extends JFrame implements ActionListener {
 JTextField amount;
 JButton withdraw ,back;
 String pinnumber;
   Withdrawl( String pinnumber){
       this.pinnumber = pinnumber;
       
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
       
       JLabel text = new JLabel("Enter the amount you want to Withdraw");
       text.setForeground(Color.WHITE);
       text.setFont(new Font("System",Font.BOLD,16));
       text.setBounds(170,300 ,400 , 20);
       image.add(text);
       
       amount = new JTextField();
       amount.setFont(new Font("Raleway",Font.BOLD,22));
       amount.setBounds(170,350 ,320 , 25);
       image.add(amount);
       
      withdraw = new JButton("Withdraw");
       withdraw.setBounds(355,485,150,30);
      withdraw.addActionListener(this);
       image.add(withdraw);
       
        back = new JButton("Back");
       back.setBounds(355,520,150,30);
       image.add(back);
       back.addActionListener(this);
       
        setLayout(null);
       setUndecorated(true);
       setSize(900,900);
       setLocation(300,0);
       setVisible(true);
      setDefaultCloseOperation(3);
       
   }
   public void actionPerformed(ActionEvent ae)
   {
       if( ae.getSource() == withdraw)
       {
           String number = amount.getText();
           Date date = new Date();
           if(number.equals(""))
           {
               JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
               
           }else
           {
               try
               {
               con conn = new con();
               String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
               conn.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Rs " + number+" withdraw Successfully");
                setVisible(false);
                 new Transaction(pinnumber).setVisible(true);
               }
               catch(Exception e)
               {
                   System.out.println(e);
               }
     
           }
           
       }else if(ae.getSource() == back)
       {
           setVisible(false);
           new Transaction(pinnumber).setVisible(true);
       }
       
   }
    public static void main(String args[]) {
        // TODO code application logic here
        new Withdrawl("");
    }
}
