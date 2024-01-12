package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static java.awt.Color.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField adhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    
    JComboBox category,religion,occupation,education,income;
    String formno;
 SignupTwo(String formno)
 {
     this.formno = formno;
    
     setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details " );
      additionalDetails.setBounds(290,80,400,30);
       additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(additionalDetails);
        
        
        JLabel name = new JLabel("Religion: " );
      name.setBounds(100,140,100,30);
       name.setFont(new Font("Raleway",Font.BOLD,20));
        add(name);
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
       religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(WHITE);
        add(religion);
      
        
        
        JLabel fname = new JLabel("Category:" );
      fname.setBounds(100,190,200,30);
       fname.setFont(new Font("Raleway",Font.BOLD,20));
        add(fname);
        
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
       category = new JComboBox(valcategory);
        category.setBackground(WHITE);
 
      category.setBounds(300,190,400,30);
         add( category);
        
        
        
        
        
        JLabel dob = new JLabel("Income: " );
      dob.setBounds(100,240,200,30);
       dob.setFont(new Font("Raleway",Font.BOLD,20));
        add(dob);
        
        String incomecategory[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto < 10,00,000"};
       income= new JComboBox(incomecategory);
        income.setBackground(WHITE);
 
      income.setBounds(300,240,400,30);
         add( income);
        
        
        JLabel gender = new JLabel("Education" );
      gender.setBounds(100,290,200,30);
       gender.setFont(new Font("Raleway",Font.BOLD,20));
        add(gender);
        
        
        
        JLabel email = new JLabel("Qualification: " );
      email.setBounds(100,315,200,30);
       email.setFont(new Font("Raleway",Font.BOLD,20));
        add(email);
        
       
        String educationvalue[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
       education= new JComboBox(educationvalue);
        education.setBackground(WHITE);
 
      education.setBounds(300,315,400,30);
         add( education);
         
        
        
         JLabel marital = new JLabel("Occupation: " );
      marital.setBounds(100,390,200,30);
       marital.setFont(new Font("Raleway",Font.BOLD,20));
        add(marital);
        
        String occupationvalue[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
       occupation= new JComboBox(occupationvalue);
        occupation.setBackground(WHITE);
 
      occupation.setBounds(300,390,400,30);
         add( occupation);
         
         
         
        
        
        JLabel address = new JLabel("PanNO: " );
      address.setBounds(100,440,200,30);
       address.setFont(new Font("Raleway",Font.BOLD,20));
        add(address);
        
       pan = new JTextField();
      pan.setBounds(300,440,400,30);
       pan.setFont(new Font("Raleway",Font.BOLD,14));
        add(pan);
        
        
        
        
        
        JLabel city = new JLabel("AdharNo: " );
      city.setBounds(100,490,200,30);
       city.setFont(new Font("Raleway",Font.BOLD,20));
        add(city);
        
        
       adhar = new JTextField();
      adhar.setBounds(300,490,400,30);
       adhar.setFont(new Font("Raleway",Font.BOLD,14));
        add(adhar);
        
        
        
        JLabel state = new JLabel("Senior Citizen: " );
      state.setBounds(100,540,200,30);
       state.setFont(new Font("Raleway",Font.BOLD,20));
        add(state);
        
        
            syes = new  JRadioButton("Yes");
          syes.setBounds(300,540,100,30);
          syes.setBackground(Color.WHITE);
        add( syes);
        
        
         sno = new  JRadioButton("No");
       sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
         
        
        
        JLabel pincode = new JLabel("Existing Account: " );
      pincode.setBounds(100,590,200,30);
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
        add(pincode);
        
       
        eyes = new  JRadioButton("Yes");
          eyes.setBounds(300,590,100,30);
          eyes.setBackground(Color.WHITE);
        add( eyes);
        
        
         eno = new  JRadioButton("No");
       eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
         next = new JButton("NEXT");
         
        next.setBounds(620,660,80,30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next); 
        
     getContentPane().setBackground(Color.WHITE);
      setLayout(null);
       setVisible(true);
       setSize(850,800);
       setLocation(350,10);
      setDefaultCloseOperation(3);
 }
   public void actionPerformed(ActionEvent ae)
   {
       
       String sreligion = (String)religion.getSelectedItem(); //take text out
       String scategory = (String)category.getSelectedItem();
        String sincome= (String) income.getSelectedItem(); //take text out
       String seducation= (String)education.getSelectedItem();
        String soccuppation = (String)occupation.getSelectedItem(); //take text out
      
       String seniorcitizen = null;
      
       if(syes.isSelected())
       {
           seniorcitizen = "Yes";
       }else if(sno.isSelected())
       {
           seniorcitizen = "No";
       }
       String existingaccount = null;
      
       if(eyes.isSelected())
       {
           existingaccount = "Yes";
       }else if(eno.isSelected())
       {
           existingaccount = "No";
       }
       String span= pan.getText();
       String sadhar = adhar.getText();
       
        
        try
        {
            if(span.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Pan No is Required");
            }
            else if(sadhar.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Adhar No is Required");
            }
           
            else
            {
                con c = new con();
                String query = "insert into signuptwo values('"+ formno +"','"+sreligion +"','"+scategory +"','"+sincome +"','"+seducation +"','"+soccuppation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+existingaccount+"')";                        
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
            
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
   }
    public static void main(String args[]) {
        
        new SignupTwo("");
    }
}