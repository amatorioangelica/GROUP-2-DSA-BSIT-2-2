package FoodDelivery;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class homePageActivity extends JFrame implements ActionListener{
    private JLabel lblTitle, lblSub;
    private JButton btnOrder, btnCustomer, btnTrack, btnAdmin;

    homePageActivity(){
        setTitle("Home Page");
        setSize(380, 360);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Labels
        lblTitle = new JLabel("Online Food Delivery System");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(50, 20, 300, 30);
        add(lblTitle);

        lblSub = new JLabel("Hungry? Order your food here!");
        lblSub.setBounds(80, 50, 250, 25);
        add(lblSub);

        //Buttons
        btnOrder = new JButton("Browse Menu and Order");
        btnOrder.setBounds(60, 95, 250, 40);
        add(btnOrder);

        btnCustomer = new JButton("Customer Account");
        btnCustomer.setBounds(60, 145, 250, 40);
        add(btnCustomer);

        btnTrack = new JButton("Track My Order");
        btnTrack.setBounds(60, 195, 250, 40);
        add(btnTrack);

        btnAdmin = new JButton("Admin Login");
        btnAdmin.setBounds(60, 255, 250, 40);
        add(btnAdmin);

        //Add to ActionListener
        btnOrder.addActionListener(this);
        btnCustomer.addActionListener(this);
        btnTrack.addActionListener(this);
        btnAdmin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnOrder){
            //Open the Browse Menu window
            browseMenuActivity browse = new browseMenuActivity();
            browse.setVisible(true);
        }else if(e.getSource() == btnCustomer){
            customerAccountActivity customer = new customerAccountActivity();
            customer.setVisible(true);
        }else if(e.getSource() == btnTrack){
            trackOrderActivity track = new trackOrderActivity();
            track.setVisible(true);
        }else if(e.getSource() == btnAdmin){
            adminLoginActivity login = new adminLoginActivity();
            login.setVisible(true);
        }
    }
}
